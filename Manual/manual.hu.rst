Keypad-Mapper 3 felhasználói kézikönyv
######################################

.. image:: images/banner.png
   :align: center

A **Keypad-Mapper 3** egy Android alkalmazás kifejezetten a házszámok és
cím csomópontok gyors feltérképezéséhez. GPS koordinátákkal ellátott fényképek
és hangjegyzetek szintén támogatottak. Az alkalmazás az összes begyűjtött
adatot egy *Keypad-Mapper 3* nevű mappában tárolja az Android eszköz
gyökérkönyvtárában, így nagyon egyszerű átmásolni az adatokat az eszközről a
számítógépre, hogy fel lehessen dolgozni azokat az olyan szerkesztőkben, mint
például a JOSM_ (Java OpenStreetMap Editor).

.. _JOSM: https://josm.openstreetmap.de/


Gyors kezdés
============

1. `Keressen egy területet <http://tools.geofabrik.de/osmi/?view=addresses>`_,
   ahol a házszámok hiányoznak, és menjen oda.
2. Indítsa el az alkalmazást, és kapcsolja be a GPS-t. Csak akkor lehetséges a
   házszámok és a cím csomópontok mentése, ha megbízható GPS jel és
   pozícióinformáció érhető el, egyébként hibaüzenet fog megjelenni.
3. Érintse meg az alkalmazás ikonját a bal felső sarokban, majd válassza a
   *Billentyűzet* menüpontot, vagy pöccintsen a billentyűzet képernyőre.
4. Menjen arra a helyre, ahol egy házszámot vagy egy cím csomópontot szeretne
   rögzíteni. Győződjön meg arról, hogy a ház pontosan öntől jobbra, balra
   vagy ön előtt legyen. Egyébként később nehéz lesz hozzárendelni a házszám
   csomópontot a megfelelő épülethez az OSM szerkesztőben.
5. Írja be a házszámot a billentyűzeten.
6. Mentse el a házszámot a |icon-left| |icon-front| |icon-right| gombok
   egyikének megérintésével. A GPS koordináta a cím csomóponttal együtt kerül
   mentésre, amely az ikonok megérintésének pillanatában lesz rögzítve. 

   - |icon-left| azt jelenti, hogy a házszám öntől balra van a gyaloglás
     irányához képest.
   - |icon-right| azt jelenti, hogy a házszám öntől jobbra van a gyaloglás
     irányához képest.
   - |icon-front| azt jelenti, hogy a házszám ön előtt van a gyaloglás
     irányához képest, például egy T-elágazásban.

7. Fénykép készítéséhez érintse meg a fényképező ikont a menüsávon. Ez meg
   fogja nyitni az eszköz kameráját a fénykép készítéséhez.
8. Hangjegyzet létrehozásához érintse meg a hangszóró ikont a menüsávon. Ez
   meg fog nyitni egy kis felületi elemet egy rögzítés és egy lejátszás
   gombbal. Érintse meg a rögzítés gombot, és kezdjen beszélni.
9. Ha befejezte a házszámok feltérképezését, egyszerűen zárja be az
   alkalmazást. A begyűjtött adatok a *Keypad-Mapper 3* mappában vannak
   eltárolva az eszközön.

.. |icon-left| image:: images/icon-left.png
.. |icon-front| image:: images/icon-front.png
.. |icon-right| image:: images/icon-right.png


Rendszerkövetelmények
=====================

Az összes Android verzió támogatott a 2.1-es verziótól kezdve. A
képernyő-elrendezés minden képernyőmérethez optimalizálva van.

A legújabb verzió a `releases lapról
<https://github.com/meskobalazs/Keypad-Mapper-3/releases>`_ tölthető le.


Használat
=========

A **Keypad-Mapper 3** egy hatékony eszköz házszámok és egyéb objektumok
rögzítéséhez, valamint fényképek és hangjegyzetek készítéséhez. Ez a kézikönyv
az alkalmazás fő funkcióit mutatja be.

