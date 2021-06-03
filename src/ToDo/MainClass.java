package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String args[]) {

        TodoList todoList = new TodoList();


        //A string to hold the choice that will be entered by the user
        String menuChoice = " ";
        Scanner input = new Scanner(System.in);
        System.out.println(("-----Please Do Your Action-----"));
        System.out.println("\n Enter 1 to Create New Task" +
                " \n press 2 to Print all In process tasks" +
                " \n press 3 to Print all Completed tasks" +
                " \n press 4 to Print all todo tasks" +
                " \n press 5 to Print all tasks" +
                " \n press 6 to update status todo/in process/completed");
        while (!menuChoice.equals("7")) {

            menuChoice = input.nextLine();

            switch (menuChoice) {
                case "1":
                    todoList.createNewTask();
                    break;
                case "2":
                    todoList.printAllInProcessTask();
                    ;
                    break;
                case "3":
                    todoList.printAllCompletedTask();
                    ;
                    break;
                case "4":
                    todoList.printAllTodoTask();
                    break;
                case "5":
                    todoList.printAllTask();
                    break;
                case "6":
                    todoList.updatetaskStatus();
                    break;
                default:
                    System.out.println("Please Enter valid input");

            }
        }


    }


}
