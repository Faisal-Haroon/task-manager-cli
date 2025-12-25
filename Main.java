import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                TaskManager.addTask(task);

            } else if (choice == 2) {
                TaskManager.showTasks();

            } else if (choice == 3) {
                System.out.print("Enter task index: ");
                int index = sc.nextInt();
                TaskManager.deleteTask(index);

            } else if (choice == 4) {
                break;
            }
        }

        sc.close();
    }
}
