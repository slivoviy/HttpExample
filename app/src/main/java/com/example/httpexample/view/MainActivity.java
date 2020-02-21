package com.example.httpexample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.httpexample.R;
import com.example.httpexample.domain.user.User;
import com.example.httpexample.interactor.user.UserInteractor;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<User> userList = new ArrayList<>();

    public void setUserList(ArrayList<User> thisUserList) {
        userList = thisUserList;
        RecyclerView recyclerView = findViewById(R.id.recycler);
        RecyclerAdapter adapter = new RecyclerAdapter(this, userList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new UserInteractor(this).getUsers();
    }

}