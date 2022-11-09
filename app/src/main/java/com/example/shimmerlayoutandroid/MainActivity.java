package com.example.shimmerlayoutandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;


public class MainActivity extends AppCompatActivity {

    // Variables created for buttons and Shimmer
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        ShimmerFrameLayout layout = findViewById(R.id.shimmer_layout);

        // Button 1 to start Shimmer Effect
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If auto-start is set to false
                layout.startShimmer();
            }
        });

        // Button 2 to stop Shimmer Effect
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If auto-start is set to false
                layout.stopShimmer();
            }
        });

    }
}