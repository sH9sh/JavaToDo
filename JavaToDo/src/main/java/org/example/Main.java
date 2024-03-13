package org.example;


import java.util.ArrayList;
import java.util.Scanner;

import static org.example.ToDo.PrintTasks;
import static org.example.ToDo.UserInput;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//            System.out.println("Hello and welcome!");


        ToDo toDo = new ToDo();
        ArrayList<Task> taskList = toDo.InitialiseTasks();





        while(toDo.UserInput(taskList, scanner)){

        }

        PrintTasks(taskList);
        scanner.close();

    }
}