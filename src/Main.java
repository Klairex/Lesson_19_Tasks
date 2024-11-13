import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John", 30, true, true ,false, "Engineering"));
        employeeList.add(new Employee("Jane", 28, false, false , false ,"Software"));
        employeeList.add(new Employee("Alice", 40, true, false , true ,"HR"));
        employeeList.add(new Employee("Bob", 50, false, true, true,"Sales"));
        employeeList.add(new Employee("Charlie", 23, true, true, true,"Manager"));
        employeeList.add(new Employee("Diana", 33, false, false, false,"Manager"));
        employeeList.add(new Employee("Eva", 45, true, false, true,"IT"));
        employeeList.add(new Employee("Frank", 36, false, true, false,"Customer Support"));
        employeeList.add(new Employee("Grace", 29, true, false,false,"Manager"));
        employeeList.add(new Employee("Harry", 52, false, true,true,"Admin"));
        employeeList.add(new Employee("Olivia", 25, true, true, false, "Engineering"));
        employeeList.add(new Employee("Liam", 27, false, false, false, "Sales"));
        employeeList.add(new Employee("Noah", 24, true, true, true, "HR"));
        employeeList.add(new Employee("Ava", 31, true, false, true, "Marketing"));
        employeeList.add(new Employee("Isabella", 29, true, false, false, "Manager"));
        employeeList.add(new Employee("James", 37, false, true, true, "Software"));
        employeeList.add(new Employee("William", 40, true, false, false, "Admin"));
        employeeList.add(new Employee("Mason", 32, true, true, false, "Customer Support"));
        employeeList.add(new Employee("Mia", 34, true, false, true, "Logistics"));
        employeeList.add(new Employee("Ethan", 45, false, true, false, "Engineering"));
        employeeList.add(new Employee("Amelia", 26, false, false, true, "Software"));
        employeeList.add(new Employee("Harper", 30, true, true, true, "HR"));
        employeeList.add(new Employee("Sebastian", 33, true, false, true, "Marketing"));
        employeeList.add(new Employee("Jack", 41, true, false, false, "Finance"));
        employeeList.add(new Employee("Daniel", 28, false, true, true, "IT"));
        employeeList.add(new Employee("Grace", 39, true, false, false, "Admin"));
        employeeList.add(new Employee("Zoe", 27, true, true, false, "Manager"));
        employeeList.add(new Employee("Logan", 50, false, true, true, "Customer Support"));
        employeeList.add(new Employee("Chloe", 34, true, false, true, "Operations"));
        employeeList.add(new Employee("Jack", 29, true, true, false, "Software"));
        employeeList.add(new Employee("Ella", 26, false, false, true, "Manager"));
        employeeList.add(new Employee("Evan", 32, true, false, true, "Marketing"));
        employeeList.add(new Employee("Grace", 28, false, true, false, "Admin"));
        employeeList.add(new Employee("Madison", 31, true, true, false, "Software"));



        System.out.println("Task1 :\n");
        List<Employee> employeeTask1 = employeeList.stream()
                .filter(e -> e.isPaidPerHour())
                .filter(e -> e.getDepartment().equals("Manager"))
                .filter(e -> e.getAge()>25)
                .distinct()
                .limit(5)
                .collect(Collectors.toList());


        employeeTask1.forEach(e ->System.out.println(e));

        System.out.println("Task2 :\n");
        List<String> employeeTask2 = employeeList.stream()
                .filter(e -> !e.isPaidPerHour())
                .filter(e -> e.getAge()>30)
                .map(e->e.getName())
                .sorted()
                .collect(Collectors.toList());

        employeeTask2.forEach(e ->System.out.println(e));


        System.out.println("Task3 :\n");
        List<Employee> employeeTask3 = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Software"))
                .filter(e -> e.isCanAttendTraining())
                .filter(e -> e.isCanConductInterview())
                .limit(1)
                .collect(Collectors.toList());

        employeeTask3.forEach(e ->System.out.println(e));

    }



}
