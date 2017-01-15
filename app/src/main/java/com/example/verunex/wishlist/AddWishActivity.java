package com.example.verunex.wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddWishActivity extends AppCompatActivity {

    //Buttons
    private ImageButton addProductsToWishList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wish);

        //TODO string values - done

        initControl();

        buttonsClick();


    }

    private void initControl() {

        addProductsToWishList = (ImageButton)findViewById(R.id.addProductsToWishList);

    }


    private void buttonsClick() {

        addProductsToWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), AddProductsPop.class);
                startActivity(i);
            }
        });

    }
}
