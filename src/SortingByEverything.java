import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByEverything {
    public static List<Employee> employeeSortedByEverything (int num, List<Employee> newList) {

        List<Employee> employeesSortedByEverything  = new ArrayList<>(num);
        employeesSortedByEverything.addAll(newList);

        Comparator<Employee> employeeByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator <Employee> employeeBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - (o2.getSalary());
            }
        };

        Comparator <Employee> employeeByAge = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getAge() - (o1.getAge());
            }
        };

        Comparator<Employee> employeeByCompany = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getCompany().compareTo(o2.getCompany());
            }
        };

        Collections.sort(employeesSortedByEverything, employeeByName.thenComparing(employeeBySalary).thenComparing(employeeByAge).thenComparing(employeeByCompany));

        System.out.println(employeesSortedByEverything);
        return employeesSortedByEverything ;

    }
}
