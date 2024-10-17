package se.distansakademin;

import java.util.ArrayList;

public class TaskManager implements ITaskManager {

    private ArrayList<String> tasks = new ArrayList<>();

    public TaskManager() {
        tasks.add("Städa"); // index 0
        tasks.add("Äta"); // index 1
    }


    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }
    }

    @Override
    public void showTasks(){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

}
