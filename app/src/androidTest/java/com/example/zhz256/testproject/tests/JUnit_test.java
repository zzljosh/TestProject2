package com.example.zhz256.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.zhz256.testproject.MainActivity;
import com.example.zhz256.testproject.R;

import dalvik.annotation.TestTargetClass;

/**ls
 * Created by zhz256 on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2 <MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }



}
