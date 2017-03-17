package spinc.sp_exoplayerdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.EMVideoView;

public class MainActivity extends AppCompatActivity implements OnPreparedListener {

    EMVideoView emVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emVideoView = (EMVideoView) findViewById(R.id.video_view);

        setupVideoView();

    }

    private void setupVideoView() {
        emVideoView.setOnPreparedListener(this);

        //For now we just picked an arbitrary item to play.  More can be found at
        //https://archive.org/details/more_animation
        emVideoView.setVideoURI(Uri.parse("https://archive.org/download/Popeye_forPresident/Popeye_forPresident_512kb.mp4"));
    }

    @Override
    public void onPrepared() {
        //Starts the video playback as soon as it is ready
        emVideoView.start();
    }
}
