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

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();

        final TextView etCompanyName = (TextView) findViewById(R.id.textView2);
        final TextView etUserName = (TextView) findViewById(R.id.textView4);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user != null){
            String companyName = user.getDisplayName();
            String userName = user.getEmail();

            etCompanyName.setText("Company Name - " + companyName);
            etUserName.setText("UserName - " + userName);
        }

        Button advanceToConnectingObjects = (Button) findViewById(R.id.BeginButtonMain);
        advanceToConnectingObjects.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConnectingObjects.class);
                startActivity(intent);
            }
        });

        //Logout button
        Button logoutButton = (Button) findViewById(R.id.bLogout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               auth.signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
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
