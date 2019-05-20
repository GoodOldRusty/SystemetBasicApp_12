package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartyActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_theme);
        Button park_party_button = findViewById(R.id.park_party_button);
        Button new_year_party_button = findViewById(R.id.new_year_party_button);
        Button exam_party_button = findViewById(R.id.exam_party_button);
        Button home_party_button = findViewById(R.id.home_party_button);


        park_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent park = new Intent (PartyActivity.this, MoneyActivity.class);

                startActivity(park);
            }
        });
        new_year_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_year = new Intent (PartyActivity.this, MoneyActivity.class);
                startActivity(new_year);
            }
        });
        exam_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exam = new Intent (PartyActivity.this, MoneyActivity.class);
                startActivity(exam);
            }
        });
        home_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent (PartyActivity.this, MoneyActivity.class);
                startActivity(home);
            }
        });
    }
}
