package se.juneday.systemetappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);


        Button okButton = findViewById(R.id.ok_answer);


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent test = new Intent (MoneyActivity.this, MainActivity.class);
            startActivity(test);
            }
        });
        
    }
}
