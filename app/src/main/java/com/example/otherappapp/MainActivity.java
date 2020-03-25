package com.example.otherappapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
    }

    public void searchPressed(View view) {
        String google = "https://www.google.com/?gws_rd=ssl#q=";
        String search = searchView.getQuery().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(google+search));
        startActivity(i);
    }

    public void contactsPressed(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(i);
    }

    public void mapsPressed(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:39.958097, -74.979571"));
        startActivity(i);
    }
}
