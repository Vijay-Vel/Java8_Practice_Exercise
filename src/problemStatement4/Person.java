package problemStatement4;

public class Person implements Comparable<Person> {

	private int id;
    private String name;
    private int age;
    private double salary;

    // Constructors, getters, and setters

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Getter method for the name field
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }
    
    public double getSalary() {
        return salary;
    }
    // Override toString, hashCode, equals, and compareTo for natural sorting using id
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, other.id);
	}

	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	}

}
