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
import android.widget.NumberPicker;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {
    String names[] ={"Zero","One","Two","Three","Four","Five","Six",
            "Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
            "Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twentyone","Twentytwo","Twentythree","Twentyfour",
    "Twentyfive","Twentysix","Twentyseven","Twentyeight","Twentynine","Thirty"};
    String[] name1 = {"ཀླད་ཀོར།","གཅིག","གཉིས།","གསུམ།","བཞི།","ལྔ། ","དྲུག། ","བདུན། ","བརྒྱད། ","དགུ། ","བཅུ། ","བཅུ་གཅིག ","བཅུ་གཉིས། ","བཅུ་གསུམ། ","བཅུ་བཞི།",
    "བཅོ་ལྔ།","བཅུ་དྲུག། ","བཅུ་བདུན། ","བཅོ་བརྒྱད། ","བཅུ་དགུ། ","ཉི་ཤུ། ","ཉི་ཤུ་རྩ་གཅིག ","ཉི་ཤུ་རྩ་གཉིས། ","ཉི་ཤུ་རྩ་གསུམ། ","ཉི་ཤུ་རྩ་བཞི། ","ཉི་ཤུ་རྩ་ལྔ། ","ཉི་ཤུ་རྩ་དྲུག། ","ཉི་ཤུ་རྩ་བདུན།",
    "ཉི་ཤུ་རྩ་བརྒྱད། ","ཉི་ཤུ་རྩ་དགུ། ","གསུམ་བཅུ།"};
    MediaPlayer zero, one, two, three,four,fiv,six, seven ,eight, nine, ten, eleven, twelve, thrtn,fortn,fiftn, sixtn, seventn, eightn, nintn, twenty, twentyone,twentytwo, twentythre, twentyfor, twentyfiv, twentysix, twentyseven,
    twentyeigt,twentynine, thrty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        zero = MediaPlayer.create(NumberActivity.this,R.raw.one);
        one = MediaPlayer.create(NumberActivity.this, R.raw.one);
        two = MediaPlayer.create(NumberActivity.this, R.raw.two);
        three = MediaPlayer.create(NumberActivity.this, R.raw.three);
        four = MediaPlayer.create(NumberActivity.this, R.raw.four);
        fiv = MediaPlayer.create(NumberActivity.this, R.raw.fiv);
        six = MediaPlayer.create(NumberActivity.this, R.raw.six);
        seven = MediaPlayer.create(NumberActivity.this, R.raw.seven);
        eight = MediaPlayer.create(NumberActivity.this, R.raw.eight);
        nine = MediaPlayer.create(NumberActivity.this, R.raw.nine);
        ten = MediaPlayer.create(NumberActivity.this, R.raw.ten);
        eleven = MediaPlayer.create(NumberActivity.this, R.raw.elevn);
        twelve = MediaPlayer.create(NumberActivity.this, R.raw.twelv);
        thrtn = MediaPlayer.create(NumberActivity.this, R.raw.thirtn);
        fortn = MediaPlayer.create(NumberActivity.this, R.raw.fourtn);
        fiftn = MediaPlayer.create(NumberActivity.this, R.raw.fiftn);
        sixtn = MediaPlayer.create(NumberActivity.this, R.raw.sixtn);
        seventn = MediaPlayer.create(NumberActivity.this, R.raw.seventn);
        eightn = MediaPlayer.create(NumberActivity.this, R.raw.eightn);
        nintn = MediaPlayer.create(NumberActivity.this, R.raw.ninetn);
        twenty = MediaPlayer.create(NumberActivity.this, R.raw.twnty);
        twentyone = MediaPlayer.create(NumberActivity.this, R.raw.twntytwo);
        twentytwo = MediaPlayer.create(NumberActivity.this, R.raw.twntytwo);
        twentythre = MediaPlayer.create(NumberActivity.this, R.raw.twentythree);
        twentyfor = MediaPlayer.create(NumberActivity.this, R.raw.twentyfor);
        twentyfiv = MediaPlayer.create(NumberActivity.this, R.raw.twentyfiv);
        twentysix = MediaPlayer.create(NumberActivity.this, R.raw.twentysix);
        twentyseven = MediaPlayer.create(NumberActivity.this, R.raw.twentyseven);
        twentyeigt = MediaPlayer.create(NumberActivity.this, R.raw.twntyeght);
        twentynine = MediaPlayer.create(NumberActivity.this, R.raw.twntynine);
        thrty = MediaPlayer.create(NumberActivity.this, R.raw.thrty);
        //twentytwo = MediaPlayer.create(NumberActivity.this, R.raw.friend);
        ListView list1 = (ListView) findViewById(R.id.Tibet5listview);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    zero.start();
                }
                if (position == 1) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    one.start();
                }
                if (position == 2) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    two.start();
                }
                if (position == 3) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    three.start();
                }
                if (position == 4) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    four.start();
                }
                if (position == 5) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    fiv.start();
                }
                if (position == 6) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    six.start();
                }
                if (position == 7) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    seven.start();
                }
                if (position == 8) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    eight.start();
                }
                if (position == 9) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    nine.start();
                }
                if (position == 10) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    ten.start();
                }
                if (position == 11) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    eleven.start();
                }
                if (position == 12) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twelve.start();
                }
                if (position == 13) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    thrtn.start();
                }
                if (position == 14) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    fortn.start();
                }
                if (position == 15) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    fiftn.start();
                }
                if (position == 16) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    sixtn.start();
                }
                if (position == 17) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    seventn.start();
                }
                if (position == 18) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    eightn.start();
                }
                if (position == 19) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    nintn.start();
                }
                if (position == 20) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twenty.start();
                }
                if (position == 21) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentyone.start();
                }
                if (position == 22) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentytwo.start();
                }
                if (position == 23) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentythre.start();
                }
                if (position == 24) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentyfor.start();
                }
                if (position == 25) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentyfiv.start();
                }
                if (position == 26) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentysix.start();
                }
                if (position == 27) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentyseven.start();
                }
                if (position == 28) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentyeigt.start();
                }
                if (position == 29) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    twentynine.start();
                }
                if (position == 30) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib5);
                    mytext.setText(name1[position]);
                    thrty.start();
                }

            }


        });
       // ListView list1 = (ListView) findViewById(R.id.Tibet5listview);
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
            convertView =getLayoutInflater().inflate(R.layout.numberclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name5);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker5);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
