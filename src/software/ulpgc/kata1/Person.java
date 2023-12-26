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

/*/////////////////////////////
package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Rosmary", LocalDate.of(2003, 11, 21));
        System.out.println(p1.toString());
        System.out.println(p1.getName() + " tiene " + p1.getAge() + " años ");
    }
}
 */