.. note::

   Az alkalmazás használatához a GPS engedélyezése szükséges. Aktív és pontos
   GPS jel nélkül nem lehetséges semmilyen házszám rögzítése vagy fénykép
   készítése.


Funkciók
========

Az alkalmazás főmenüje a ház ikonon keresztül érhető el a bal felső sarokban.
A legfontosabb menüpontok a menüsávban is megjelennek.

.. image:: images/menu.en.png

Ez a menüpontok áttekintő táblázata. Ha egy menüpont ki van választva, akkor
ragyogó kiemelést fog kapni.

+-----------+----------------------------------------------------------------+
||app|      | Ez a fő alkalmazásikon, és megnyitja a menüt.                  |
+-----------+----------------------------------------------------------------+
||keypad|   | A billentyűzet megnyitása a házszámok feltérképezéséhez.       |
+-----------+----------------------------------------------------------------+
||address|  | A címszerkesztő megnyitása az utca, az irányítószám, a         |
|           | település és az országkód megadásához.                         |
+-----------+----------------------------------------------------------------+
||share|    | A rögzített adatok megosztása Bluetooth-on, e-mailben vagy     |
|           | Wi-Fi-n keresztül.                                             |
+-----------+----------------------------------------------------------------+
||undo|     | Az utoljára hozzáadott házszám eltávolítása.                   |
+-----------+----------------------------------------------------------------+
||freeze|   | A GPS pozíció befagyasztása.                                   |
+-----------+----------------------------------------------------------------+
||satellite|| A műholdak számának és a számított pontosság megjelenítése.    |
+-----------+----------------------------------------------------------------+
||camera|   | A kamera megnyitása egy fénykép készítéséhez.                  |
+-----------+----------------------------------------------------------------+
||record|   | A jelenlegi nyomvonal rögzítésének indítása vagy leállítása.   |
+-----------+----------------------------------------------------------------+
||audio|    | A hangrögzítő megnyitása egy hangjegyzet létrehozásához.       |
+-----------+----------------------------------------------------------------+
||settings| | A beállítások képernyő megnyitása az alkalmazás beállításához. |
+-----------+----------------------------------------------------------------+

.. |app| image:: images/icon-app.png
.. |keypad| image:: images/icon-keypad.png
.. |address| image:: images/icon-address-editor.png
.. |share| image:: images/icon-share.png
.. |undo| image:: images/icon-undo-active.png
.. |freeze| image:: images/icon-freeze.png
.. |satellite| image:: images/icon-satellite.png
.. |camera| image:: images/icon-camera.png
.. |record| image:: images/icon-record-start.png
.. |audio| image:: images/icon-audio.png
.. |settings| image:: images/icon-settings.png


Billentyűzet
------------

A billentyűzet a leggyakrabban használt funkció. Ezen a képernyőn rögzíthetők
a házszámok.

.. image:: images/keypad.en.png

A képernyő-elrendezés optimalizálva van az összes képernyőmérethez. A 7"-10"
közötti képernyővel rendelkező táblagépeknél nemcsak a billentyűzet látható,
hanem a címszerkesztő is. Ez a felhasználói felület automatikusan aktiválásra
kerül az összes olyan eszközön, amelynek legalább 7"-os kijelzőmérete van. A
Keypad-Mapper 3 támogatja mind az álló, mind a fekvő módot.

.. image:: images/tablet-portrait.en.png
.. image:: images/tablet-landscape.en.png

Kis képernyővel rendelkező eszközök használatakor az álló mód csak az A, B és
C betűket tartalmazza. Ha több betűre van szüksége a házszámokhoz, akkor el
kell forgatnia az eszközt fekvő módba. Fekvő módban a betűk A-tól L-ig lesznek
megjelenítve.

.. image:: images/keypad-small-screen-portrait.en.png
.. image:: images/keypad-small-screen-landscape.en.png

