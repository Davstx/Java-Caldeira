package com.example.todoservice.controller;
import com.example.todoservice.model.Task;
import com.example.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok().body(tasks);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addTask(@RequestBody Task task) {
        taskService.addTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{taskId}")
    public ResponseEntity<Void> editTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
        boolean taskUpdated = taskService.editTask(taskId, updatedTask);
        if (taskUpdated) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long taskId) {
        boolean taskDeleted = taskService.deleteTask(taskId);
        if (taskDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
