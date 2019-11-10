import java.util.Objects;

public class Employee implements Comparable <Employee> {
    private String name;
    private String company;
    private int salary;
    private int age;
    private int number;


    public Employee(int number, String name, String company, int salary, int age) {
        this.number = number;
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + number + ". " + name + ", возраст: " + age + ", компания: " + company + ", зарплата: " + salary + "$";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

}
