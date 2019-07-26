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

public class PronounsActivity extends AppCompatActivity {
    String[] names = {"I","You","He/She","We","You","They","This","That","These","Those"};
    String[] name1 = {"ང་","ཁྱེད་རང་","ཁོང་","ང་ཚོ་","ཁྱེད་རང་ཚོ་","ཁོ་ཚོ་","འདི་","དེ་","འདི་ཚོ་","དེ་ཚོ་"};
    MediaPlayer i, you, he,we,u,they,tis,tht,thse,thos;
MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronouns);

        i = MediaPlayer.create(PronounsActivity.this, R.raw.nga);
        you = MediaPlayer.create(PronounsActivity.this, R.raw.kherang);
        he = MediaPlayer.create(PronounsActivity.this, R.raw.khotso);
        we = MediaPlayer.create(PronounsActivity.this, R.raw.ngatso);
        u = MediaPlayer.create(PronounsActivity.this, R.raw.kherangtso);
        they = MediaPlayer.create(PronounsActivity.this, R.raw.khotso);
        tis = MediaPlayer.create(PronounsActivity.this, R.raw.tis);
        tht= MediaPlayer.create(PronounsActivity.this, R.raw.that);
        thse = MediaPlayer.create(PronounsActivity.this, R.raw.thse);
        thos= MediaPlayer.create(PronounsActivity.this, R.raw.those);

        ListView list1 = (ListView) findViewById(R.id.Tibet7listview);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    i.start();
                }
                if(position ==1)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    you.start();
                }
                if(position ==2)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    he.start();
                }
                if(position ==3)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    we.start();
                }
                if(position ==4)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    u.start();
                }
                if(position ==5)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    they.start();
                }
                if(position ==6)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    tis.start();
                }
                if(position ==7)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    tht.start();
                }
                if(position ==8)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    thse.start();
                }
                if(position ==9)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib7);
                    mytext.setText(name1[position]);
                    thos.start();
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
            convertView =getLayoutInflater().inflate(R.layout.pronounclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name7);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker7);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
