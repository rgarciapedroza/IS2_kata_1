package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    public final String name;
    public final LocalDate bday;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", bday=" + bday +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getBday() {
        return bday;
    }

    public Person(String name, LocalDate bday) {
        this.name = name;
        this.bday = bday;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - bday.toEpochDay());
    }

    private int toYears(long days){
        return (int)(days/365.25);
    }
}
