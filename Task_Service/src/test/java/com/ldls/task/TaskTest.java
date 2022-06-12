/*
 * Copyright (c) 2022 Lucas de los Santos
 */

package com.ldls.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.ldls.task.TaskService.uuid;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaskTest {
    @Test
    public void createTaskIdLargerThanTen(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task("99999999999", "Win2019Update","Placeholder for Windows Update");
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
        Assertions.assertEquals("Task ID cannot be longer than 10 characters", thrown.getMessage());
        System.out.println("Create TaskID Longer Than 10 - Passed");
    }

    @Test
    public void createNullTaskId(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task(null,"Win2019Update", "Placeholder for Windows Update");
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
            Assertions.assertEquals("Task ID cannot be null", thrown.getMessage());
            System.out.println("Create Null Task ID - Passed");
    }

    @Test
    public void createEmptyTaskId(){
        Task t1 = new Task("","Win2019Update", "Placeholder for Windows Update");
        TaskService taskService = new TaskService();
        System.out.println(TaskService.addTask(t1));
        System.out.println("Task ID Empty String - Passed");
    }

    @Test
    public void createNameLongerThan20() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task(uuid, "WindowsServer2019Updates-March","Placeholder for Windows Update");
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
        Assertions.assertEquals("Name cannot be longer than 20 characters", thrown.getMessage());
        System.out.println("Create Name Longer Than 20 - Passed");
    }

    @Test
    public void createNullName() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task(uuid,null, "Placeholder for Windows Update");
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
        Assertions.assertEquals("Name cannot be null", thrown.getMessage());
        System.out.println("Create Null Name - Passed");
    }

    @Test
    public void createDescriptionLongerThan50() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task(uuid, "Win2019Update","[Windows Maintenance]Placeholder for Windows Update Task - March 2022");
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
        Assertions.assertEquals("Description cannot be longer than 50 characters", thrown.getMessage());
        System.out.println("Create Description Longer Than 50 - Passed");
    }

    @Test
    public void createNullDescription() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Task t1 = new Task(uuid,"Win2019Update", null);
                    TaskService taskService = new TaskService();
                    System.out.println(TaskService.addTask(t1));
                });
        Assertions.assertEquals("Description cannot be null", thrown.getMessage());
        System.out.println("Create Null Description - Passed");
    }

    @Test
    public void testSetterAndGetter(){
        Task t1 = new Task(" ", " ", " ");
        t1.setTaskId(uuid);
        t1.setName("TestSetAndGet");
        t1.setDescription("Simple Unit Test - Passed");
        System.out.println();
        System.out.println(t1.getTaskId());
        System.out.println(t1.getName());
        System.out.println(t1.getDescription());
    }

}
