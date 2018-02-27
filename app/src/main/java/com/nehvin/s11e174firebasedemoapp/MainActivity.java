package com.nehvin.s11e174firebasedemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        Map<String, String> values = new HashMap<>();
        values.put("Vineet","Jain");

        myRef.push().setValue(values, new DatabaseReference.CompletionListener()
        {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                if(databaseError == null){
                    Log.i("Info", "onComplete: Save Successful");
                }
                else
                {
                    Log.i("Error", "onComplete: Save unsuccessful");
                }
            }
        });
//        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference();

    }
}
