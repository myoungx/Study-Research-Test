package youngmeng.org.studyandresearch.drawablematch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import youngmeng.org.studyandresearch.R;

public class DrawableTestActivity extends AppCompatActivity {

    private TextView xdpiTextView;
    private TextView ydpiTextView;

    private TextView width_1x;
    private TextView height_1x;
    private TextView width_3x;
    private TextView height_3x;

    private ImageView smallImage;
    private ImageView bigImage;

    private Button showWidthHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_test);

        showWidthHeight = (Button) findViewById(R.id.show_width_height);

        smallImage = (ImageView) findViewById(R.id.image_small);
        bigImage = (ImageView) findViewById(R.id.image_big);

        xdpiTextView = (TextView) findViewById(R.id.xdpi);
        ydpiTextView = (TextView) findViewById(R.id.ydpi);

        width_1x = (TextView) findViewById(R.id.width_1x);
        height_1x = (TextView) findViewById(R.id.height_1x);

        width_3x = (TextView) findViewById(R.id.width_3x);
        height_3x = (TextView) findViewById(R.id.height_3x);

        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        xdpiTextView.setText("" + xdpi);
        ydpiTextView.setText("" + ydpi);



        showWidthHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                width_1x.setText("width:" + smallImage.getWidth());
                height_1x.setText("---height:" + smallImage.getHeight());

                width_3x.setText("width:" + bigImage.getWidth());
                height_3x.setText("---height:" + bigImage.getHeight());
            }
        });
    }
}
