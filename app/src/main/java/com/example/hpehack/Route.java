package com.example.hpehack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Route extends AppCompatActivity {

    String [] startArray = {"HPE office", "Pheonix market city", "Brigade metropolis"};
    String [] destinationArray = {"Forum Koramangla"};
    AutoCompleteTextView start, destination;
    Button findSafestRoute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        start = findViewById(R.id.start);
        destination = findViewById(R.id.destination);
        findSafestRoute = findViewById(R.id.safe_route);

        ArrayAdapter<String> startAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.select_dialog_item, startArray);
        ArrayAdapter<String> destinationAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.select_dialog_item, destinationArray);

        start.setThreshold(2);
        start.setAdapter(startAdapter);

        destination.setThreshold(2);
        destination.setAdapter(destinationAdapter);

        findSafestRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!start.getText().toString().trim().equals("")
                        && !destination.getText().toString().trim().equals("")){
//                    Intent com = new Intent(Route.this, DirectionsActivity.class);
//                    startActivity(com);
                    // Start Maps activity
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please enter your start and end point", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
