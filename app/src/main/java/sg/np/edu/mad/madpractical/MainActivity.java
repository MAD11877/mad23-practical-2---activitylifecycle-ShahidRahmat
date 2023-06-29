package sg.np.edu.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sg.np.edu.mad.week2madprac.R;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "MAD Practical";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user1 = new User("Shahid", "zao shang hao zhong guo", 1, false);
        Button fbutton = findViewById(R.id.fbutton);

        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.followed == false){
                    fbutton.setText("FOLLOW");
                    user1.followed = true;
                }
                else {
                    fbutton.setText("UNFOLLOW");
                    user1.followed = false;
                }
            }
        });

        TextView namebox = findViewById(R.id.namebox);
        TextView descbox = findViewById(R.id.descbox);
        namebox.setText(user1.name);
        descbox.setText(user1.description);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "Start");
    }

    @Override
    protected void onResume(){

        super.onResume();
        Log.v(TITLE, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "Paused");
    }

    @Override
    protected void onStop(){

        super.onStop();
        Log.v(TITLE, "Stop");
    }

    @Override
    protected void onRestart(){

        super.onRestart();
        Log.v(TITLE, "Restart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "Destroy");
    }

}