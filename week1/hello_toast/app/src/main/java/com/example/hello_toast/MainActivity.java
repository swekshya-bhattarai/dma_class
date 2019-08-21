package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast",
                Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        textView.setText(""+mCount);
    }
}

