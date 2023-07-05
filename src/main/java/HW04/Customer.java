package HW04;

public class Customer {
    private String fistName;
    private String lastName;
    private int age;
    private String fhone;
    private String gender;


    public Customer(String fistName, String lastName, int age, String fhone, String gender) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.fhone = fhone;
        this.gender = gender;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFhone() {
        return fhone;
    }

    public void setFhone(String fhone) {
        this.fhone = fhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
