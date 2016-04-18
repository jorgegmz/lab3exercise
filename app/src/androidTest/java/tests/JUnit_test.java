package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jag028.lab3exercise.MainActivity;
import com.example.jag028.lab3exercise.R;

/**
 * Created by jag028 on 4/15/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    @UiThreadTest
    public void test_sum(){
        mainActivity = getActivity();

        EditText et1 = (EditText) mainActivity.findViewById(R.id.TFnumber1);
        EditText et2 = (EditText) mainActivity.findViewById(R.id.TFnumber2);
        TextView rst = (TextView) mainActivity.findViewById(R.id.TVresult);
        Button bt = (Button) mainActivity.findViewById(R.id.button);

        //testing positive #'s
        et1.setText("5");
        et2.setText("8");
        bt.performClick();
        int result = Integer.parseInt(rst.getText().toString());
        assertEquals(result > 0, true);

        //testing negative #'s
        et1.setText("-6");
        et2.setText("-9");
        bt.performClick();
        result = Integer.parseInt(rst.getText().toString());
        assertEquals(result < 0, true);

        //testing pos and neg #'s
        et1.setText("5");
        et2.setText("-8");
        bt.performClick();
        result = Integer.parseInt(rst.getText().toString());
        assertEquals(result == -3, true);

        //testing neg pos #'s
        et1.setText("-5");
        et2.setText("8");
        bt.performClick();
        result = Integer.parseInt(rst.getText().toString());
        assertEquals(result == 3, true);
    }
}
