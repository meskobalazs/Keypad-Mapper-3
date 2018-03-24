package org.osm.keypadmapper2;


public interface AddressInterface {

    void extendedAddressActive();

    void extendedAddressInactive();

    /**
     * Called when the user changes the house number.
     * 
     * @param newHouseNumber
     *            Currently entered housen umber.
     */
    void onHouseNumberChanged(String newHouseNumber);
    
    /**
     * Called when address has been updated and extended fragment has to refresh 
     * data.
     */
    void onAddressUpdated();

    void showMessage(String messageKey);
}
