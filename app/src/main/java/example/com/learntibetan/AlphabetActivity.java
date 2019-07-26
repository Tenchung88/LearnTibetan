package example.com.learntibetan;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlphabetActivity extends AppCompatActivity {
MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        mysong = MediaPlayer.create(AlphabetActivity.this,R.raw.alphabet);
        mysong.start();

    }


}
