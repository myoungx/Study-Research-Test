package youngmeng.org.studyandresearch.touchmode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import youngmeng.org.studyandresearch.R;

/**
 * Created by mengyang on 2016/12/13.
 */

public class TouchModeActivity extends Activity implements View.OnClickListener {

    private Button buttonTouchMode;
    private Button buttonNotTouchMode;
    private EditText editTextTouchMode;
    private EditText editTextNotTouchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_mode_layout);

        buttonTouchMode = (Button) findViewById(R.id.button_touch_mode);
        buttonNotTouchMode = (Button) findViewById(R.id.button_not_touch_mode);
        editTextTouchMode = (EditText) findViewById(R.id.edit_text_touch_mode);
        editTextNotTouchMode = (EditText) findViewById(R.id.edit_text_not_touch_mode);

        buttonTouchMode.setOnClickListener(this);
        buttonNotTouchMode.setOnClickListener(this);

//        Toast.makeText(this, "1--editTextTouchMode--" + editTextTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "2--editTextNotTouchMode--" + editTextNotTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
//
//        Toast.makeText(this, "3--buttonTouchMode--" + buttonTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "4--buttonNotTouchMode--" + buttonNotTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "" + buttonTouchMode.isInTouchMode(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button_touch_mode) {
//            editTextTouchMode.setFocusableInTouchMode(true);

//            buttonTouchMode.setFocusableInTouchMode(true);

            editTextTouchMode.setFocusable(true);

            Toast.makeText(this, "1--editTextTouchMode--" + editTextTouchMode.isFocusable(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "3--editTextTouchMode--" + editTextTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "3--buttonTouchMode--" + buttonTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();

//            editTextTouchMode.requestFocusFromTouch();
//            editTextTouchMode.requestFocus();


        } else if (id == R.id.button_not_touch_mode) {
//            editTextNotTouchMode.setFocusable(true);
//            editTextNotTouchMode.setFocusableInTouchMode(false);
//
//            buttonNotTouchMode.setFocusableInTouchMode(false);

            Toast.makeText(this, "" + editTextNotTouchMode.isInTouchMode(), Toast.LENGTH_SHORT).show();

//            editTextNotTouchMode.setFocusable(false);
//            Toast.makeText(this, "2--editTextNotTouchMode--" + editTextNotTouchMode.isFocusable(), Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "4--editTextNotTouchMode--" + editTextNotTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "4--buttonNotTouchMode--" + buttonNotTouchMode.isFocusableInTouchMode(), Toast.LENGTH_SHORT).show();

            editTextNotTouchMode.requestFocusFromTouch();

            Toast.makeText(this, "" + editTextNotTouchMode.isInTouchMode(), Toast.LENGTH_SHORT).show();
//            editTextNotTouchMode.requestFocus();
        } else if (id == R.id.edit_text_touch_mode) {
            Toast.makeText(this, "" + editTextTouchMode.isInTouchMode(), Toast.LENGTH_SHORT).show();

        }
    }
}
