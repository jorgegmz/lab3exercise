package tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.jag028.lab3exercise.MainActivity;

/**
 * Created by jag028 on 4/15/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();
    }
}
