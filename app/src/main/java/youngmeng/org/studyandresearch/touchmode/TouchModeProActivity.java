package youngmeng.org.studyandresearch.touchmode;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import youngmeng.org.studyandresearch.R;

/**
 * Created by mengyang on 2016/12/17.
 */

public class TouchModeProActivity extends Activity implements View.OnClickListener {

    private Button button;
    private EditText editText;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);

        button = (Button) findViewById(R.id.gen_dialog);
        editText = (EditText) findViewById(R.id.input);

        button.setOnClickListener(this);
        editText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.gen_dialog) {
            Toast.makeText(TouchModeProActivity.this, "" + editText.isInTouchMode(), Toast.LENGTH_SHORT).show();
            actDialog();
        } else if (id == R.id.input) {

        }
    }

    private void actDialog() {
        if (dialog == null) {

            dialog = new Dialog(this, R.style.TouchModeDialog);

            View view = View.inflate(this, R.layout.layout_dialog, null);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(((TextView) v).getText());
                    if (!editText.isFocused()) {
                        editText.setText(((TextView) v).getText() + "====");
                        editText.requestFocusFromTouch();
//                    editText.requestFocus();
                    }
                    dialog.dismiss();
                    Toast.makeText(TouchModeProActivity.this, "" + editText.isInTouchMode(), Toast.LENGTH_SHORT).show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(TouchModeProActivity.this, "" + editText.isInTouchMode(), Toast.LENGTH_SHORT).show();
                        }
                    }, 5000);
                }
            };

            view.findViewById(R.id.__1).setOnClickListener(listener);
            view.findViewById(R.id.__2).setOnClickListener(listener);
            view.findViewById(R.id.__3).setOnClickListener(listener);

            Window window = dialog.getWindow();
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams lp = window.getAttributes();
            lp.width = WindowManager.LayoutParams.MATCH_PARENT;
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(lp);
            dialog.setContentView(view);
        }
        dialog.show();
    }
}
