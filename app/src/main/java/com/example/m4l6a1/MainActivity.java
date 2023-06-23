package com.example.m4l6a1;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override

        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.menu_item1) {
                // Handle menu item 1 click
                return true;
            } else if (item.getItemId() == R.id.menu_item2) {
                // Handle menu item 2 click
                return true;
            } else if (item.getItemId() == R.id.menu_item3) {
                // Handle menu item 3 click
                return true;
            }

            return super.onOptionsItemSelected(item);

    }
}