Apró kijelzőjű eszközökön csak a számok vannak megjelenítve mind álló, mind
fekvő módban.

.. image:: images/keypad-tiny-screen-portrait.en.png
.. image:: images/keypad-tiny-screen-landscape.en.png

A képernyő használata egyszerű. Csak írja be a házszámot, és nyomja meg a
|icon-left| |icon-front| |icon-right| ikonok egyikét a házszám mentéséhez.

 - |icon-left| azt jelenti, hogy a házszám öntől balra van a gyaloglás
   irányához képest.
 - |icon-right| azt jelenti, hogy a házszám öntől jobbra van a gyaloglás
   irányához képest.
 - |icon-front| azt jelenti, hogy a házszám ön előtt van a gyaloglás irányához
   képest, például egy T-elágazásban.

Opcionálisan egy szöveges jegyzet is hozzáadható a házszámhoz. A jegyzethez a
szövegdoboz a beírt házszám kijelzője és a mentés ikonok között található
(apró képernyőkön a jegyzet szövegdoboza nem látható).

A házszám beviteli mezőjének megérintése megnyit egy teljes billentyűzetet egy
nem szokványos házszám megadásához.

Mielőtt elmentené a házszámot, győződjön meg arról, hogy a ház pontosan öntől
jobbra, balra vagy ön előtt legyen. Egyébként később nehéz lesz hozzárendelni
a házszám csomópontot a megfelelő épülethez az OSM szerkesztőben.

A házszám pozíciója alapértelmezetten az aktuális pozíciótól 10 méterre lesz
balra, jobbra vagy ön előtt. A távolság a beállításokban megváltoztatható.

Amikor elmenti a házszámot, az eszköz rezegni fog visszajelzésként. Ez akkor
hasznos, amikor a képernyő alig látható a napfény miatt.

A |icon-clear| használható a beírt házszám teljes törléséhez, mielőtt
elmentené azt.

Az utolsó kettő vagy három tárolt házszám folyamatosan látható a házszám
beviteli mezőjének jobb oldalán. A megjelenített házszámok mennyisége a
képernyőmérettől függ.

A bal felső sarokban az alkalmazásikonon lévő körben megjelenített szám azt
jelzi, hogy az adott napon hány házszám lett feltérképezve. Ez motiváció lehet
a felmérőnek.

.. |icon-clear| image:: images/icon-clear.png


Címszerkesztő
-------------

Egy cím nemcsak házszámot tartalmaz, hanem utcát, irányítószámot és további
adatokat. Ezen a képernyőn ezek a kiegészítő információk állíthatók be. Ezek
nem kötelezőek. Ha az információk nincsenek megadva, akkor csak a házszám lesz
eltárolva.

.. image:: images/address-editor.en.png

Ezen a képernyőn a következő információk adhatók meg:

- házszám 
- utca
- irányítószám
- település
- országkód
- háznév

Ezekről a tulajdonságokról további információk találhatók az OpenStreetMap
Wikijében a `címzés <https://wiki.openstreetmap.org/wiki/Key:addr>`_ oldalon.

A Keypad-Mapper megjegyzi ezeket az információkat, és hozzáadja azokat a
rögzített cím csomóponthoz egészen addig, amíg a beírt információk nem
változnak. Például ha rögzíteni szeretné egy utca összes házszámát, akkor az
utcát, az irányítószámot és a települést csak egyszer kell megadnia.

Az országkód nem szükséges, mert az kiszámítható a `közigazgatási határból
<https://wiki.openstreetmap.org/wiki/Tag:boundary%3Dadministrative>`_ az
OpenStreetMap adatok alapján (ha helyesen használják).

A háznév szintén nem kötelező, hacsak a háznak nincs egy pontos elnevezése.


Rögzített adatok megosztása
---------------------------

