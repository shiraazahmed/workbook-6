import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Dana", "Wyatt", 63));
        people.add(new Person("Zachary", "Westly", 31));
        people.add(new Person("Elisha", "Aslan", 14));
        people.add(new Person("Ian", "Auston", 16));
        people.add(new Person("Zephaniah", "Hughes", 9));
        people.add(new Person("Ezra", "Aiden", 17));
        people.add(new Person("Zachary", "Wyatt", 31));
        people.add(new Person("Zach", "Lukas", 31));
        people.add(new Person("Tom", "Domyn", 35));
        people.add(new Person("Ranveer", "Singh", 45));


        people.add(new Person("Jalen", "Williams", 23));
        people.add(new Person("Grant", "Williams", 25));
        people.add(new Person("Jaden", "Ivey", 22));
        people.add(new Person("Keyontae", "Johnson", 24));
        people.add(new Person("Keldon", "Johnson", 24));
        people.add(new Person("Draymond", "Green", 34));
        people.add(new Person("Josh", "Green", 23));
        people.add(new Person("Trey", "Murphy", 24));

        String lastName = "Wyatt";
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getLastName().equals(lastName)) {
                matchingPeople.add(person);
            }
        }
        for (Person person : matchingPeople) {
            System.out.println(person);
        }
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / people.size();

        System.out.printf("Average age: %.2f\n", averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
