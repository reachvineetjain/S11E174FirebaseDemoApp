package com.nehvin.s11e174firebasedemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, getResources().getString(R.string.banner_ad_unit_id));

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//        // Write a message to the database
//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference();
//
//        Map<String, String> values = new HashMap<>();
//        values.put("Vineet","Jain");
//
//        myRef.push().setValue(values, new DatabaseReference.CompletionListener()
//        {
//            @Override
//            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
//                if(databaseError == null){
//                    Log.i("Info", "onComplete: Save Successful");
//                }
//                else
//                {
//                    Log.i("Error", "onComplete: Save unsuccessful");
//                }
//            }
//        });
//        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference();

    }
}
