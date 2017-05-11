package com.example.user.ucrop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCoordX;
    EditText etCoordY;
    TextView tvPercentage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPickAndCrop = (Button) findViewById(R.id.button_One);
        Button btnCropRandom = (Button) findViewById(R.id.button_Two);
        RadioButton rbDynamic = (RadioButton) findViewById(R.id.rbDynamic);
        RadioButton rbSquare = (RadioButton) findViewById(R.id.rbSquare);
        RadioButton rbImageSource = (RadioButton) findViewById(R.id.rbImageSource);
        etCoordX = (EditText) findViewById(R.id.etCoordX);
        etCoordY = (EditText) findViewById(R.id.etCoordY);
        tvPercentage = (TextView) findViewById(R.id.tvPercentage);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);




        btnPickAndCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this, etCoordX.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        btnCropRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etCoordY.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        rbDynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button Checked", Toast.LENGTH_SHORT).show();

            }
        });

        rbSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Square Radio Button", Toast.LENGTH_SHORT).show();
            }
        });

        rbImageSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image Source Rb", Toast.LENGTH_SHORT).show();
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvPercentage.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
