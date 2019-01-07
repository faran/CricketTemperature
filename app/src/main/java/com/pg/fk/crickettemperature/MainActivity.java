package com.pg.fk.crickettemperature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1CT;
    TextView tvResults;
    EditText etnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        etnum = findViewById(R.id.etnum);
        btn1CT = findViewById(R.id.btnCT);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        btn1CT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gettemp = etnum.getText().toString().trim();

                if (gettemp.isEmpty()){
                    Toast.makeText(MainActivity.this, "Pleae enter some value", Toast.LENGTH_SHORT).show();
                }else{
                    Integer caltemp = Integer.parseInt(gettemp);
                    double temp = (caltemp / 3.0) + 4;
                    String results = "The approximate temperature outside is " + temp + " degree celcius";
                    tvResults.setText(results);

                    tvResults.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}
