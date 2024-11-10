package com.example.myapplication77777777777777777777;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    boolean status=true,mode=true;
    TextView etmode,etdegree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etmode=findViewById(R.id.mm);
        etdegree=findViewById(R.id.textView);
    }
    public void chStatus(View view) {
        status=!status;
    }

    public void chMode(View view) {
        if(status) {
            mode = !mode;
            if (mode)
                etmode.setText("cold");
            else
                etmode.setText("heat");
        }
    }

    public void pp(View view) {
        if(status) {
            int a = Integer.parseInt(etdegree.getText().toString());
            if (a < 30)
                etdegree.setText(String.valueOf(a + 1));
        }
    }
    public void mm(View view) {
        if(status) {
            int a = Integer.parseInt(etdegree.getText().toString());
            if (a > 16)
                etdegree.setText(String.valueOf(a - 1));
        }
    }
}