package com.example.BaseAdapter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MyActivity extends Activity {
    ListView myList;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myList=(ListView)findViewById(R.id.myList);
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return 40;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView,ViewGroup parent) {
                LinearLayout line=new LinearLayout(MyActivity.this);
                line.setOrientation(0);
                ImageView imageView=new ImageView(MyActivity.this);
                imageView.setImageResource(R.drawable.ic_launcher);
                TextView textView=new TextView(MyActivity.this);
                textView.setText("第" +(position+1)+"个列表项");
                textView.setTextSize(20);
                textView.setTextColor(Color.RED);
                line.addView(imageView);
                line.addView(textView);
                return line;
            }
        };
        myList.setAdapter(adapter);
    }
}
