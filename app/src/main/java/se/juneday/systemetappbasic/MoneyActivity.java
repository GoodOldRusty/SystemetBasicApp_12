package se.juneday.systemetappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);



        ImageButton okgoButton = findViewById(R.id.okgoButton);

                okgoButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent test = new Intent(MoneyActivity.this, MainActivity.class);
                        startActivity(test);
                    }
        
    });
}
}