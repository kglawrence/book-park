package me.kglawrence.kerilawrence.book_park;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when user clicks the Check Out button */
    public void moveToLogIn(View view) {
        // do stuff
        Intent login_intent = new Intent(this, LoginActivity.class);
        startActivity(login_intent);


    }
}
