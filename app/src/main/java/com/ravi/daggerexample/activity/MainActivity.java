package com.ravi.daggerexample.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ravi.daggerexample.R;
import com.ravi.daggerexample.api.AuthApiHelper;
import com.ravi.daggerexample.api.ContextModule;
import com.ravi.daggerexample.component.ApiClientComponent;
import com.ravi.daggerexample.component.DaggerApiClientComponent;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getGameListFromServer();
    }

    private void getGameListFromServer() {
//        ApiClientComponent apiComponent = DaggerApiClientComponent.builder().build();
//
//        AuthApiHelper authApiHelper = apiComponent.getAuthApiHelper();

    }

}
