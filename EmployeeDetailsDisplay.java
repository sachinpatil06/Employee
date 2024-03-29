import java.util.Scanner;

public class EmployeeDetailsDisplay {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter employee details
        System.out.print("Enter the name of the employee: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter the ID of the employee: ");
        int employeeID = scanner.nextInt();
       
        System.out.print("Enter the salary of the employee: ");
        double employeeSalary = scanner.nextDouble();

        // Display the employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + employeeSalary);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
