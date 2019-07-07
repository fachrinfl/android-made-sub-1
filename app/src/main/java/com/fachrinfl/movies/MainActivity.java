package com.fachrinfl.movies;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MovieModel> list = new ArrayList<>();

    Toolbar tlTitle;
    RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlTitle = (Toolbar) findViewById(R.id.tlTitle);
        tlTitle.setTitle(getResources().getString(R.string.app_name));
        tlTitle.setTitleTextColor(getResources().getColor(R.color.colorTitleToolbar));
        tlTitle.setElevation(8);
        setToolbarFont(tlTitle, this);
        setSupportActionBar(tlTitle);

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListMovie());
        showRecyclerView();
    }

    private void setToolbarFont(Toolbar toolbar, Activity context) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View view = toolbar.getChildAt(i);
            TextView tv = (TextView) view;
            tv.setTypeface(Typeface.createFromAsset(context.getAssets(), "Dosis/Dosis-ExtraBold.ttf"));
            tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);
            tv.setLetterSpacing((float) 0.1);
        }
    }

    private void showRecyclerView() {
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        MovieListAdapter movieListAdapter = new MovieListAdapter(list);
        rvMovie.setAdapter(movieListAdapter);
    }
}
