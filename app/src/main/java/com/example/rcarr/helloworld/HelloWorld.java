package com.example.rcarr.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class HelloWorld extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnHelloClick(View view) {
        /*TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Hello Class!");
        RelativeLayout bg = (RelativeLayout) findViewById(R.id.bg);
        bg.setBackgroundColor(0xFFFFFF00);*/
        Intent intent = new Intent(HelloWorld.this, SayHello.class);
        EditText nameText = (EditText) findViewById(R.id.Name);
        String name = nameText.getText().toString();
        intent.putExtra("name", name);
        HelloWorld.this.startActivity(intent);
    }
}
