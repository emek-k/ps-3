package com.example.ps_3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;

    public static TaskStorage getInstace(){
        return taskStorage;
    }

    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i=0;i <= 100; i++){
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public Task getTask(UUID id){
        for(Task task : tasks){
            if(task.getId().equals(id))
                return task;
        }
        return null;
    }
}
