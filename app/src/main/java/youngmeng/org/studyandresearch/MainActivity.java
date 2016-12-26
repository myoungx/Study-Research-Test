package youngmeng.org.studyandresearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import youngmeng.org.studyandresearch.drawablematch.DrawableTestActivity;
import youngmeng.org.studyandresearch.touchmode.TouchModeProActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button gotoTouchMode;
    private Button gotoDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoTouchMode = (Button) findViewById(R.id.goto_touch_mode);
        gotoDrawable = (Button) findViewById(R.id.goto_drawable);

        gotoTouchMode.setOnClickListener(this);
        gotoDrawable.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;

        if (id == R.id.goto_touch_mode) {
            intent = new Intent(MainActivity.this, TouchModeProActivity.class);
        } else if (id == R.id.goto_drawable) {
            intent = new Intent(MainActivity.this, DrawableTestActivity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
