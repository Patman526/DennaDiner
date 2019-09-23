package com.example.dennadiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LunchItemDetailActivity extends AppCompatActivity {

    public static final String EXTRA_FOOD_ID = "foodchoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_item_detail);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra(EXTRA_FOOD_ID, 0);

        Food myFood = Food.lunchfoods[foodID];

        ImageView photo = findViewById(R.id.food_pic);
        TextView name = findViewById(R.id.food_name);
        TextView desc = findViewById(R.id.food_desc);
        TextView price = findViewById(R.id.food_price);

        photo.setImageResource(myFood.getImageResourceID());
        name.setText(myFood.getFoodName());
        desc.setText(myFood.getDescription());
        price.setText("$" + myFood.getPrice());
    }
}
