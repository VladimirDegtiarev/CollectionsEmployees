import java.util.*;
import  java.lang.*;

public class EmployeeList {

    // Создать список объетов List<Employee>
    // и сортировать по:
    // имени
    // имени и зарплате
    // имени, зарплате, возрасту и компании


    public static List<Employee> employeeGenerator(int num) {

        int rndName, rndCompany, rndSalary, rndAge;
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)

        for (int i = 0; i < num; i++) {

            rndName = (int) (Math.random() * ((names.length - 1) + 1)) + 0;
            rndCompany = (int) (Math.random() * ((companies.length - 1) + 1)) + 0;
            rndSalary = (int) (Math.random() * ((6000 - 2500) + 100)) + 2500;
            rndAge = (int) (Math.random() * ((60 - 21) + 1)) + 21;

            employees.add(new Employee(i + 1, names[rndName], companies[rndCompany], rndSalary, rndAge)); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп

        }

        System.out.println("\nСписок сотрудников компаний, отсортированный по имени, зарплате, возрасту, а затем по названию компании: ");
        SortingByEverything.employeeSortedByEverything(num, employees);
        System.out.println("\nСписок сотрудников компаний, отсортированный по имени, а затем по зарплате: ");
        SortingByNameAndSalary.employeeSortedByNameAndSalary(num, employees);
        System.out.println("\nСписок сотрудников компаний, отсортированный по имени: ");
        SortingByName.employeeSortedByName(num, employees);
        System.out.println("\nБазовый список сотрудников компаний: ");

        return employees;
    }

}



