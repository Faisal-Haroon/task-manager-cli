import java.util.ArrayList;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public static void showTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
//  delete task function
    public static void deleteTask(int index) {
    if (index >= 0 && index < tasks.size()) {
        System.out.println("Removed: " + tasks.get(index));
        tasks.remove(index);
    } else {
        System.out.println("oops! task not found...");
    }
    }
    }

