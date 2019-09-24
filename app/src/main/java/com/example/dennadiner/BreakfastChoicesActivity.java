package com.example.dennadiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BreakfastChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_choices);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Food.breakfastfoods);

        ListView listFoods = findViewById(R.id.listBreakfastChoices);
        listFoods.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listFoods, View itemView, int position, long id) {
                        Intent intent = new Intent(BreakfastChoicesActivity.this, BreakfastItemDetailActivity.class);
                        intent.putExtra(BreakfastItemDetailActivity.EXTRA_FOOD_ID, (int) id);
                        startActivity(intent);
                    }
                };
        listFoods.setOnItemClickListener(itemClickListener);
    }
}
