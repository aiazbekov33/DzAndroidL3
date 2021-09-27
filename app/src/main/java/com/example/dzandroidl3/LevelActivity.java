package com.example.dzandroidl3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class LevelActivity extends AppCompatActivity implements LevelAdapter.ItemListener {
    RecyclerView recyclerView;
    LevelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        initAdapter();
    }

    private void initAdapter() {
        recyclerView = findViewById(R.id.level_recycler);
        ArrayList<QuestionModel> listModel = new ArrayList<>();
        QuestionModel questionModel1 = new QuestionModel("1 Уровень",
                "Зимой и летом одним цветом", "Ель", "Ель",
                "Яйцо", "Луна", "Президент");
        QuestionModel questionModel2 = new QuestionModel("2 Уровень",
                "H2O что это?", "Вода", "Огонь",
                "Пиво", "Кровь", "Вода");
        QuestionModel questionModel3 = new QuestionModel("3 Уровень",
                "Когда закончится форсаж?", "Никогда", "Никогда",
                "Через год", "Через 2 года", "Через 3 года");

        listModel.add(questionModel1);
        listModel.add(questionModel2);
        listModel.add(questionModel3);
        adapter = new LevelAdapter(listModel, this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(QuestionModel model) {
        Intent intent = new Intent(LevelActivity.this, GameActivity.class);
        intent.putExtra("model", model);
        startActivity(intent);
    }
}