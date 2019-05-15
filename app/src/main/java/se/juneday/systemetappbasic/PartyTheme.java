package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartyTheme extends AppCompatActivity {



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
                Intent test = new Intent (PartyTheme.this, MainActivity.class);
                startActivity(test);
            }
        });

        new_year_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });
        exam_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });
        home_party_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });
    }
}
