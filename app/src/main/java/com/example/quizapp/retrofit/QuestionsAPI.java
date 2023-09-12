package com.example.quizapp.retrofit;

import com.example.quizapp.model.QuestionsList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {

    @GET("questionsapi.php")
    Call<QuestionsList> getQuestions();

}
