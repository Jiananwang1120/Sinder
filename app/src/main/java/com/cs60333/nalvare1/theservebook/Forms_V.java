package com.cs60333.nalvare1.theservebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * Created by apple on 3/27/17.
 */

public class Forms_V extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_v3a_forms);

        Toolbar my_tool_bar2 = (Toolbar) findViewById(R.id.toolbar_v3a);
        setSupportActionBar(my_tool_bar2);
        my_tool_bar2.setTitle("Forms");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_v3a, menu);
        return true;
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();

        if (res_id == R.id.add_v3a) {
            //??

        } else if (res_id == R.id.delete_v3a) {
            //??
        } else if (res_id == R.id.edit_v3a) {
            //??
        } else if (res_id == exit_v3a) {
            //??
        }
        return true;
    }
    */

}
