package Homework;

public class MainPerson {
    public static void main(String[] args) {
        String name = "Maria";
        String middleName = "Sergeevna";
        String familyName = "Ziborova";
        int age = 37;

        Person person = new Person(name, middleName, familyName, age);

        System.out.println(familyName + " " + name + " " + middleName);
        System.out.println("Год рождения - " + (Person.yearOfBirth((person.getAge()))));

        }
}
