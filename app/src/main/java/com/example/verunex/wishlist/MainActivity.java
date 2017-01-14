package com.example.verunex.wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    // Buttons
    private Button addWishButton;

    //Firebase
    private FirebaseDatabase mFirebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControl();

        buttonsClick();

    }

    private void initControl() {
        addWishButton = (Button)findViewById(R.id.addWishButton);
    }

    private void buttonsClick() {
        addWishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getBaseContext(), AddWishActivity.class);
                startActivity(i);
            }
        });
    }



}
