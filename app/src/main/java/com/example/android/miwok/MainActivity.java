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
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

        //Find the view that shows the number category
        TextView numbers =  findViewById(R.id.numbers) ;

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link numbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                startActivity(numbersIntent);
            }
        });

        TextView colors = findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link numbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColoursActivity.class);

                startActivity(colorsIntent);
            }
        });

        TextView family = findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link numbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                startActivity(familyIntent);
            }
        });

        TextView phrase = findViewById(R.id.phrases);

        phrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link numbersActivity}
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);

                startActivity(phraseIntent);
            }
        });

        Toolbar toolbar =  findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Miwok");
        toolbar.setTitleTextColor(getResources().getColor(R.color.tan_background));

    }

}
