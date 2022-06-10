/*
 * Copyright (c) 2022 Lucas de los Santos
 */

package com.ldls.task;

import org.junit.jupiter.api.Test;

import static com.ldls.task.TaskService.uuid;

public class TaskServiceTest {

    @Test
    public void createModifyAndDeleteTask(){
        Task t1 = new Task(uuid, "WinUpdate", "Run Windows Update on 2019 server");
        TaskService taskService = new TaskService();
        System.out.println(taskService.addTask(t1));
        System.out.println(taskService.updateTask(uuid, "WinUpdateDone", "Windows Updates on 2019 Server Complete"));
        System.out.println(taskService.deleteTask(uuid));
    }
}