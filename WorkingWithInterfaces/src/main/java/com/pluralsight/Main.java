package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));
        myFamily.add(new Person("Zachary", "Wyatt", 31));
        myFamily.add(new Person("Zach", "Lukas", 31));
        myFamily.add(new Person("Tom", "Domyn", 35));
        myFamily.add(new Person("Ranveer", "Singh", 45));


        myFamily.add(new Person("Jalen", "Williams", 23));
        myFamily.add(new Person("Grant", "Williams", 25));
        myFamily.add(new Person("Jaden", "Ivey", 22));
        myFamily.add(new Person("Keyontae", "Johnson", 24));
        myFamily.add(new Person("Keldon", "Johnson", 24));
        myFamily.add(new Person("Draymond", "Green", 34));
        myFamily.add(new Person("Josh", "Green", 23));
        myFamily.add(new Person("Trey", "Murphy", 24));

        String lastName = "Wyatt";
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : myFamily) {
            if (person.getLastName().equals(lastName)) {
                matchingPeople.add(person);
            }
        }
        for (Person person : matchingPeople) {
            System.out.println(person);
        }


        System.out.println(myFamily);

        System.out.println("Sorted by last name:");
        for (Person p : myFamily) {
            System.out.println(p);
        }
    }
}

