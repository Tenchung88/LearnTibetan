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

public class SecondActivity extends AppCompatActivity {
    String[] names = {"Hello/Hi", "Good morning","Good afternoon","Good evening","Good night","How are you",
    "I'm fine","Good","Bad","Soso","Great","I am not well","What's your name","My name is","See you later","Good Bye","Bye","Take care","How about you",
    "Nice to meet you","Its been a while","Can you speak Tibetan","I can speak Tibetan","I can't speak Chinese",
    "I'm from Tibet","How old are you","I am 7 years old"};

    String[] name1 = {"བཀྲ་ཤིས་བདེ་ལེགས།", "སྔ་དྲོ་བདེ་ལེགས།", "ཉིན་གུང་བདེ་ལེགས།", "ཕྱི་དྲོ་བདེ་ལེགས།","གཟིམ་འཇག་གནང་།", "ཁྱེད་རང་བདེ་པོ་ཡིན་པས།", "ང་རང་བདེ་པོ་ཡིན།་","ཡག་པོ།", "མི་ལེགས་པ།",
    "གྲིག་ཙམ།","ལེགས་པོ།", "ང་བདེ་པོ་མིན་འདུག", "ཁྱེད་རང་མིང་ལ་གང་རེད།", "ངའི་མིང་ལ་་་་་་་་་", "རྗེས་ལ་མཇལ་ཡོང་།", "ག་ལེར་ཕེབས།", "བཞུགས་ཨ།", "ཅག་པོ་གནང་།", "ཁྱེད་རང་གང་འདྲའི་ཡོད།", "ཁྱེད་རང་མཇལ་བ་དགའ་པོ་བྱུང་།",
    "དུས་ཚོད་ཡུད་ཙམ་རྗེས་ལ་་་་་་", "ཁྱེད་རང་བོད་སྐད་བཤད་ཐུབ་ཀྱི་ཡོད་པས།", "ངའི་བོད་སྐད་བཤད་ཐུབ་ཀྱི་ཡོད།", "ངའི་རྒྱ་སྐད་བཤད་མི་ཐུབ།", "ང་བོད་ནས་ཡིན།", "ཁྱེད་རང་ལོ་ག་ཚོད་ཡིན་པའི།","ང་ལོ་་་་།"};
    MediaPlayer TD,GM,GA,GE,GN,HRU,mfn,gd,bd,Grt,so,ntwl,urnm,mynm,seultr,gdbye,bye,tkcr,hwbtu,ncmtu,bw,spktib,cnspk,cntchin,mtibt,old,mold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("GREETINGS");
        TD = MediaPlayer.create(SecondActivity.this, R.raw.tashidele);
        GM = MediaPlayer.create(SecondActivity.this, R.raw.gm);
         GA = MediaPlayer.create(SecondActivity.this, R.raw.ga);
         GE = MediaPlayer.create(SecondActivity.this, R.raw.ge);
         //GN = MediaPlayer.create(SecondActivity.this, R.raw.);
         HRU = MediaPlayer.create(SecondActivity.this, R.raw.hru);
        mfn = MediaPlayer.create(SecondActivity.this, R.raw.mfine);
        gd = MediaPlayer.create(SecondActivity.this, R.raw.good);
        bd = MediaPlayer.create(SecondActivity.this, R.raw.bad);
        Grt = MediaPlayer.create(SecondActivity.this, R.raw.great);
        so = MediaPlayer.create(SecondActivity.this, R.raw.soso);
        ntwl = MediaPlayer.create(SecondActivity.this, R.raw.mbad);
        urnm = MediaPlayer.create(SecondActivity.this, R.raw.wurname);
      mynm = MediaPlayer.create(SecondActivity.this, R.raw.myname);
      seultr = MediaPlayer.create(SecondActivity.this, R.raw.seeulater);
        gdbye = MediaPlayer.create(SecondActivity.this, R.raw.goodbye);
        bye = MediaPlayer.create(SecondActivity.this, R.raw.byebye);
        tkcr = MediaPlayer.create(SecondActivity.this, R.raw.takecare);
        hwbtu = MediaPlayer.create(SecondActivity.this, R.raw.whatabtu);
       ncmtu = MediaPlayer.create(SecondActivity.this, R.raw.nicetomeetu);
        bw = MediaPlayer.create(SecondActivity.this, R.raw.itsbeenwhile);
        spktib = MediaPlayer.create(SecondActivity.this, R.raw.duspeaktibet);
        cnspk = MediaPlayer.create(SecondActivity.this, R.raw.ispeaktibet);
        cntchin = MediaPlayer.create(SecondActivity.this, R.raw.idontspeakchine);
        mtibt = MediaPlayer.create(SecondActivity.this, R.raw.mfrmtibet);
        old = MediaPlayer.create(SecondActivity.this, R.raw.urage);
        mold = MediaPlayer.create(SecondActivity.this, R.raw.m7years);
        ListView list1 = (ListView) findViewById(R.id.Tibet1listview);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    TD.start();
                }
                if(position ==1)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    GM.start();
                }
                if(position ==2)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    GA.start();
                }
                if(position ==3)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    GE.start();
                }
                if(position ==4)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    GE.start();
                }
                if(position ==5)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    HRU.start();
                }
                if(position ==6)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    mfn.start();
                }
                if(position ==7)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    gd.start();
                }
                if(position ==8)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    bd.start();
                }
                if(position ==9)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    so.start();
                }
                if(position ==10)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    Grt.start();
                }
                if(position ==11)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    ntwl.start();
                }
                if(position ==12)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    urnm.start();
                }
                if(position ==13)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    mynm.start();
                }
                if(position ==14)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    seultr.start();
                }
                if(position ==15)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    gdbye.start();
                }
                if(position ==16)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    bye.start();
                }
                if(position ==17)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    tkcr.start();
                }
                if(position ==18)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    hwbtu.start();
                }
                if(position ==19)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    ncmtu.start();
                }
                if(position ==20)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    bw.start();
                }
                if(position ==21)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    spktib.start();
                }
                if(position ==22)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    cnspk.start();
                }
                if(position ==23)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    cntchin.start();
                }
                if(position ==24)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    mtibt.start();
                }
                if(position ==25)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    old.start();
                }
                if(position ==26)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib1);
                    mytext.setText(name1[position]);
                    mold.start();
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
            convertView =getLayoutInflater().inflate(R.layout.secondclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name1);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker);
            myimg.setImageResource(R.drawable.speaker);

            return convertView;
        }
    }
}
