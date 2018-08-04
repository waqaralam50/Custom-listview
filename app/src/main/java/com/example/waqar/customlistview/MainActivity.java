package com.example.waqar.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
    String[] NAMES={"viki","sham","jan","muj","rah","zu","sah","pup","tip","sip"};
    String[] DESCRIPTIONS={"Actor","freedom fighter","sports","scientist","astronot","music director","tata motors","prime minister","former prime","papapapapa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listView);
CustomAdapter customAdapter=new CustomAdapter();
listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView1=(TextView)view.findViewById(R.id.textView1);
            TextView textView2=(TextView)view.findViewById(R.id.textView2);
            imageView.setImageResource(IMAGES[i]);
            textView1.setText(NAMES[i]);
            textView2.setText(DESCRIPTIONS[i]);
            return view;
        }
    }
}
