package Manager;

import Task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static List<Task> tasks = new ArrayList<Task>();
    private static int nextId = 1;
    private static LocalDate date = LocalDate.now();

    public static Task addTask(String description, String status) {
        Task task = new Task(nextId++, description, status, date, date);
        tasks.add(task);
        return task;
    }

}