Ezzel a funkcióval az alkalmazás képes elküldeni az összes rögzített adatot
(.osm fájlokat, .gpx fájlokat, hangjegyzeteket és fényképeket) e-mailben,
Bluetooth-on vagy Wi-Fi-n keresztül közvetlenül arra a számítógépre, amelyen
az OSM szerkesztő fut.

A megadott e-mail cím tárolásra kerül az eszközön a későbbi használathoz, és
bármikor megváltoztatható.

.. note::

   Sok nagy fényképet tartalmazó e-mail küldése nem jó ötlet. Néhány e-mail
   fiók nem képes fogadni a több megabájt méretű e-maileket. Ajánlott inkább
   közvetlenül átmásolni a rögzített adatokat egy USB-kábellel csatlakoztatva
   a számítógépre. Az összes rögzített adat megtalálható a *Keypad-Mapper 3*
   mappában az eszköz gyökerében.


Visszavonás
-----------

Ez a lehetőség eltávolítja az utoljára hozzáadott házszámot az .osm fájlból.
**Nem lehetséges** egynél több korábban rögzített házszám visszavonása.


GPS befagyasztása
-----------------

Egyes esetekben a bejáratra kirakott házszám különálló helyen van mint az
épület tényleges bejárata. Ilyen esetekben először arra a helyre kell menni,
ahova a házszám ki van rakva, majd vissza kell menni feltérképezni a cím
csomópontot a megfelelő GPS pozíción.

Előfordulhatnak olyan helyzetek is, hogy a házszám nem látszik, és emiatt be
kell menni a bejáraton, majd visszanézve leolvasni a házszámot.

A befagyasztás lehetőséggel befagyaszthatja a bejárat tényleges GPS pozícióját
(amit egy ragyogó kiemeléssel ellátott hópehely ikon jelez).

Ez lehetővé teszi, hogy elmenjen arra a helyre, ahonnan a házszám látható,
beírja a házszámot, és elmentse azt a bejárat korábban elmentett GPS
pozíciójával.

Miután elmentette a házszámot a |icon-left| |icon-front| |icon-right| ikonok
egyikének megérintésével, a befagyasztás mód automatikusan megszakad, és a
hópehely ikon többé nem lesz kiemelve.

A GPS befagyasztási lehetőségének másik használatai esete, amikor fényképet
kell készíteni a fényképen lévő tárgy GPS koordinátáival. Ebben az esetben
menjen arra a helyre, ahol a fénykép tárgya található, használja a GPS
befagyasztása lehetőséget, majd menjen egy másik helyre, hogy elkészítse a
fényképet a tárgyról. Ez biztosítja, hogy a JPEG fájlon belül eltárolt GPS
koordináták az adott hely pozíciójára mutassanak és ne a fényképet készítő
személy pozíciójára.

GPS pontosság
-------------

Ez a képernyő információt nyújt az aktuális GPS vételről.

.. image:: images/gps-precision.en.png

Ez a képernyő egy áttekintőt biztosít a látható és a használt GPS műholdakról,
valamint a számított pontosságról. A pontosságtól függően a következő ikonok
jelzik a pontosságot a menüsávon.

+---------+------------------------------------------------------------------+
||i-s|    | Ha a menüsávon lévő GPS pontosság ikon nem jelenít meg számot,   |
|         | akkor lehet ugyan GPS vétel, de a minősége nem elég jó a         |
|         | Keypad-Mapper 3 számára.                                         |
+---------+------------------------------------------------------------------+
||i-s-n|  | A menüsávon lévő GPS pontosság ikon méterben vagy lábban         |
|         | jeleníti meg a GPS pontosságát a mértékegység-beállításoktól     |
|         | függően.                                                         |
+---------+------------------------------------------------------------------+
||i-s-n-n|| Ha az eszköz iránytűjét is használja az irány kiszámításához,    |
|         | akkor egy iránytű látható a GPS ikonon.                          |
+---------+------------------------------------------------------------------+

