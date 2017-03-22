package com.example.rent.ormapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper dbHelper;
    Dao<Task,Long> dao;
    private static final String TAG = "costam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);
        dao = dbHelper.getTaskDao();
        //czyszenie bazy
        dbHelper.onUpgrade(dbHelper.getWritableDatabase(),0,0);

        try {
            testOrmLite();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private void testOrmLite()throws SQLException{
        //INSERT
        Task newTask = new Task("Nowa notatka");
        dao.create(newTask);
        dao.create(new Task("kolejna notatka"));

        //SELECT
        List<Task> allTasks = dao.queryForAll();
        for(Task task:allTasks){
            Log.d(TAG, task.toString());
        }
    }
}
