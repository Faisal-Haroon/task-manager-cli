import java.util.ArrayList;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();

    // Adds a new task to the list
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
        System.out.println("Task successfully added!");
    }

    public static void showTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task deleted: " + tasks.get(index));
            tasks.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }
}
