package org.example;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class ToDo {
//    Task task = new Task();
    static LocalDate localDate = LocalDate.now();


    public static ArrayList<Task> InitialiseTasks(){
        ArrayList <Task> TasksList = new ArrayList<>();

        Task task1 = new Task(1, "take out clothes", true, localDate.now());
        Task task2 = new Task(2, "wash windows", false, localDate.now());

        TasksList.add(task1);
        TasksList.add(task2);

        return TasksList;
    }


    public static void PrintTasks(ArrayList<Task> TasksList){

        for(Task task : TasksList){
            System.out.println("Task ID: " + task.getId());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Is it done?: " + task.getCompletion());
            System.out.println("Date: " + task.getDate());
        }
    }

    public static boolean UserInput(ArrayList<Task> TasksList, Scanner scanner){

        System.out.println("Enter the details for the new task:");

        // Get user input for task details
        System.out.print("Task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Due Date (YYYY-MM-DD): ");
        String dueDateString = scanner.next();
        LocalDate dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Is Complete (true/false): ");
        boolean isComplete = scanner.nextBoolean();

        // Create a new task and add it to the list
        Task newTask = new Task(taskId, description, isComplete, dueDate);
        TasksList.add(newTask);

        System.out.println("Task added successfully!");
        System.out.print("Would you like to add more tasks? (yes/no) ");
        String answer = scanner.next().toLowerCase();
        return answer.equals("yes");

    }



}

