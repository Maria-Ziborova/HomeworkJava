package javabasic;

import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public static int getYearOfBirth(int personsAge) {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - personsAge;
    }

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
