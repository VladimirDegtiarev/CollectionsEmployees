import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByNameAndSalary {

    public static List<Employee> employeeSortedByNameAndSalary (int num, List<Employee> newList) {

        List<Employee> employeesSortedByNameAndSalary  = new ArrayList<>(num);
        employeesSortedByNameAndSalary.addAll(newList);

        Comparator <Employee> employeeByName = new Comparator<Employee>() {
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

        Collections.sort(employeesSortedByNameAndSalary, employeeByName.thenComparing(employeeBySalary));

        System.out.println(employeesSortedByNameAndSalary);
        return employeesSortedByNameAndSalary ;

    }
}
