package com.fachrinfl.movies;

import android.graphics.Typeface;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MovieDetail extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    ImageView ivCover;
    TextView tvCategory, tvDuration, tvRelease, tvLabelDuration, tvLabelRelease;
    TextView tvRate, tvVote, tvLabelSynopsis, tvSynopsis;
    TextView tvLabelDirector, tvDirector, tvLabelWriters, tvWriters, tvLabelStars, tvStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        final MovieModel movieModel = getIntent().getParcelableExtra("DETAIL_MOVIE");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ivCover = findViewById(R.id.ivCover);

        Glide.with(this)
                .load(movieModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(ivCover);

        collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextAppearance_MyApp_Title_Expanded);
        collapsingToolbarLayout.setTitle(movieModel.getTitle());
        collapsingToolbarLayout.setExpandedTitleTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        collapsingToolbarLayout.setCollapsedTitleTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));

        tvLabelDuration = findViewById(R.id.tvLabelDuration);
        tvLabelDuration.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        tvLabelRelease = findViewById(R.id.tvLabelRelease);
        tvLabelRelease.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        tvLabelSynopsis = findViewById(R.id.tvLabelSynopsis);
        tvLabelSynopsis.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        tvLabelDirector = findViewById(R.id.tvLabelDirector);
        tvLabelDirector.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        tvLabelWriters = findViewById(R.id.tvLabelWriters);
        tvLabelWriters.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));
        tvLabelStars = findViewById(R.id.tvLabelStars);
        tvLabelStars.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Bold.ttf"));

        tvCategory = findViewById(R.id.tvCategory);
        tvCategory.setText(movieModel.getCategory());
        tvCategory.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvDuration = findViewById(R.id.tvDuration);
        tvDuration.setText(movieModel.getDuration());
        tvDuration.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvRelease = findViewById(R.id.tvRelease);
        tvRelease.setText(movieModel.getRelease());
        tvRelease.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvRate = findViewById(R.id.tvRate);
        tvRate.setText(movieModel.getRate());
        tvRate.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvVote = findViewById(R.id.tvVote);
        tvVote.setText(movieModel.getVote());
        tvVote.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvSynopsis = findViewById(R.id.tvSynopsis);
        tvSynopsis.setText(movieModel.getDescription());
        tvSynopsis.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvDirector = findViewById(R.id.tvDirector);
        tvDirector.setText(movieModel.getDirector());
        tvDirector.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvWriters = findViewById(R.id.tvWriters);
        tvWriters.setText(movieModel.getWriters());
        tvWriters.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

        tvStars = findViewById(R.id.tvStars);
        tvStars.setText(movieModel.getStars());
        tvStars.setTypeface(Typeface.createFromAsset(getBaseContext().getAssets(), "Dosis/Dosis-Medium.ttf"));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
