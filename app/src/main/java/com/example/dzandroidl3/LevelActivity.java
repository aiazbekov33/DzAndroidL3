package com.example.dzandroidl3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        findViewById(R.id.first_lvl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("1 Stage");
                questionModel.setQuestions("Дата дедлайна?");
                questionModel.setFirstVariant("Пятница");
                questionModel.setSecondVariant("Суббота");
                questionModel.setThirdVariant("Вчера");
                questionModel.setFourVariant("АААА!!!");
                questionModel.setAnswer("Пятница");
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                intent.putExtra("firstModel", questionModel);
                startActivity(intent);
            }
        });

        findViewById(R.id.second_lvl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("2 Stage");
                questionModel.setQuestions("Загадки закончились?");
                questionModel.setFirstVariant("Да");
                questionModel.setSecondVariant("Нет");
                questionModel.setThirdVariant("Возможно");
                questionModel.setFourVariant("Незнаю");
                questionModel.setAnswer("Да");
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                intent.putExtra("firstModel", questionModel);
                startActivity(intent);

            }
        });

        findViewById(R.id.third_lvl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("3 Stage");
                questionModel.setQuestions("Начало ВМВ?");
                questionModel.setFirstVariant("1941");
                questionModel.setSecondVariant("1918");
                questionModel.setThirdVariant("1980");
                questionModel.setFourVariant("1945");
                questionModel.setAnswer("1941");
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                intent.putExtra("firstModel", questionModel);
                startActivity(intent);

            }
        });
        findViewById(R.id.four_lvl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("4 Stage");
                questionModel.setQuestions("Сколько задач прописано?");
                questionModel.setFirstVariant("1");
                questionModel.setSecondVariant("2");
                questionModel.setThirdVariant("3");
                questionModel.setFourVariant("4");
                questionModel.setAnswer("4");
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                intent.putExtra("firstModel", questionModel);
                startActivity(intent);
            }
        });

    }
}