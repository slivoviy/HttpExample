package com.example.httpexample.interactor.user;

import android.os.AsyncTask;
import android.util.Log;

import com.example.httpexample.domain.user.User;
import com.example.httpexample.repository.jsonplaceholder.JsonPlaceholderParser;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class UserTask extends AsyncTask<ArrayList<User>, ArrayList<User>, ArrayList<User>> {
    private JsonPlaceholderParser parser;
    private UserResponse userResponse;

    UserTask(JsonPlaceholderParser parser, UserResponse userResponse) {
        this.parser = parser;
        this.userResponse = userResponse;
    }

    @Override
    protected ArrayList<User> doInBackground(ArrayList<User>[] objects) {
        try {
            Log.d("AsynkTask", "started work");
            return parser.getUsers();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            Log.e("USERS", "Ошибка парсинга " + e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(ArrayList<User> userList) {
        super.onPostExecute(userList);
        userResponse.response(userList);
    }
}
