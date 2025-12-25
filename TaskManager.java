import java.util.ArrayList;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public static void showTasks() {
    System.out.println("---- Task List ----");
    for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
        System.out.println("task is show ");
        System.out.println("------well------");
        System.out.println("--------");
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
