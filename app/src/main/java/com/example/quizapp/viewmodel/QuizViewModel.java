package com.example.quizapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.quizapp.model.QuestionsList;
import com.example.quizapp.repository.QuizRepository;

public class QuizViewModel extends ViewModel {
    QuizRepository repository = new QuizRepository();

    LiveData<QuestionsList> questionsListLiveData;


    public QuizViewModel() {
        questionsListLiveData = repository.getQuestionsFromAPI();
    }

    public LiveData<QuestionsList> getQuestionsListLiveData() {
        return questionsListLiveData;
    }

}


