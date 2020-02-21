package com.example.httpexample.interactor.user;



import android.app.Activity;
import android.content.Context;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.httpexample.domain.user.User;
import com.example.httpexample.repository.jsonplaceholder.JsonPlaceholderParser;
import com.example.httpexample.view.MainActivity;
import com.example.httpexample.view.RecyclerAdapter;

import java.util.ArrayList;

public class UserInteractor implements UserResponse {

    JsonPlaceholderParser parser = new JsonPlaceholderParser();
    MainActivity activity;

    public UserInteractor(MainActivity activity) {
        this.activity = activity;
    }

    public void getUsers() {
        new UserTask(parser, this).execute();
    }

    @Override
    public void response(ArrayList<User> userList) {
        activity.setUserList(userList);
    }
}

interface UserResponse {
    void response(ArrayList<User> userList);
}