.. |i-s| image:: images/icon-satellite.png
.. |i-s-n| image:: images/icon-satellite-number.png
.. |i-s-n-n| image:: images/icon-satellite-needle-number.png


Fényképező
----------

A házszámok feltérképezésekor szerzett tapasztalatok bizonyították, hogy a GPS
koordinátákkal ellátott fényképek hasznosak emlékezni a bonyolult helyzetekre
vagy további olyan információkra, amelyeknek semmi köze a házszámokhoz, de
elég érdekesek ahhoz, hogy feltérképezzék őket. Sok esetben az ilyen fényképek
mentesítik a térképezőt a további szövegek felírásától (például megjegyezni
egy étlapra nyomtatott teljes címet, tippeket a különleges jelzésekhez, stb.).
Az elkészített fényképek GPS információi a JPEG fájl Exif metaadataiban
lesznek eltárolva. A fénykép betölthető a .gpx és az .osm fájlokkal együtt a
JOSM szerkesztőbe vagy bármely más OSM szerkesztőbe, és megjelenik a térképen,
ahol azt készítették.

A fényképező ikon megérintése megnyitja az eszköz kameráját egy fénykép
készítéséhez. Amikor a fénykép elkészült, lehetőség van elmenteni a képet vagy
megszakítani a folyamatot.

A fényképek szintén a *Keypad-Mappar 3* mappában lesznek eltárolva (és a
galériában is).


Adatok rögzítése
----------------

Ez a funkció lehetővé teszi a felhasználóknak a rögzítés elindítását és
leállítását, valamint új .osm és .gpx fájlokon alapján történő rögzítés
indítását. Ez ugyanaz a funkció, mint amit egy normál GPS naplózó csinál:
folyamatosan rögzíti az aktuális pozíciót minden X. másodpercben, és
nyomvonalat állít elő a pozíciókból.

Ezen kívül egy *GPS kikapcsolása* beállítási lehetőség is hozzáadásra került.
Az *adatok rögzítése* és a *GPS kikapcsolása* funkciók a következőképpen
vonatkoznak egymásra:

- ha a rögzítés aktív, akkor a .gpx nyomvonal rögzítve lesz
- ha a rögzítés aktív, akkor a .gpx nyomvonal akkor is rögzítve lesz, ha az
  alkalmazás a háttérben van
- ha a rögzítés ki van kapcsolva, és a *GPS kikapcsolása* funkció aktiválva
  van, akkor a GPS ki lesz kapcsolva, hogy kímélje az akkumulátort

A nyomvonalak szintén a *Keypad-Mappar 3* mappában lesznek eltárolva.


Hangjegyzet
-----------

Egy hangjegyzet rögzítése kevésbé feltűnő mások számára, mint egy fénykép
készítése, emiatt néhány térképező előnyben részesíti a hangjegyzetek
rögzítését a GPS fényképek készítése helyett, azért hogy ne hívja fel magára
a járókelők figyelemét.

.. image:: images/audio-note.en.png

A hangjegyzet funkció hasonlóan működik mint a fénykép funkció. Lehetővé teszi
egy hangjegyzet rögzítését, és a GPS koordinátákkal együtt történő mentését. A
.jpg fájloktól eltérő módon a hangjegyzetek GPS koordinátái a .gpx fájlban
vannak eltárolva. Emiatt a .gpx fájlt a .wav fájl betöltése előtt kell
betölteni a JOSM szerkesztőbe.

A JOSM lehetővé teszi az összes feltérképezett adat betöltését – beleértve a
rögzített hangjegyzeteket is – arra a GPS pozícióra, ahol az rögzítve lett. A
hangjegyzet lejátszása segíteni fog emlékezni az adott helyen lévő
részletekre.

A hangalapú térképezésről további információk találhatók az OpenStreetMap
Wikijében a `hangalapú térképezés
<https://wiki.openstreetmap.org/wiki/Audio_mapping>`_ oldalon.

