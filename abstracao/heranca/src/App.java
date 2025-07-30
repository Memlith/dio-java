
import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class App {

    public static void main(String[] args) throws Exception {

        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {

        // employee.code = "";
        System.out.println("============= " + employee.getClass().getCanonicalName() + " =============");
        switch (employee) {
            case Manager manager -> {
                manager.setName("Caio");
                manager.setCode("1229");
                manager.setSalary(5000);
                manager.setLogin("memlith");
                manager.setPassword("12345678");
                manager.setCommission(1200);

                System.out.println(manager.getName());
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getCommission());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());

            }
            case Salesman salesman -> {
                salesman.setName("Jamilly");
                salesman.setCode("2309");
                salesman.setSalary(2000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary(500));
        System.out.println(employee.getFullSalary());

        System.out.println("====================================");
    }

}
