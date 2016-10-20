package me.kglawrence.kerilawrence.book_park;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectionActivity extends AppCompatActivity implements View.OnClickListener{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_activity);
        Button pickUpButton = (Button)findViewById(R.id.selection_check_out);
        Button dropOffButton = (Button)findViewById(R.id.selection_check_in);
        pickUpButton.setOnClickListener(this);
        dropOffButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        boolean checkIn = v.getId() == R.id.selection_check_in;
        intent.putExtra("checkin",checkIn);
        startActivity(intent);
    }
}
