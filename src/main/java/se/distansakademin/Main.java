package se.distansakademin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ITaskManager taskManager = new AngryTaskManager();
        TaskApp app = new TaskApp(taskManager);
        app.start();
    }
}