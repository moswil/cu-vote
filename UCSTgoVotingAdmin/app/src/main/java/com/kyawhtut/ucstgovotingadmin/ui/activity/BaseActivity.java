package com.kyawhtut.ucstgovotingadmin.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());

        ButterKnife.bind(this, this);
    }

    public abstract int getLayoutView();

    public static void start(Context ctx, Class<?> next) {
        ctx.startActivity(new Intent(ctx, next));
    }
}