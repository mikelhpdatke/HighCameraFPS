package hvan.tom.highcamerafps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HighSpeedCameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_speed_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, CaptureHighSpeedVideoMode.newInstance())
                    .commit();
        }

    }
}
