package se.distansakademin;

import java.util.Scanner;

public class TaskApp {

    private Scanner scanner = new Scanner(System.in);
    private ITaskManager taskManager;

    public TaskApp(ITaskManager taskManager){
        this.taskManager = taskManager;
    }

    public void start(){

        while (true) {
            int choice = menu();

            switch (choice) {
                case 1:
                    System.out.print("Ange uppgift: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;
                case 2:
                    System.out.print("Ange index att ta bort: ");
                    int index = scanner.nextInt();
                    taskManager.removeTask(index);
                    break;
                case 3:
                    System.out.println("Uppgifter:");
                    taskManager.showTasks();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ogiltigt val!");
            }
        }
    }

    private int menu() {
        System.out.println("--- Meny ---");
        System.out.println("1. Lägg till uppgift");
        System.out.println("2. Ta bort uppgift");
        System.out.println("3. Visa uppgifter");
        System.out.println("4. Avsluta");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
