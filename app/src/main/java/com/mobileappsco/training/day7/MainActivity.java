package com.mobileappsco.training.day7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.mobileappsco.training.day7.testPackage.FT_Math;


public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextAge;
    FT_Math fM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        fM = new FT_Math();

        int rt = fM.ftAdd(3, 4);
        Toast.makeText(this, "rt = "+rt, Toast.LENGTH_SHORT).show();
    }

    public void calculate(View view) {
        try {
            String name = editTextName.getText().toString();
            int age = Integer.parseInt(editTextAge.getText().toString());
        } catch (Exception e) {

        }
    }
}
