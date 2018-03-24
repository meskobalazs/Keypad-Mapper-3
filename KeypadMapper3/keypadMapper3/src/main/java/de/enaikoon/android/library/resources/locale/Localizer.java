/**************************************************************************
 * Copyright
 *
 * $Id: Localizer.java 2 2012-12-07 08:13:11Z jvilya $
 * $HeadURL: https://brainymobility.unfuddle.com/svn/brainymobility_enaikoon/trunk/keypadmapper3/src/de/enaikoon/android/keypadmapper3/locale/Localizer.java $
 **************************************************************************/

package de.enaikoon.android.library.resources.locale;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import de.enaikoon.android.library.resources.utils.NinePatchChunk;

/**
 * Entry point for saving remote resources and retrieving saved resources.<BR>
 * If locale provider is not set then system locale is used (via
 * <code>System.getProperty("user.language");</code>)
 */
public class Localizer {

    public interface LocaleProvider {
        String getLocale();
    }

    private static final String STORAGE_FILE_NAME = "resources";

    public SharedPreferences storage;

    private Context context;

    private LocaleProvider localeProvider = null;

    private String languagesCodeResourceName;

    private String densityDpi = null;

    private static final String TAG = "Localizer";

    public Localizer(Context context) {
        storage =
                context.getApplicationContext().getSharedPreferences(STORAGE_FILE_NAME,
                        Context.MODE_PRIVATE);
        this.context = context;
        densityDpi = getDensityDpi();
    }

    public Localizer(Context context, String languagesCodeResourceName, LocaleProvider localeProvider) {
        this(context);
        this.localeProvider = localeProvider;
        fillLanguagesCodeResourceName(languagesCodeResourceName);
    }

    /**
     * Returns 9-patch localized image. This method use locale that is provided
     * by locale provider or system settings.<br/>
     * <b>This image should be compiled.</b>
     * 
     * @param name
     * @return
     */
    public Drawable get9PatchDrawable(String name) {
        return get9PatchDrawable(name, getLocale());
    }

    /**
     * Returns 9-patch localized image<br/>
     * <b>This image should be compiled.</b>
     * 
     * @param name
     * @param locale
     * @return
     */
    public Drawable get9PatchDrawable(String name, String locale) {
        File imageFile =
                new File(context.getFilesDir() + "/" + locale + "_" + densityDpi + "_" + name);
        if (!imageFile.exists()) {
            imageFile = new File(context.getFilesDir() + "/" + locale + "_" + name);
        }
        Drawable image = null;
        if (imageFile.exists() && imageFile.isFile()) {
            Resources res = context.getResources();
            try {
                InputStream stream = new FileInputStream(imageFile);
                Bitmap bitmap = BitmapFactory.decodeStream(stream);
                if (bitmap != null) {
                    byte[] chunk = bitmap.getNinePatchChunk();
                    boolean result = NinePatch.isNinePatchChunk(chunk);
                    NinePatchChunk npc = NinePatchChunk.deserialize(chunk);
                    image = new NinePatchDrawable(res, bitmap, chunk, npc.mPaddings, null);
                }
            } catch (IOException e) {
                Log.w(TAG,
                        "Failed to open 9-patch image: " + imageFile.getName() + ". Error: "
                                + e.getMessage());
            }
        }
        if (image == null) {
            int id =
                    context.getResources()
                            .getIdentifier(name, "drawable", context.getPackageName());
            if (id != 0) {
                image = context.getResources().getDrawable(id);
            }
        }
        return image;
    }

    /**
     * Returns localized image
     * 
     * @param name image name
     * @return Drawable image
     */
    public Drawable getDrawable(String name) {
        String locale = getLocale();
        File imageFile =
                new File(context.getFilesDir() + "/" + locale + "_" + densityDpi + "_" + name);
        if (!imageFile.exists()) {
            imageFile = new File(context.getFilesDir() + "/" + locale + "_" + name);
        }
        Drawable image = null;
        if (imageFile.exists() && imageFile.isFile()) {
            // Drawable image =
            // Drawable.createFromPath(imageFile.getAbsolutePath());
            Bitmap bmp = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
            if (bmp != null) {
                DisplayMetrics dm = context.getResources().getDisplayMetrics();
                bmp.setDensity(dm.densityDpi);
                image = new BitmapDrawable(context.getResources(), bmp);
            }
        }
        if (image == null) {
            int id =
                    context.getResources()
                            .getIdentifier(name, "drawable", context.getPackageName());
            if (id != 0) {
                image = context.getResources().getDrawable(id);
            }

        }
        return image;
    }

    /**
     * Returns localized text resource
     *
     * @param name string key name
     * @return localized message
     */
    public String getString(String name) {
        String locale = getLocale();
        String text = storage.getString(locale + "_" + name, null);
        if (text != null && !text.equals("")) {
        	if (text.contains("&lt;") || text.contains("&gt;"))
        	{
        		text = Html.fromHtml(text).toString();
        	}
        	
        	text = text.replace("\\'", "\'").replace("\\u0020", " ").replace("\\n", "\n");
        	
            return text;
        } else {
            int id = context.getResources().getIdentifier(name, "string", context.getPackageName());
            if (id == 0) {
                return null;
            }
            return context.getString(id);
        }
    }

    /**
     * Returns the array of String. String should be delimited by ",".
     * 
     * @param name string key name
     * @return array of the strings
     */
    public String[] getStringArray(String name) {
        String locale = getLocale();
        String text = getString(name, locale);
        if (text != null) {
            return text.split(",");
        } else {
            return new String[0];
        }
    }

    private String getDensityDpi() {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(metrics);
        switch (metrics.densityDpi) {
        case DisplayMetrics.DENSITY_LOW:
            return "ldpi";
        case DisplayMetrics.DENSITY_MEDIUM:
            return "mdpi";
        case DisplayMetrics.DENSITY_HIGH:
            return "hdpi";
        case DisplayMetrics.DENSITY_XHIGH:
            return "xhdpi";
        default:
            return "";
        }
    }

    private void fillLanguagesCodeResourceName(String languagesCodeResourceName) {
        if (context.getResources().getIdentifier(languagesCodeResourceName, "string",
                context.getPackageName()) == 0) {
            throw new IllegalArgumentException("Specified resource is not found");
        }
        this.languagesCodeResourceName = languagesCodeResourceName;
    }

    private String getLocale() {
        if (localeProvider == null) {
            return System.getProperty("user.language");
        } else {
            return localeProvider.getLocale();
        }
    }
    
    public String getString(String name, String locale, Object... formatArgs) {
    	if (locale==null)
    	{
    		locale=getLocale();
    	}
    	
        String text = storage.getString(locale + "_" + name, null);
        if (text != null && !text.equals("")) {
        	String formattedText = String.format(text,formatArgs); 
        	if (formattedText.contains("&lt;") || formattedText.contains("&gt;"))
        	{
        		formattedText = Html.fromHtml(formattedText).toString();
        	}
        	
        	formattedText = formattedText.replace("\\'", "\'").replace("\\u0020", " ").replace("\\n", "\n");
        	
            return formattedText;
        } else {
            int id = context.getResources().getIdentifier(name, "string", context.getPackageName());
            if (id == 0) {
                return null;
            }
            
            text = context.getString(id);
            
            return String.format(text,formatArgs);
        }
    }    

}
