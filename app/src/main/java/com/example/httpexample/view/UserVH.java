package com.example.httpexample.view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.httpexample.R;
import com.example.httpexample.domain.user.User;

public class UserVH extends RecyclerView.ViewHolder {
    private final TextView id;
    private final TextView name;
    private final TextView userName;
    private final TextView email;
    private final TextView street;
    private final TextView suite;
    private final TextView city;
    private final TextView zipCode;
    private final TextView lat;
    private final TextView lng;
    private final TextView phone;
    private final TextView website;
    private final TextView companyName;
    private final TextView catchPhrase;
    private final TextView bs;
    UserVH(@NonNull View userView) {
        super(userView);
        id = userView.findViewById(R.id.id);
        name = userView.findViewById(R.id.name);
        userName = userView.findViewById(R.id.userName);
        email = userView.findViewById(R.id.email);
        street = userView.findViewById(R.id.street);
        suite = userView.findViewById(R.id.suite);
        city = userView.findViewById(R.id.city);
        zipCode = userView.findViewById(R.id.zipCode);
        lat = userView.findViewById(R.id.lat);
        lng = userView.findViewById(R.id.lng);
        phone = userView.findViewById(R.id.phone);
        website = userView.findViewById(R.id.website);
        companyName = userView.findViewById(R.id.companyName);
        catchPhrase = userView.findViewById(R.id.catchPhrase);
        bs = userView.findViewById(R.id.bs);

    }

    void bind(User user) {
        id.setText(id.getText() + Integer.toString(user.getId()));
        name.setText(name.getText() + user.getName());
        userName.setText(userName.getText() + user.getUserName());
        email.setText(email.getText() + user.getEmail());
        street.setText(street.getText() + user.getAddress().getStreet());
        suite.setText(suite.getText() + user.getAddress().getSuite());
        city.setText(city.getText() + user.getAddress().getCity());
        zipCode.setText(zipCode.getText() + user.getAddress().getZipCode());
        lat.setText(lat.getText() + Double.toString(user.getAddress().getGeo().getLat()));
        lng.setText(lng.getText() + Double.toString(user.getAddress().getGeo().getLng()));
        phone.setText(phone.getText() + user.getPhone());
        website.setText(website.getText() + user.getWebsite());
        companyName.setText(companyName.getText() + user.getCompany().getName());
        catchPhrase.setText(catchPhrase.getText() + user.getCompany().getCatchPhrase());
        bs.setText(bs.getText() + user.getCompany().getBs());
    }
}


