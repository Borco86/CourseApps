package com.example.rent.ormapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RENT on 2017-03-22.
 */

@DatabaseTable(tableName = "task")
public class Task {

    public Task(){

    }

    @DatabaseField(generatedId = true,columnName = "taskId")
    private Long id;

    @DatabaseField(canBeNull = false)
    private String title;

    @DatabaseField
    private String dateCreated;

    public Task(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
