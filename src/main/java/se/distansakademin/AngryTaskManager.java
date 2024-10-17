package se.distansakademin;

public class AngryTaskManager implements ITaskManager{
    @Override
    public void addTask(String task) {
        System.out.println("NO I WONT!");
    }

    @Override
    public void removeTask(int index) {
        System.out.println("NO I WONT!");
    }

    @Override
    public void showTasks() {
        System.out.println("NO I WONT!");
    }
}
