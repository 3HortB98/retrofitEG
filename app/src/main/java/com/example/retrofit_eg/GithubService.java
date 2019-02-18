package com.example.retrofit_eg;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    @GET("users/{username}/repos")
    Call<List<GithubRepo>> getRepos(@Path("username") String userName);
}
