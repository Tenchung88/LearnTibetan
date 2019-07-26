package example.com.learntibetan;

import android.media.MediaPlayer;
import android.provider.FontsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity {
    String names[] ={"Family","How many people are there in your family?","Do you have?","This is my..","Brother","Elder brother","Younger brother",
            "Sister","Elder sister","Younger sister","Mother","Father","Son","Daughter","Grandson/Nephew","Granddaughter/Niece",
    "Uncle","Aunt","Husband","Wife","Boyfriend/Girlfriend","Friend","Relative","Parents","Cousin","Grandfather","Grandmother"};
    String[] name1 ={"ནང་མི།","ཁྱེད་རང་ནང་ལ་ནང་མི་ག་ཚོད་ཡོད།","ཁྱེད་རང་ལ་ཡོད་པས།","འདི་ངའི་་་","ཅོ་ཅོ།","ཅོ་ཅོ་རྒན་པ།", "ཅོ་ཅོ་ཆུང་བ།","ཨ་ཅག", "ཨ་ཅག་རྒན་པ།" , "ཨ་ཅག་ཆུང་བ།","ཨ་མ་ལགས།","པཱ་ལགས།",
    "བུ།","བུ་མོ།","ཚ་བོ།","ཚ་མོ།","ཨ་ཞང་།/ཨ་གུ།","ཨ་ནེ།","ཁྱོ་ཁ།","ཟ་ཟླ།","དགའ་རོགས།","གྲོགས་པོ།་་་་་གྲོགས་མོ།","སྤུན་ཉེ།","ཕ་མ།","ཕ་མ་སྤུན་ཕྲུག།","པོ་པོ།","མོ་མོ།"};


    MediaPlayer family,hwmnyfam,duhve,itsmy,brother,eldrbro,youngerbro,sister,eldrsistr,youngrsis,mother,father,son,daughetr,GrandsonNephew,Granddaughteniece,
    uncle,aunt,husbnd,wfe,bfgf,frn,relative,parents,cousin,grndfthr,grndmother;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        family = MediaPlayer.create(FamilyActivity.this, R.raw.family);
        hwmnyfam = MediaPlayer.create(FamilyActivity.this, R.raw.howmanyfamily);
        duhve = MediaPlayer.create(FamilyActivity.this, R.raw.douhave);
        itsmy = MediaPlayer.create(FamilyActivity.this, R.raw.itsmy);
        brother = MediaPlayer.create(FamilyActivity.this, R.raw.brother);
        eldrbro = MediaPlayer.create(FamilyActivity.this, R.raw.elderbrother);
        youngerbro = MediaPlayer.create(FamilyActivity.this, R.raw.youngerbro);
        sister = MediaPlayer.create(FamilyActivity.this, R.raw.sister);
        eldrsistr = MediaPlayer.create(FamilyActivity.this, R.raw.youngersisy);
        youngrsis = MediaPlayer.create(FamilyActivity.this, R.raw.youngersisy);
        mother = MediaPlayer.create(FamilyActivity.this, R.raw.mother);
        father = MediaPlayer.create(FamilyActivity.this, R.raw.father);
        son = MediaPlayer.create(FamilyActivity.this, R.raw.son);
        daughetr = MediaPlayer.create(FamilyActivity.this, R.raw.daughetr);
        GrandsonNephew = MediaPlayer.create(FamilyActivity.this, R.raw.niece);
        Granddaughteniece = MediaPlayer.create(FamilyActivity.this, R.raw.niece);
        uncle = MediaPlayer.create(FamilyActivity.this, R.raw.uncle);
        aunt = MediaPlayer.create(FamilyActivity.this, R.raw.aunt);
        husbnd = MediaPlayer.create(FamilyActivity.this, R.raw.wife);
        wfe = MediaPlayer.create(FamilyActivity.this, R.raw.wife);
        bfgf = MediaPlayer.create(FamilyActivity.this, R.raw.boygirlfrb);
        frn = MediaPlayer.create(FamilyActivity.this, R.raw.friend);
        relative = MediaPlayer.create(FamilyActivity.this, R.raw.relative);
        parents = MediaPlayer.create(FamilyActivity.this, R.raw.parents);
        cousin = MediaPlayer.create(FamilyActivity.this, R.raw.cousin);
        grndfthr = MediaPlayer.create(FamilyActivity.this, R.raw.cousin);
        grndmother = MediaPlayer.create(FamilyActivity.this, R.raw.cousin);
        ListView list1 = (ListView) findViewById(R.id.Tibet4listview);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    family.start();
                }
                if (position == 1) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    hwmnyfam.start();
                }
                if (position == 2) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    duhve.start();
                }
                if (position == 3) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    itsmy.start();
                }
                if (position == 4) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    brother.start();
                }
                if (position == 5) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    eldrbro.start();
                }
                if (position == 6) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    youngerbro.start();
                }
                if (position == 7) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    sister.start();
                }
                if (position == 8) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    eldrsistr.start();
                }
                if (position == 9) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    youngrsis.start();
                }
                if (position == 10) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    mother.start();
                }
                if (position == 11) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    father.start();
                }
                if (position == 12) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    son.start();
                }
                if (position == 13) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    daughetr.start();
                }
                if (position == 14) {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    GrandsonNephew.start();
                }
                if(position ==15)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    Granddaughteniece.start();
                }
                if(position ==16)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    uncle.start();
                }
                if(position ==17)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    aunt.start();
                }
                if(position ==18)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    husbnd.start();
                }
                if(position ==19)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    wfe.start();
                }
                if(position ==20)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    bfgf.start();
                }
                if(position ==21)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    frn.start();
                }
                if(position ==22)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    relative.start();
                }
                if(position ==23)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    parents.start();
                }
                if(position ==24)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    cousin.start();
                }
                if(position ==25)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    grndfthr.start();
                }
                if(position ==26)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib4);
                    mytext.setText(name1[position]);
                    grndmother.start();
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
            convertView =getLayoutInflater().inflate(R.layout.familyclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name4);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker4);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
