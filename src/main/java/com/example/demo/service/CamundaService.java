package com.example.demo.service;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CamundaService {
    private RepositoryService repositoryService;
    private TaskService taskService;
    private RuntimeService runtimeService;

    @Autowired
    public CamundaService(RepositoryService repositoryService, TaskService taskService, RuntimeService runtimeService) {
        this.repositoryService = repositoryService;
        this.taskService = taskService;
        this.runtimeService = runtimeService;
    }

    public void completeTask(String taskId) {
        taskService.complete(taskId);
    }
}
