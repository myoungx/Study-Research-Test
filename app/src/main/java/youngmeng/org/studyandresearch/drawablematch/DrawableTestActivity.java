package youngmeng.org.studyandresearch.drawablematch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import youngmeng.org.studyandresearch.R;

public class DrawableTestActivity extends AppCompatActivity {

    private TextView xdpiTextView;
    private TextView ydpiTextView;

    private Button showWidthHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_test);

        showWidthHeight = (Button) findViewById(R.id.show_width_height);


        xdpiTextView = (TextView) findViewById(R.id.xdpi);
        ydpiTextView = (TextView) findViewById(R.id.ydpi);

        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        xdpiTextView.setText("" + xdpi);
        ydpiTextView.setText("" + ydpi);



        showWidthHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
