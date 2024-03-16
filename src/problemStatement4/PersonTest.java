package problemStatement4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PersonTest {

	public static void main(String[] args) {
        // Create a TreeSet to store Person objects with natural sorting based on id
        Set<Person> persons = new TreeSet<>();

        // Add 10 person details
        persons.add(new Person(1, "Jerry", 12, 999.0));
        persons.add(new Person(2, "Smith", 22, 2999.0));
        persons.add(new Person(3, "Popeye", 21, 5999.0));
        persons.add(new Person(4, "Jones", 22, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
        persons.add(new Person(7, "Frank", 27, 4999.0));
        persons.add(new Person(8, "Alex", 29, 6999.0));
        persons.add(new Person(9, "Henry", 26, 2999.0));
        persons.add(new Person(10, "Kane", 31, 5999.0));

        // 1. Print all the persons details using Method Reference
        System.out.println("-----------------Sorted ASC by ID-------------------------");
        persons.forEach(System.out::println);
        System.out.println("\n");

        // 2. Print all the persons details by sorting the names in ascending order using Comparator
        System.out.println("-----------------Sorted ASC by Name-------------------------");
        persons.stream()
        .sorted(Comparator.comparing(Person::getName))
        .forEach(System.out::println);
        System.out.println("\n");
        
        // 3. Print all the persons details by sorting the names in descending order using Comparator
        System.out.println("-----------------Sorted DESC by ID-------------------------");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
        System.out.println("\n");
        
        // 4. Print all the persons details whose age is greater than 25 using Predicate
        System.out.println("-----------------Age is greater than 25-------------------------");
        System.out.println("Person whose Age is greater than 25");
        persons.stream()
                .filter(person -> person.getAge() > 25)
                .forEach(System.out::println);
        System.out.println("\n");
        
        // 5. Print the id, name, and salary of each person using Consumer
        System.out.println("-----------------Print ID,Name and Salary-------------------------");
        Consumer<Person> personConsumer = person ->
        		
                System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getSalary());
        persons.forEach(personConsumer);
        System.out.println("\n");
        
        // 6. Print all the names of person in Uppercase using Function
        System.out.println("-----------------All the Names in UpperCase-------------------------");
        Function<Person, String> nameToUpperCase = person -> person.getName().toUpperCase();
        persons.stream()
                .map(nameToUpperCase)
                .forEach(System.out::println);
        System.out.println("\n");
        
     // 7. Print the names and salary of each person after applying the appraisal of 10% using ToDoubleFunction
        System.out.println("-----------------Applying Appraisal to salary-------------------------");
        ToDoubleFunction<Person> appraisal = person -> person.getSalary() * 1.1;
        persons.forEach(person ->
                System.out.println("Name is: " + person.getName() + " and Salary is: " + appraisal.applyAsDouble(person)));
        
    }
}
