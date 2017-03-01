package com.example.sony.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etCompanyName = (EditText) findViewById(R.id.etCompanyName);
        final EditText etUserName = (EditText) findViewById(R.id.etCompanyName);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

        Button advanceToConnectingObjects = (Button) findViewById(R.id.BeginButtonMain);
        advanceToConnectingObjects.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConnectingObjects.class);
                startActivity(intent);
            }
        });


      //initialise reference
      spinner = (Spinner) findViewById(R.id.spinner);
      spinner.setPrompt("Gender");


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Events,android.R.layout.simple_spinner_item);
      spinner.setAdapter(adapter);
      spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        TextView myText = (TextView) view.findViewById();
//        Toast.makeText(this, "You Selected "+ myText.getText(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }



}
