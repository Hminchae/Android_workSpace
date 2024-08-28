package com.example.viewbinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.viewbinding.databinding.ActivityMainBinding;
import com.example.viewbinding.databinding.ActivitySecondBinding;

public class MainActivity extends AppCompatActivity {

    // View의 주소값을 담을 변수
    /*
    Button button1;
    TextView textView1;
*/
    // ViewBinding 객체를 담을 변수
    ActivityMainBinding activityMainBinding;
    ActivitySecondBinding activitySecondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ViewBinding 객체 추출
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

       //activitySecondBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        //setContentView(activitySecondBinding.getRoot());

        /*
        // View의 주소값을 가져온다.
        button1 = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView);
 */
        ButtonClickListener1 buttonClickListener1 = new ButtonClickListener1();
        // button1.setOnClickListener(buttonClickListener1);
        activityMainBinding.button.setOnClickListener(buttonClickListener1);
    }


    // View.OnClickListener 인터페이스를 구현
    class ButtonClickListener1 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            activityMainBinding.textView.setText("ㅋㅋㅋㅋㅋ안뇽!");
        }
    }
}
