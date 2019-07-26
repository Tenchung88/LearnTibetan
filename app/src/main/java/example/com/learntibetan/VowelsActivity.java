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

public class VowelsActivity extends AppCompatActivity {
    String[] names = {"   ི་ ","  ུ  ","   ེ ","   ོ "};
    String[] name1 = {"གི་གུ","ཞབས་སྐ྄྄་","འབྲེང་པོ་","ན་རོ།"};
MediaPlayer i,u,e,o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourvowels);

        i = MediaPlayer.create(VowelsActivity.this, R.raw.khekhu1);
        u = MediaPlayer.create(VowelsActivity.this, R.raw.shapku1);
        e = MediaPlayer.create(VowelsActivity.this, R.raw.dengpo1);
        o = MediaPlayer.create(VowelsActivity.this, R.raw.naro1);
        ListView list1 = (ListView) findViewById(R.id.Tibet6listview);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib6);
                    mytext.setText(name1[position]);
                    i.start();
                }
                if(position ==1)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib6);
                    mytext.setText(name1[position]);
                    u.start();
                }
                if(position ==2)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib6);
                    mytext.setText(name1[position]);
                    e.start();
                }
                if(position ==3)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib6);
                    mytext.setText(name1[position]);
                    o.start();
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
            convertView =getLayoutInflater().inflate(R.layout.vowelclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name6);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker6);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}


