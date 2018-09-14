package com.hades.typeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hades.typeview.model.Passcode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            PasscodeFragment fragment = new PasscodeFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_container,fragment,null)
                    .commit();
        }
    }

    public void validatePasscode(Passcode passcode) {

    }

    public void updatePassCode(String value) {

    }
}
