package com.example.utsgithubuserapp.retrofit;

import com.example.utsgithubuserapp.GithubSearchResponse;
import com.example.utsgithubuserapp.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);

}
