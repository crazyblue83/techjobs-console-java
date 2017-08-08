package breakout;

import java.util.ArrayList;
import java.util.HashMap;

public class Patient {
    private String name;
    private Integer age;

    public enum Type {
        Dog,
        Cat
    }

    ;
    private Type species;
    private ArrayList<String> shots;
    private HashMap<String, String> extraInfo;

    public Patient(String name, Integer age, Type animalType) {
        this.name = name;
        this.age = age;
        this.species = animalType;
        this.shots = new ArrayList<String>();
        this.extraInfo = new HashMap<String, String>();
    }

    public void addShot(String shotInfo) {
        this.shots.add(shotInfo);
    }

    public void addField(String fieldName, String fieldValue) {
        this.extraInfo.put(fieldName, fieldValue);
    }

    public String toString() {
        String pet = "";
        pet += "Name: " + this.name + "\n";
        pet += "Age:  " + this.age + "\n";
        for (String key : this.extraInfo.keySet()) {
            pet += key + ": " + this.extraInfo.get(key) + "\n";
            return pet;

        }
    }
}


