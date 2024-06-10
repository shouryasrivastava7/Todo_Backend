package com.project.todo.todo.services;

import com.project.todo.todo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskServiceInter {


    public List<Task> getAllTasks();

    public Optional<Task> getTaskById(Long id);

    public Task saveTask(Task task);

    public void deleteTask(Long id);

    public List<Task> getPendingTasks();

    public List<Task> getCompletedTasks();
}
