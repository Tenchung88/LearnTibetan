package example.com.learntibetan;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    String[] names = {"White","Red","Black","Yellow","Green","Blue","Pink","Purple","Orange",
    "DarkBlue","Gold","Silver","Grey","Brown","BlackandWhite"};
    String[] name1 ={"དཀར་པོ།","དམར་པོ།","ནག་པོ།","སེར་པོ།","ལྗང་ཁ","ུ།སྔོན་པོི།", "ཟིངས་སྐྱ།","མུ་མེན།","ལི་ཝང་།","སྔོན་ནག།","གསེར་མདོག།","དངུལ་མདོག",
            "ཐལ་མདོག","རྒྱ་སྨུག","དཀར་ནག"};
    MediaPlayer white,red,black,yellow,green,blue,pink,purple,orange,darklue,gold,silver,grey,brown,bwhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        white = MediaPlayer.create(FourthActivity.this, R.raw.white);
        red = MediaPlayer.create(FourthActivity.this, R.raw.red);
        black = MediaPlayer.create(FourthActivity.this, R.raw.black);
        yellow = MediaPlayer.create(FourthActivity.this, R.raw.yellow);
        green = MediaPlayer.create(FourthActivity.this, R.raw.green);
        blue = MediaPlayer.create(FourthActivity.this, R.raw.white);
        pink = MediaPlayer.create(FourthActivity.this, R.raw.pink);
        purple = MediaPlayer.create(FourthActivity.this, R.raw.purple);
        orange = MediaPlayer.create(FourthActivity.this, R.raw.orange);
        darklue = MediaPlayer.create(FourthActivity.this, R.raw.darkblue);
        gold = MediaPlayer.create(FourthActivity.this, R.raw.gold);
        silver = MediaPlayer.create(FourthActivity.this, R.raw.silver);
        grey = MediaPlayer.create(FourthActivity.this, R.raw.grey);
        brown = MediaPlayer.create(FourthActivity.this, R.raw.browb);
        bwhite = MediaPlayer.create(FourthActivity.this, R.raw.blackwhite);
        ListView list1 = (ListView) findViewById(R.id.Tibet3listview);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    white.start();
                }
                if (position == 1) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    red.start();
                }
                if (position == 2) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    black.start();
                }
                if (position == 3) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    yellow.start();
                }
                if (position == 4) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    green.start();
                }
                if (position == 5) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    blue.start();
                }
                if (position == 6) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    pink.start();
                }
                if (position == 7) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    purple.start();
                }
                if (position == 8) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    orange.start();
                }
                if (position == 9) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    darklue.start();
                }
                if (position == 10) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    gold.start();
                }
                if (position == 11) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    silver.start();
                }
                if (position == 12) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    grey.start();
                }
                if (position == 13) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    brown.start();
                }
                if (position == 14) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib3);
                    mytext.setText(name1[position]);
                    bwhite.start();
                }
            }


        });
      customAdaptor customAdaptor = new customAdaptor();
        list1.setAdapter(customAdaptor);


    }
    class customAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.fourthclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name3);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker3);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
