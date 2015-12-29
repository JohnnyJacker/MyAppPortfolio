package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

    /**
     * Displays toast for taking you to Spotify Streamer when clicked
     *
     * @param view
     */
    public void spotifyStreamer(View view) {

        Toast.makeText(this, "This button takes you to Spotify Streamer", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays toast for taking you to Scores App when clicked
     *
     * @param view
     */
    public void scoresApp(View view) {

        Toast.makeText(this, "This button takes you to Scores", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays toast for taking you to the Library App when clicked
     *
     * @param view
     */
    public void libraryApp(View view) {

        Toast.makeText(this, "This button takes you to Library", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays toast for taking you to Build it Bigger when clicked
     *
     * @param view
     */
    public void buildItBigger(View view) {

        Toast.makeText(this, "This button takes you to Build it Bigger", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays toast for taking you to XYZ Reader when clicked
     *
     * @param view
     */
    public void xyzReader(View view) {

        Toast.makeText(this, "This button takes you to XYZ Reader", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays toast for taking you to My Capstone App when clicked
     *
     * @param view
     */
    public void capstoneMyOwnApp(View view) {

        Toast.makeText(this, "This button takes you to My Capston App!", Toast.LENGTH_SHORT).show();
    }
}
