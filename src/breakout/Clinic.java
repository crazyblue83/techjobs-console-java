package breakout;

import java.util.ArrayList;

public class Clinic {
    public static void main (String[] args) {
        Patient myPatient = new Patient("Clifford", 2, Patient.Type.Dog);
        System.out.println(myPatient);
        myPatient.toString();
        myPatient.addShot("Rabies Shot");
        myPatient.addShot("Vodka Shot");
        myPatient.addField("size", "too big");

    }
}
