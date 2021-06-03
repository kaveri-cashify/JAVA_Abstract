package ToDo;

import ToDo.TaskDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private ArrayList<TaskDetails> taskList;


    public TodoList() {
        taskList = new ArrayList<>();

    }

    public void Task(int taskID,String title, String desc,String status) {
        taskList.add(new TaskDetails(taskID,title,status,desc));
    }


    public void createNewTask() {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the following details to add a task:");
        System.out.print(" Please Enter Your Task ID  : ");
        int ID = scan1.nextInt();
        System.out.print("Please Enter Your Task Title  : ");
        String title = scan.nextLine();
        System.out.print("Please Enter Your Task Description: ");
        String desc = scan.nextLine();
        System.out.print("Please Enter Your Task  Status : ");
        String status = scan.nextLine();
        taskList.add(new TaskDetails(ID,title,desc,status));

    }


    public void updatetaskStatus() {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please Enter Your the Task ID you want to update :");
        int ID = scan.nextInt();
        System.out.println("Please Enter Your Current the status of Task :");
        String status = scan1.nextLine();

        for(TaskDetails tasks:taskList ) {
            if(tasks.getID()==ID) {
                tasks.setStatus(status);
            }
        }

    }


    public void printAllInProcessTask() {
        String displayFormat = "%32s%10d%16s ";
        if (!taskList.isEmpty()) {
            System.out.println(String.format("TaskId","Task Title","Task Description","     Task Status"));
            System.out.println(String.format("===========","============","============","       =========="));
            for(TaskDetails tasks:taskList ) {
                if(tasks.isInProgress()) {
                    System.out.println(String.format(displayFormat,
                            tasks.getID(),
                            tasks.getTitle(),
                            tasks.getDescription(),
                            tasks.getStatus()

                    ));
                }

            }
        }
    }

    public void printAllCompletedTask() {
        String displayFormat = "%32s%10d%16s";

        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskId","Task Title","Task Description","Task Status"));
            System.out.println(String.format(displayFormat,"===========","============","============","=========="));
            for(TaskDetails tasks:taskList ) {
                if(tasks.isCompleted()) {
                    System.out.println(String.format(displayFormat,
                            tasks.getID(),
                            tasks.getTitle(),
                            tasks.getDescription(),
                            tasks.getStatus()

                    ));
                }
            }
        }
    }

    public void printAllTodoTask() {
        String displayFormat = "%-20s %-35s %-10s %-10s";

        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskId","Task Title","Task Description","Task Status"));
            System.out.println(String.format(displayFormat,"===========","============","============","=========="));
            for(TaskDetails tasks:taskList ) {
                if(tasks.isTODO()) {
                    System.out.println(String.format(displayFormat,
                            tasks.getID(),
                            tasks.getTitle(),
                            tasks.getDescription(),
                            tasks.getStatus()

                    ));
                }
            }
        }
    }

    public void printAllTask() {
        String displayFormat = "%-20s %-35s %-10s %-10s";

        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskId","Task Title","Task Description","Task Status"));
            System.out.println(String.format(displayFormat,"===========","============","============","=========="));
            for(TaskDetails tasks:taskList ) {

                System.out.println(String.format(displayFormat,
                        tasks.getID(),
                        tasks.getTitle(),
                        tasks.getDescription(),
                        tasks.getStatus()

                ));

            }
        }
    }
}

