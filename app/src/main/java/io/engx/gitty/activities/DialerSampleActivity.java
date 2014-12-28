

package io.engx.gitty.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import io.engx.gitty.R;


public class DialerSampleActivity extends ActionBarActivity {

    private int screenWidth;
    private ImageButton fabButton;
    private FrameLayout dialerKeysContainer;
    private float absolutefabPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);

        configureToolbar();
    }

    private void configureToolbar() {

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.activity_dialer_toolbar);
        mainToolbar.setTitleTextColor(getResources().getColor(R.color.theme_dialer_accent));
        setSupportActionBar(mainToolbar);
        getSupportActionBar().setTitle("Dialer");
    }
}
