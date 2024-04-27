package org.launchcode;

public interface OpticalDisc {

    // Constant fields
    int MIN_SPEED = 300;
    int MAX_SPEED = 1800;

    // Method signatures
    void spinDisc();
    void reportDiscInfo();
    void writeData(String data);
    String readData();
}


}
