package problemStatement4;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PresonTest1 {
	public static void main(String args[]) {
	// Create a HashSet to store Person objects
    Set<Person> persons = new HashSet<>();

    // Add 6 person details
    persons.add(new Person(1, "Jones", 22, 6999.0));
    persons.add(new Person(2, "Tom", 42, 3999.0));
    persons.add(new Person(3, "Jerry", 12, 999.0));
    persons.add(new Person(4, "John", 32, 1999.0));
    persons.add(new Person(5, "Smith", 22, 2999.0));
    persons.add(new Person(6, "Popeye", 21, 5999.0));

    // 1. Print all persons details using Streams and Method Reference
    System.out.println("-----------------Print all the Person records-------------------------");
    persons.stream().forEach(System.out::println);
    System.out.println("\n");

    // 2. Print all persons details by sorting id in ascending order using Comparable and Streams
    System.out.println("-----------------Sorted ASC by ID-------------------------");
    persons.stream()
            .sorted()
            .forEach(System.out::println);
    System.out.println("\n");

    // 3. Print all persons details by sorting name in ascending order using Comparator and Streams
    System.out.println("-----------------Sorted ASC by Name-------------------------");
    persons.stream()
            .sorted(Comparator.comparing(Person::getName))
            .forEach(System.out::println);
    System.out.println("\n");

    // 4. Print all persons details by sorting names in descending order using Comparator and Streams
    System.out.println("-----------------Sorted DESC by ID-------------------------");
    persons.stream()
            .sorted(Comparator.comparing(Person::getName).reversed())
            .forEach(System.out::println);
    System.out.println("\n");

    // 5. Print all persons details whose name starts with J using Streams
    System.out.println("-----------------Name starts with J-------------------------");
    persons.stream()
            .filter(person -> person.getName().startsWith("J"))
            .forEach(System.out::println);
    System.out.println("\n");

    // 6. Print the count number of persons using Streams
    System.out.println("-----------------Count number of Persons-------------------------");
    System.out.println("Count: " + persons.stream().count());
    System.out.println("\n");

    // 7. Print the Max salary among all persons using Streams
    System.out.println("-----------------Max salary amoung all Persons-------------------------");
    persons.stream()
            .mapToDouble(Person::getSalary)
            .max()
            .ifPresent(maxSalary -> System.out.println("OptionalDouble[" + maxSalary + "]"));
    System.out.println("\n");

    // 8. Print the Min salary among all persons using Streams
    System.out.println("-----------------Min salary  amoung all Persons-------------------------");
    persons.stream()
            .mapToDouble(Person::getSalary)
            .min()
            .ifPresent(minSalary -> System.out.println("OptionalDouble[" + minSalary + "]"));
    System.out.println("\n");

    // 9. Print the average of all salaries using Streams
    System.out.println("-----------------Average of Salaries-------------------------");
    persons.stream()
            .mapToDouble(Person::getSalary)
            .average()
            .ifPresent(averageSalary -> System.out.println("OptionalDouble[" + averageSalary+"]"));
    System.out.println("\n");

    // 10. Print the sum of all salaries using Streams
    System.out.println("-----------------Sum of all Salaries-------------------------");
    double sumSalaries = persons.stream()
            .mapToDouble(Person::getSalary)
            .sum();
    System.out.println(sumSalaries);
    System.out.println("\n");

    // 11. Print the First Person whose name starts with J using Streams - filter and findFirst method
    System.out.println("------------------First Person whose name starts with J-------------------------");
    persons.stream()
            .filter(person -> person.getName().startsWith("J"))
            .findFirst()
            .ifPresent(System.out::println);
    System.out.println("\n");

    // 12. Check whether all persons' age is greater than 10 using Streams – allMatch method
    System.out.println("-----------------Return True if all Person age greater than 10-------------------------");
    boolean allAgesGreaterThan10 = persons.stream()
            .allMatch(person -> person.getAge() > 10);
    System.out.println(allAgesGreaterThan10);
    System.out.println("\n");

    // 13. Check whether all persons' age is greater than 50 using Streams – noneMatch method
    System.out.println("-----------------Return True if all Person age greater than 50-------------------------");
    boolean noneAgesGreaterThan50 = persons.stream()
            .noneMatch(person -> person.getAge() > 50);
    System.out.println(noneAgesGreaterThan50);
    System.out.println("\n");

    // 14. Print the average of all salaries using Streams and Collectors
    System.out.println("-----------------Average Salaries to Double-------------------------");
    double averageSalary = persons.stream()
            .collect(Collectors.averagingDouble(Person::getSalary));
    System.out.println(averageSalary);
    System.out.println("\n");

    // 15. Print all persons details grouped by salary using Streams and Collectors
    System.out.println("-----------------Group by Salary-------------------------");
    Map<Double, List<Person>> personsGroupedBySalary = persons.stream()
            .collect(Collectors.groupingBy(Person::getSalary));
    personsGroupedBySalary.forEach((salary, personList) -> {
        System.out.println("Person Grouped By: " + salary);
        personList.forEach(System.out::println);
    });
    System.out.println("\n");

    // 16. Print all names after joining whose age is greater than 18 using Streams and Collectors
    System.out.println("-----------------Joining all the names whose name is greater than 18-------------------------");
    String namesGreaterThan18 = persons.stream()
            .filter(person -> person.getAge() > 18)
            .map(Person::getName)
            .collect(Collectors.joining(" and "));
    System.out.println("In Germany " + namesGreaterThan18 +" are of legal age.");
    System.out.println("\n");

    // 17. Print the Min, Max, Count, Average, and Sum of all persons using Statistics and Collectors
    System.out.println("-----------------Statistics Object-------------------------");
    DoubleSummaryStatistics salaryStatistics = persons.stream()
            .collect(Collectors.summarizingDouble(Person::getSalary));
    System.out.println(salaryStatistics);
    System.out.println("\n");

    // 18. Determine the oldest person among all using Streams and Reduce
    System.out.println("-----------------Determine the Oldest Person-------------------------");
    persons.stream()
            .reduce((person1, person2) -> person1.getAge() > person2.getAge() ? person1 : person2)
            .ifPresent(oldestPerson -> System.out.println(oldestPerson));
    System.out.println("\n");

    // 19. Add n number of multiple records and print the time taken with sequential using stream
    int n = 1000000;
    long startTimeSequential = System.currentTimeMillis();
    for (int i = 1; i <= n; i++) {
        persons.add(new Person(i, "Person" + i, i % 100, 50000.0));
    }
    long endTimeSequential = System.currentTimeMillis();
    System.out.println("Performing Sequential");
    System.out.println("Time taken with Sequential: " + (endTimeSequential - startTimeSequential));
    System.out.println("\n");

    // 20. Print the time taken with parallel using parallelStream
    long startTimeParallel = System.currentTimeMillis();
    persons.parallelStream()
            .forEach(person -> person.setSalary(person.getSalary() * 1.1)); // Just an example parallel operation
    long endTimeParallel = System.currentTimeMillis();
    System.out.println("Performing Parallel");
    System.out.println("Time taken with parallel: " + (endTimeParallel - startTimeParallel));
}

}
