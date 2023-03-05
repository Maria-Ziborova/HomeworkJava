package Homework;
import java.util.Calendar;

public class MainPerson {
    public static void main(String[] args) {
        String name = "Maria";
        String middleName = "Sergeevna";
        String familyName = "Ziborova";
        int age = 37;

        Person person = new Person(name, middleName, familyName, age);
        Calendar cal = Calendar.getInstance();

        System.out.println("Год рождения - " + (cal.get(Calendar.YEAR) - person.getAge()));

        }
}
