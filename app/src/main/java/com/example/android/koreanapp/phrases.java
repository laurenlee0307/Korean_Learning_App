package com.example.android.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    private static final String TAG = "phrases";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ListView phrases = (ListView)findViewById(R.id.phrases);
        Log.d(TAG, "onCreate: Started.");

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("neh -> Yes");
        arrayList.add("ah-nee-oh -> No");
        arrayList.add("jwe-song-ha-ji-man -> Please");
        arrayList.add("chon-mahn-eh-yo -> You're welcome");
        arrayList.add("sil-le-hahm-ni-da -> Excuse me");
        arrayList.add("ahn-nyong-ha-se-yo -> Good morning");
        arrayList.add("ahn-nyong-hee-ga-se-yo -> Good-bye");
        arrayList.add("jal ga yo -> Get home safe");
        arrayList.add("joeun haru bonaeseyo -> Have a nice day");
        arrayList.add("yeohaeng jalhaseyo -> Have a good trip!");
        arrayList.add("amado -> Maybe");
        arrayList.add("jamkkanmanyo! -> Just a moment!");
        arrayList.add("apayo -> I feel sick");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        phrases.setAdapter(arrayAdapter);
    }
}
