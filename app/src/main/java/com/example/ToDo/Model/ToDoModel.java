/*
 * Created by Seyed on 8/3/21, 2:05 PM
 * Copyright (c) 2021 . All rights reserved.
 * Last modified 8/3/21, 1:55 PM
 */

package com.example.ToDo.Model;

public class ToDoModel {
    private int id, status;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
