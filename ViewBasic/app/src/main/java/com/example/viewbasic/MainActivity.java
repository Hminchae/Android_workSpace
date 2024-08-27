package com.example.viewbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        text1 = findViewById(R.id.textView);

        BtnListener listener1 = new BtnListener();
        btn1.setOnClickListener(listener1);
    }
    
    // 버튼 클릭시 동작할 리스너
    class BtnListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            text1.setText("버튼 클릭하셨음");
        }
    }
}