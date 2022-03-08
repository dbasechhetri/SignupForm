package edu.kathford.sample.signupform;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText principleEditText;
    private EditText timeEditText;
    private EditText rateEditText;
    private TextView result;
    private Button calculateBttn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principleEditText = findViewById(R.id.principleEditText);
        timeEditText = findViewById(R.id.timeEditText);
        rateEditText = findViewById(R.id.rateEditText);
        result = findViewById(R.id.resultEditText);
        calculateBttn = findViewById(R.id.calculateBttn);

        calculateBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int principle = Integer.parseInt(principleEditText.getText().toString());
               int time = Integer.parseInt(timeEditText.getText().toString());
               int rate = Integer.parseInt(rateEditText.getText().toString());
                int I;
                I=(principle*time*rate)/100;
                result.setText("Total Amount is :" +String.valueOf(I));


               /* Log.e("principle", principle);
                Log.e("Time", time);
                Log.d("rate", rate);
                Log.d("result", result);*/

//                Toast.makeText(MainActivity.this,"Calculated.show();
            }
        });


    }

}