package youngmeng.org.studyandresearch.drawablematch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import youngmeng.org.studyandresearch.R;

public class DrawableTestActivity extends AppCompatActivity {

    private TextView xdpiTextView;
    private TextView ydpiTextView;

    private TextView textSmall;
    private TextView textBig;

    private ImageView imageSmall;
    private ImageView imageBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_test);

        imageSmall = (ImageView) findViewById(R.id.image_small);
        imageBig = (ImageView) findViewById(R.id.image_big);

        xdpiTextView = (TextView) findViewById(R.id.xdpi);
        ydpiTextView = (TextView) findViewById(R.id.ydpi);

        textSmall = (TextView) findViewById(R.id.text_small);
        textBig = (TextView) findViewById(R.id.text_big);

        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        xdpiTextView.setText("xdpi:" + xdpi);
        ydpiTextView.setText("ydpi:" + ydpi);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int widthSmall = imageSmall.getWidth();
                int heightSmall = imageSmall.getHeight();
                textSmall.setText("width:" + widthSmall + "; height:" + heightSmall);

                int widthBig = imageBig.getWidth();
                int heightBig = imageBig.getHeight();
                textBig.setText("width:" + widthBig + "; height:" + heightBig);
            }
        }, 3000);
    }
}
