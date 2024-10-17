package com.example.anew;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.textView);
        text2=findViewById(R.id.textView2);
        edit1=findViewById(R.id.editText);
        edit2=findViewById(R.id.editText2);
    }

    public void calcAge(View view) {
        String name,year;
        name=edit1.getText().toString();
        year=edit2.getText().toString();
        int y=Integer.parseInt(year);
        int age=2024-y;
        text2.setText(name+" age's is "+age);
    }
}