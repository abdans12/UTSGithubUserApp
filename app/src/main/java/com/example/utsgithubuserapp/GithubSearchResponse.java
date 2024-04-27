package com.example.utsgithubuserapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubSearchResponse {
    @SerializedName("items")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }
}
