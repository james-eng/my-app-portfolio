package technology.orangeresearch.project_0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

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

    public void onButtonClick(View view){

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast;

        switch (view.getId()){
            case R.id.button:
                toast = Toast.makeText(context, "Spotify Streamer, coming soon!", duration);
                toast.show();
                break;
            case R.id.button2:
                toast = Toast.makeText(context, "Scores APP, coming soon!", duration);
                toast.show();
                break;
            case R.id.button3:
                toast = Toast.makeText(context, "Library APP, coming soon!", duration);
                toast.show();
                break;
            case R.id.button4:
                toast = Toast.makeText(context, "Build it Bigger, coming soon!", duration);
                toast.show();
                break;
            case R.id.button5:
                toast = Toast.makeText(context, "XYZ Reader, coming soon!", duration);
                toast.show();
                break;
            case R.id.button6:
                toast = Toast.makeText(context, "Capstone APP, coming soon!", duration);
                toast.show();
                break;
        }
    }

}
