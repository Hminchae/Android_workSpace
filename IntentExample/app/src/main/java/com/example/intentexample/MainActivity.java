package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText edit_text;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text = findViewById(R.id.edit_text);
        //str = edit_text.getText().toString(); // ⬅️이거 이렇게하면 앱을 첫 실행했을 때 가져오고 말아버려..

        btn_move = findViewById(R.id.btn_move); /*버튼으로 id를 찾고*/
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*액션을 연결해준다.*/
                str = edit_text.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class); /*현재 Activity 와 이동할 Activity*/
                intent.putExtra("str", str);
                startActivity(intent); // 액티비티 이동
            }
        });
    }
}