A hangjegyzetek szintén a *Keypad-Mappar 3* mappában lesznek eltárolva.


Beállítások
-----------

Ezen a képernyőn a következő beállítási lehetőségek adhatók meg:

.. image:: images/settings.en.png

**Nyelv**
   Válasszon nyelvet: német, spanyol, francia, görög, olasz, holland, lengyel,
   orosz, magyar. Az alapértelmezett az eszköz rendszerének nyelve (ha
   elérhető fordítás az adott nyelvre).

**Rögzített adatok megosztása**
   \*.gpx, \*.osm, \*.wav és \*jpg fájlok megosztása. Ez a beállítás ugyanaz
   mint ami a főmenüben érhető el.

**Összes begyűjtött adat törlése**
   Ez a lehetőség letörli az összes begyűjtött adatot, amelyet az alkalmazás
   az eszközön tárolt: OSM fájlokat, GPX fájlokat és az alkalmazással készült
   fényképeket. Általában akkor használja ezt a funkciót, ha sikeresen
   továbbította az adatait e-mailben a számítógépére.

**Képernyő bekapcsolva tartása**
   A képernyő bekapcsolva marad, ha aktiválja. A beállítás aktiválása jobban
   fogja meríteni az akkumulátort.

**Iránytű használata**
   A kiválasztott sebességig az iránytű-információk lesznek használva a cím
   pozíciójának meghatározásához a GPS irányadatok helyett.

   Ha az értéke nulla, akkor az iránytű-információk nem lesznek használva. A
   sebességet vagy km/h-ban vagy mph-ban kell megadni a
   mértékegység-beállításoktól függően. Az alapértelmezett sebesség 5 km/h.

   Ha az iránytűfunkció az alacsony sebesség miatt aktív, akkor a GPS
   pontosság ikon ezt egy beágyazott iránytű ikonnal jelzi. Ez a tű nem a
   jelenlegi irányt jelzi.

**Rezgés mentéskor**
   Rezgés a megadott ezredmásodpercnyi ideig, amikor a csomópont mentésre
   kerül. Az alapértelmezett érték 120 ezredmásodperc.

**Billentyűzet rezgése**
   Rezgés a megadott ezredmásodpercnyi ideig, amikor megérint egy gombot. Az
   alapértelmezett érték 50 ezredmásodperc.

**Mértékegységek**
   A *metrikus* és a *birodalmi* között választhat.

**Cím csomópontok távolsága**
   A cím csomópontok távolsága az eszköz aktuális pozíciójától, ha a házszámot
   eltárolja. Az alapértelmezett távolság 10 méter.

**GPS kikapcsolása**
   A GPS kikapcsolása az energiatakarékosság érdekében, ha a felhasználó
   leállította a rögzítést.

**Csak Wi-Fi adatok**
   Csak akkor jelenítse meg az utca nevét és az irányítószámot, ha van Wi-Fi
   kapcsolat.

**WAV fájlok útvonala**
   A WAV fájlok útvonala a számítógépen, amelyek címkékként lesznek használva
   a GPX fájlokban.

**Elrendezés optimalizálása**
   A beállítás engedélyezése optimalizálja az alkalmazás elrendezését.


Hivatkozások és jogi megjegyzés
===============================

Ez a kézikönyv az OpenStreetMap Wiki `Keypad-Mapper 3
<https://wiki.openstreetmap.org/wiki/Keypad-Mapper_3>`_ oldala alapján készült.

- Szerző: `Úr Balázs <https://github.com/urbalazs/>`_, 2018.
- Korrektor: `Meskó Balázs <https://github.com/meskobalazs/>`_, 2018.

Ez a kézikönyv `Creative Commons Nevezd meg!-Így add tovább!
<https://creativecommons.org/licenses/by-sa/4.0/>`_ licenc alatt érhető el.
