package bekks;

import java.util.List;

public class University {
    private List<Nameable> nameable;
    private String location;
    private String name;

    public University(List<Nameable> nameable) {
        this.nameable = nameable;
    }

    public University() {
        System.out.println("University been is created");
    }

    public void setNameable(List<Nameable> nameable) {
        System.out.println("Class University: set Nameable");
        this.nameable = nameable;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        System.out.println("Class University: set location");
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class University: set name");

        this.name = name;
    }

    public List<Nameable> getNameable() {
        return nameable;
    }

    public void method(){
        System.out.println("Get massage");
    }
}
