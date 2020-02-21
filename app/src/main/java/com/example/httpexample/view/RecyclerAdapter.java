package com.example.httpexample.view;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.httpexample.R;
import com.example.httpexample.domain.user.User;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<UserVH> {

    private final Activity context;
    private final ArrayList<User> userList;

    public RecyclerAdapter(Activity context, ArrayList<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = context.getLayoutInflater();
        View userView = inflater.inflate(R.layout.user_info, null, false);
        return new UserVH(userView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserVH holder, final int position) {
        final User user = userList.get(position);
        Log.i("UserInformation", user.toString());
        holder.bind(user);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
