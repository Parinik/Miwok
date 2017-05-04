/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Find the view that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a clickListener to that Vie
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the view that shows the family member list
        TextView familyMembers = (TextView) findViewById(R.id.family);
        //set the clickListener to that view
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link familyMembersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //start the new activity
                startActivity(familyIntent);
            }
        });
        //Find the view that shows the colors list
        TextView colors = (TextView) findViewById(R.id.colors);
        //set the clickListener to that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link familyMembersActivity}
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //start the new activity
                startActivity(colorIntent);
            }
        });
        //Find the view that shows the phrases list
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //set the clickListener to that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link familyMembersActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //start the new activity
                startActivity(phrasesIntent);
            }
        });

    }
}






