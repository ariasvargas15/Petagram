package com.bsav157.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.service.autofill.Sanitizer;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);
        findViewById(R.id.fav).setVisibility(View.INVISIBLE);
    }

    public void enviarMensaje(View view) {
        Snackbar.make(view, "MENSAJE ENVIADO", Snackbar.LENGTH_SHORT).show();
    }
}