package com.example.realestatedeveloperapplication;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PersonnelManagement extends AppCompatActivity {

    //Variables
    EditText fullNameInput, positionInput, phoneNumberInput, emailInput, tasksInput;
    Button addNewProfileButton;

    FirebaseDatabase database;
    DatabaseReference reference;

    Personnel personnel; // Initialise Personnel Java Class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnel_management);

        // Hooks to all XML elements in the personnel_management activity
        fullNameInput = (EditText) findViewById(R.id.fullName_input);
        positionInput = (EditText) findViewById(R.id.position_input);
        phoneNumberInput = (EditText) findViewById(R.id.phoneNumber_input);
        emailInput = (EditText) findViewById(R.id.email_input);
        tasksInput = (EditText) findViewById(R.id.tasks_input);
        addNewProfileButton = (Button) findViewById(R.id.newProfileButton);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Personnel");

        personnel = new Personnel(); //Create Personnel Object
    }
    private void getValues() { // Retrieve User Input from XML
    personnel.setFullName(fullNameInput.getText().toString());
    personnel.setPosition(positionInput.getText().toString());
    personnel.setPhoneNumber(phoneNumberInput.getText().toString());
    personnel.setEmail(emailInput.getText().toString());
    personnel.setTasks(tasksInput.getText().toString());
    }

    public void newProfileButton(View view) {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                getValues();
                reference.child("Monita Veroline").setValue(personnel);
                Toast.makeText(PersonnelManagement.this, "NEW PROFILE ADDED", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


}