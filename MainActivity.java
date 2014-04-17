package com.example.test;

import java.util.Map;

import com.beardedhen.androidbootstrap.Stackicons;
import com.beardedhen.androidbootstrap.StackiconsText;

import android.os.Bundle;
import android.app.Activity;
import android.util.TypedValue;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("StackiconsText");
        
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);
        Map<String, String> stMap = Stackicons.getStMap();
        
        for (Map.Entry<String, String> entry : stMap.entrySet()) {
        	
            TextView textView = new TextView(this);
            textView.setText(entry.getKey());
            textView.setPadding(0, 15, 0, 0);
            mainLayout.addView(textView);
            
            StackiconsText stackiconsText = new StackiconsText(this);
            stackiconsText.setIcon(entry.getKey());
            stackiconsText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
            mainLayout.addView(stackiconsText);
            
        }
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
