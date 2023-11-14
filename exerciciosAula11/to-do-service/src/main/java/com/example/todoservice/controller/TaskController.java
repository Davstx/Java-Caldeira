package com.example.todoservice.controller;
import com.example.todoservice.Task;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping("/add")
    public void addTask(@RequestBody Task task) {
        tasks.add(task);
    }

    @PutMapping("/edit/{taskId}")
    public void editTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
        Optional<Task> existingTask = tasks.stream()
                .filter(task -> task.getId().equals(taskId))
                .findFirst();

        existingTask.ifPresent(task -> {
            task.setDescricao(updatedTask.getDescricao());
            task.setDataDeVencimento(updatedTask.getDataDeVencimento());
            task.setConcluida(updatedTask.isConcluida());
        });
    }

    @DeleteMapping("/delete/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        tasks.removeIf(task -> task.getId().equals(taskId));
    }

}
