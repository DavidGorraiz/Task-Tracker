import Manager.TaskManager;
import Task.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        if (args.length == 0) {
            System.out.println("Usage: task-cli <command> [options]");
            return;
        }

        String command = args[0];
        switch (command) {
            case "add":
                if (args.length < 3) {
                    System.out.println("Usage: task-cli add \"task description\"");
                    return;
                }
                Task newTask = TaskManager.addTask(args[1], args[2]);
                System.out.println("Task added successfully (ID: " + newTask.getId() + ")");
                break;

            default:
                System.out.println("Unknown command: " + command);
                break;
        }
    }
}