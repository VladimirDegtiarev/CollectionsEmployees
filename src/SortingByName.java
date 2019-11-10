import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByName {

    public static List <Employee> employeeSortedByName (int num, List<Employee> newList) {

        List<Employee> employeesSortedByName = new ArrayList<>(num);
        employeesSortedByName.addAll(newList);

        Collections.sort(employeesSortedByName, new Comparator <Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employeesSortedByName);

        return employeesSortedByName;
    }
}
