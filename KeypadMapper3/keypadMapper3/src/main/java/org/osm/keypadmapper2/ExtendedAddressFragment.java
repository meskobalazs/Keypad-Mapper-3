package org.osm.keypadmapper2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import de.enaikoon.android.keypadmapper3.KeypadMapperApplication;
import de.enaikoon.android.keypadmapper3.R;
import de.enaikoon.android.keypadmapper3.domain.Address;
import de.enaikoon.android.keypadmapper3.domain.Mapper;
import de.enaikoon.android.library.resources.locale.Localizer;

public class ExtendedAddressFragment extends Fragment implements OnFocusChangeListener {

    private EditText textInputHousenumber;

    private EditText textInputHousename;

    private EditText textInputStreet;

    private EditText textInputPostcode;

    private EditText textInputCity;

    private EditText textInputCountry;

    private AddressInterface addressCallback;
    
    private Mapper mapper = KeypadMapperApplication.getInstance().getMapper();

    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            saveChanges();
            addressCallback.extendedAddressActive();
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };

    private Address address;

    private TextWatcher housenumberWatcher = new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            if (address == null)
                return;
            textInputHousenumber.removeTextChangedListener(housenumberWatcher);
            addressCallback.onHousenumberChanged(s.toString());
            address.setNumber(s.toString());
            mapper.setCurrentAddress(address);
            textInputHousenumber.addTextChangedListener(housenumberWatcher);
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            addressCallback = (AddressInterface) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "must implement AddressInterface");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.extended_address_fragment, container, false);
         
        textInputHousenumber = (EditText) view.findViewById(R.id.input_housenumber);
        
        textInputHousename = (EditText) view.findViewById(R.id.input_housename);
        textInputHousename.setOnFocusChangeListener(this);

        textInputStreet = (EditText) view.findViewById(R.id.input_street);
        textInputStreet.setOnFocusChangeListener(this);

        textInputPostcode = (EditText) view.findViewById(R.id.input_postcode);
        textInputPostcode.setOnFocusChangeListener(this);

        textInputCity = (EditText) view.findViewById(R.id.input_city);
        textInputCity.setOnFocusChangeListener(this);

        textInputCountry = (EditText) view.findViewById(R.id.input_country);
        textInputCountry.setOnFocusChangeListener(this);

        updateResources(view);
        
        view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                addressCallback.extendedAddressActive();
            }
        });
        
        return view;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * android.view.View.OnFocusChangeListener#onFocusChange(android.view.View,
     * boolean)
     */
    @Override
    public void onFocusChange(View view, boolean focused) {
        if (focused) {
            addressCallback.extendedAddressActive();
        }

    }
    @Override
    public void onStop() {
        super.onStop();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(textInputHousenumber.getApplicationWindowToken(), 0);
    }
    
    @Override
    public void onPause() {
        super.onPause();
        
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(textInputHousenumber.getApplicationWindowToken(), 0);
    }

    @Override
    public void onResume() {
        super.onResume();
        updatedAddress();
    }

    public void saveChanges() {
        address = mapper.getCurrentAddress();
        address.setNumber(textInputHousenumber.getText().toString());
        address.setHousename(textInputHousename.getText().toString());
        address.setStreet(textInputStreet.getText().toString());
        address.setPostcode(textInputPostcode.getText().toString());
        address.setCity(textInputCity.getText().toString());
        address.setCountryCode(textInputCountry.getText().toString());
        mapper.setCurrentAddress(address);
    }

    public void updatedAddress() {
        removeTextWatchers();
        address = mapper.getCurrentAddress();
        textInputHousenumber.setText(address.getNumber());
        textInputHousename.setText(address.getHousename());
        textInputStreet.setText(address.getStreet());
        textInputPostcode.setText(address.getPostcode());
        textInputCity.setText(address.getCity());
        textInputCountry.setText(address.getCountryCode());
        addTextWatchers();
    }
    
    private void removeTextWatchers() {
        textInputHousenumber.removeTextChangedListener(housenumberWatcher);
        textInputHousename.removeTextChangedListener(textWatcher);
        textInputStreet.removeTextChangedListener(textWatcher);
        textInputPostcode.removeTextChangedListener(textWatcher);
        textInputCity.removeTextChangedListener(textWatcher);
        textInputCountry.removeTextChangedListener(textWatcher);
    }
    
    private void addTextWatchers() {
        textInputHousenumber.addTextChangedListener(housenumberWatcher);
        textInputHousename.addTextChangedListener(textWatcher);
        textInputStreet.addTextChangedListener(textWatcher);
        textInputPostcode.addTextChangedListener(textWatcher);
        textInputCity.addTextChangedListener(textWatcher);
        textInputCountry.addTextChangedListener(textWatcher);
    }

    public void updateHouseNumber(String number) {
        if (!textInputHousenumber.isFocused()) {
            updatedAddress();
        }
    }

    private void updateResources(View view) {
        Localizer localizer = KeypadMapperApplication.getInstance().getLocalizer();
        ((TextView) view.findViewById(R.id.input_desc_housenumber)).setHint(localizer
                .getString("Housenumber"));
        ((TextView) view.findViewById(R.id.input_desc_housename)).setHint(localizer
                .getString("Housename"));
        ((TextView) view.findViewById(R.id.input_desc_street)).setHint(localizer
                .getString("Street"));
        ((TextView) view.findViewById(R.id.input_desc_postcode)).setHint(localizer
                .getString("Postcode"));
        ((TextView) view.findViewById(R.id.input_desc_city)).setHint(localizer.getString("City"));
        ((TextView) view.findViewById(R.id.input_desc_country)).setHint(localizer
                .getString("Countrycode"));

        if (view.getResources().getBoolean(R.bool.is_tablet)) {
            textInputHousenumber.setVisibility(View.GONE);
            ((TextView) view.findViewById(R.id.input_desc_housenumber)).setVisibility(View.GONE);
        } else {
            textInputHousenumber.setVisibility(View.VISIBLE);
            ((TextView) view.findViewById(R.id.input_desc_housenumber)).setVisibility(View.VISIBLE);
        }
    }

}
