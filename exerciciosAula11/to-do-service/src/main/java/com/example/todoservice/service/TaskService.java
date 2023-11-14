package com.example.todoservice.service;

import com.example.todoservice.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void editTask(Long taskId, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                task.setDescricao(updatedTask.getDescricao());
                task.setDataDeVencimento(updatedTask.getDataDeVencimento());
                task.setConcluida(updatedTask.isConcluida());
                break;
            }
        }
    }

    public void deleteTask(Long taskId) {
        tasks.removeIf(task -> task.getId().equals(taskId));
    }
}