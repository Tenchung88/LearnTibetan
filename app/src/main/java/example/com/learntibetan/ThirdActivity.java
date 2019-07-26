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

public class ThirdActivity extends AppCompatActivity {
    String[] names ={"Yes","No","DO You Understand","I don't understand","I understand","Thank You","Please",
    "I'm sorry","Please say that again","Can you repeat that","Can you speak slowly","It's alright","I dont know","I dont love",
    "I love","May I use your phone?","Are you sure?","What does this mean?","How do you pronounce this?","Could you write that down for me in Tibetan?",
    "No, thanks!","No, thats wrong","That's right","Help!","Who?","What?","How many?","How much?","How?","Why?","Why not?","Which?","Where?","When?","Is there?","Are there?","What is this?",
    "Whose is this?","How much is this?","What are you doing?","What do you want?","Where are we going?","We are going to Tibet","When is your birthday?","Dont forget..","Excuse me","Take care of yourself","Before","After",
    "I want to go shopping before watching the movie","I'll watch a movie after going shopping","Until","I don't have to go until tomorrow", "Do you love it here?","Do you live here",
    "I love it here","I'm here on holiday","on business","to work","to study","Just kidding!"};
    String[] name1 ={"ལགས་རེད།", "ལགས་མ་རེད།", "ཁྱེད་རང་མགོ་ཚུད་སོང་བས།", "ངའི་མགོ་ཚུད་མ་སོང་།", "ངའི་མགོ་ཚུད་སོང་།", "ཐུགས་རྗེ་ཆེ།"," ཐུགས་རྗེ་གཟིགས།",
    "དགོངས་དག", "ཐུགས་རྗེ་གཟིགས། ཡང་བསྐྱར་གསུང་རོགས།", "ཁྱེད་རང་ཡང་བསྐྱར་གསུང་ཐུབ་རེད་པས།","ཁྱེད་རང་ག་ལེར་གསུང་ཐུབ་ཀྱི་རེད་པས།","གྲིག་གི་རེད།", "ངའི་ཤེས་ཀྱི་མེད།","ངའི་དགའ་ཡི་མེད།",
    "ངའི་དགའ་ཡི་ཡོད།", "ངའི་ཁྱེད་རང་ཁ་པར་བེད་སྤྱོད་བཏང་ན་གྲིག་གི་རེད་པས།","ཁྱེད་རང་གཏན་གཏན་ཡོད་པས།","འདི་ག་རེ་གོ་ཀྱི་རེད།","འདི་ག་འདྲེས་ལབ་དགོས་རེད།", "ཁྱེད་རང་འདི་ངའི་ཆེད་དུ་བོད་སྐད་ནང་བྲིས་ཐུབ་ཀྱི་རེད་པས།",
    "མིན། ཐུགས་རྗེ་ཆེ་གནང་།", "མ་རེད། འདི་མ་རེད་","འདི་རེད།", "རོགས་པ་བྱེད་ད།","སུ།", "ག་རེ་/གང་།", "ག་ཚོད་","ག་ཚོད་",
    "ག་འདྲེས།","ག་རེ་བྱེད་ནས།", "ག་རེད་བྱེད་ནས་མ་རེད།","ག་གི།", "ག་པར།","ག་དུས","འདུག་པས།","ཁོ་ཚོ་འདུག་པས།","འདི་གང་རེད།" ,"འདི་སུའི་རེད།","འདི་ག་ཚོད་རེད།","ཁྱེད་རང་གང་བྱེད་ཀྱི་ཡོད།",
    "ཁྱེད་རང་ག་རེ་དགོས།","ང་ཚོ་ག་པར་འགྲོ་ཡ་རེད།","ང་ཚོ་བོད་ལ་འགྲོ་ཡི་ཡིན།","ཁྱེད་རང་སྐྱེད་སྐར་ག་དུས་རེད།",
    "དྲན་པ་མ་བརྗེད་ཨ།","དགོངས་སེལ་ཞུ་བ།","ཁྱེད་རང་ཅག་པོ་གནང་།","སྔོན་ལ་་་་","རྗེས་ལ་་་་་","ང་བལྟད་མོ་མ་བལྟས་གོང་ཉོ་ཚོང་རྒྱབ་དུ་འགྲོ་ཡི་ཡིན།","ང་ཉོ་ཚོང་རྒྱབ་ཚར་བའི་རྗེས་ལ་བལྟད་མོ་བལྟའ་ཡི་ཡིན།","བར་དུ།",
    "ང་སང་ཉིན་བར་དུ་འགྲོ་དགོས་མེད།","ཁྱེད་རང་འདིར་དགའ་སོང་བས།","ཁྱེད་རང་འདིར་བཞུགས་ཀྱི་ཡོད་པས།" ,"ངའི་འདིར་དགའ་སོང་།","ང་གུང་སེང་སྐབས་འདིར་ཡོད།","ཚོང་ཆེད་དུ།"," ལས་ཀ་ཆེད་དུ།",
    "སློབ་སྦྱོང་ཆེད་དུ།","སྐུ་བརྩེད་ཞུ་ཡིན།"};
    MediaPlayer yes,no,dustn,idntstn,idostn,thnk,pls,sorr,syagn,rept,spkslw,alrt,dnkn,dnlv,ilv,usphn,usur,mean,pronon,wrttibt,nthnk,nwrng,thtrht,hlp,who,wat,hwmny,hwmch,
    hwln,hw,why,whynt,which,whre,whn,isthr,arthr,wtisthis,whosisthis,hwmchthis,watrudng,wduwnt,wgntibt,whrwegng,whenurbrday,dntfrgt,excsem,tkcrslf,bf,af,bfmv,aftrshp,
    until,untltmr,dlvehr,dlivhre,ilvhr,mhrholid,onbsn,towork,tostudy,jstkidng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        yes = MediaPlayer.create(ThirdActivity.this, R.raw.yes);
        no = MediaPlayer.create(ThirdActivity.this, R.raw.no);
        dustn = MediaPlayer.create(ThirdActivity.this, R.raw.douunderstand);
        idntstn = MediaPlayer.create(ThirdActivity.this, R.raw.idontunderstand);
        idostn = MediaPlayer.create(ThirdActivity.this, R.raw.iunderstnad);
        thnk = MediaPlayer.create(ThirdActivity.this, R.raw.thanku);
        pls  = MediaPlayer.create(ThirdActivity.this, R.raw.please);
        sorr = MediaPlayer.create(ThirdActivity.this, R.raw.sorry);
        syagn = MediaPlayer.create(ThirdActivity.this, R.raw.pleasesayagain);
        rept = MediaPlayer.create(ThirdActivity.this, R.raw.canurepeat);
        spkslw = MediaPlayer.create(ThirdActivity.this, R.raw.canspeakslowly);
        alrt = MediaPlayer.create(ThirdActivity.this, R.raw.okay);
        dnkn = MediaPlayer.create(ThirdActivity.this, R.raw.idontknow);
        dnlv = MediaPlayer.create(ThirdActivity.this, R.raw.idontlove);
        ilv = MediaPlayer.create(ThirdActivity.this, R.raw.ilove);
        usphn = MediaPlayer.create(ThirdActivity.this, R.raw.mayiusephone);
        usur = MediaPlayer.create(ThirdActivity.this, R.raw.rusure);
        mean = MediaPlayer.create(ThirdActivity.this, R.raw.whatdoesmean);
        pronon = MediaPlayer.create(ThirdActivity.this, R.raw.howcanisay);
        wrttibt = MediaPlayer.create(ThirdActivity.this, R.raw.canwriteintibetabforme);
        nthnk = MediaPlayer.create(ThirdActivity.this, R.raw.nothanks);
        nwrng = MediaPlayer.create(ThirdActivity.this, R.raw.nothatswrong);
        thtrht = MediaPlayer.create(ThirdActivity.this, R.raw.itsright);
        hlp = MediaPlayer.create(ThirdActivity.this, R.raw.help);
        who = MediaPlayer.create(ThirdActivity.this, R.raw.who);
        wat = MediaPlayer.create(ThirdActivity.this, R.raw.what);
        hwmny = MediaPlayer.create(ThirdActivity.this, R.raw.howmany);
        hwmch = MediaPlayer.create(ThirdActivity.this, R.raw.howmuch);
        hw = MediaPlayer.create(ThirdActivity.this, R.raw.how);
        why = MediaPlayer.create(ThirdActivity.this, R.raw.why);
        whynt = MediaPlayer.create(ThirdActivity.this, R.raw.whynot);
        which= MediaPlayer.create(ThirdActivity.this, R.raw.which);
        whre = MediaPlayer.create(ThirdActivity.this, R.raw.where);
        whn = MediaPlayer.create(ThirdActivity.this, R.raw.when);
        isthr = MediaPlayer.create(ThirdActivity.this, R.raw.isthere);
        arthr = MediaPlayer.create(ThirdActivity.this, R.raw.arethere);
        wtisthis= MediaPlayer.create(ThirdActivity.this, R.raw.whatisthis);
        whosisthis = MediaPlayer.create(ThirdActivity.this, R.raw.whoseisthis);
        hwmchthis= MediaPlayer.create(ThirdActivity.this, R.raw.howmuchisthis);
        watrudng = MediaPlayer.create(ThirdActivity.this, R.raw.whatudoing);
        wduwnt = MediaPlayer.create(ThirdActivity.this, R.raw.whatuwant);
        whrwegng = MediaPlayer.create(ThirdActivity.this, R.raw.wherewergoing);
        wgntibt= MediaPlayer.create(ThirdActivity.this, R.raw.iamgoingtotibet);
        whenurbrday= MediaPlayer.create(ThirdActivity.this, R.raw.whebisurbirthday);
        dntfrgt = MediaPlayer.create(ThirdActivity.this, R.raw.dontforget);
        excsem = MediaPlayer.create(ThirdActivity.this, R.raw.sorry);
        tkcrslf= MediaPlayer.create(ThirdActivity.this, R.raw.takecareofurself);
        bf = MediaPlayer.create(ThirdActivity.this, R.raw.before);
        af = MediaPlayer.create(ThirdActivity.this, R.raw.later);
        bfmv = MediaPlayer.create(ThirdActivity.this, R.raw.beforemoviewshopping);
         aftrshp= MediaPlayer.create(ThirdActivity.this, R.raw.aftershoppingmiview);
        until = MediaPlayer.create(ThirdActivity.this, R.raw.until);
        untltmr = MediaPlayer.create(ThirdActivity.this, R.raw.untiltomrow);
        dlvehr= MediaPlayer.create(ThirdActivity.this, R.raw.doulovehere);
        dlivhre = MediaPlayer.create(ThirdActivity.this, R.raw.doulivehere);
        ilvhr= MediaPlayer.create(ThirdActivity.this, R.raw.ilikehere);
        mhrholid = MediaPlayer.create(ThirdActivity.this, R.raw.hereonholidays);
        onbsn = MediaPlayer.create(ThirdActivity.this, R.raw.onbusinnes);
        towork = MediaPlayer.create(ThirdActivity.this, R.raw.towork);
        tostudy= MediaPlayer.create(ThirdActivity.this, R.raw.education);
        jstkidng= MediaPlayer.create(ThirdActivity.this, R.raw.justkidding);
        ListView list1 = (ListView) findViewById(R.id.Tibet2listview);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    yes.start();
                }
                if(position ==1)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    no.start();
                }
                if(position ==2)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dustn.start();
                }
                if(position ==3)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    idntstn.start();
                }
                if(position ==4)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    idostn.start();
                }
                if(position ==5)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    thnk.start();
                }
                if(position ==6)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    pls.start();
                }
                if(position ==7)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    sorr.start();
                }
                if(position ==8)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    syagn.start();
                }
                if(position ==9)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    rept.start();
                }
                if(position ==10)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    spkslw.start();
                }
                if(position ==11)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    alrt.start();
                }
                if(position ==12)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dnkn.start();
                }
                if(position ==13)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dnlv.start();
                }
                if(position ==14)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    ilv.start();
                }


                  if(position ==15)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    usphn.start();
                }
                    if(position ==16)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        usur.start();
                    }
                    if(position ==17)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        mean.start();
                    }
                    if(position ==18)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        pronon.start();
                    }
                    if(position ==19)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        wrttibt.start();
                    }
                    if(position ==20)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        nthnk.start();
                    }
                    if(position ==21)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        nwrng.start();
                    }
                    if(position ==22)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        thtrht.start();
                    }
                    if(position ==23)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        hlp.start();
                    }
                    if(position ==24)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        who.start();
                    }
                    if(position ==25)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        wat.start();
                    }
                    if(position ==26)
                    {
                        TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                        mytext.setText(name1[position]);
                        hwmny.start();
                    }
                    if(position ==27)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    hwmch.start();
                }
                if(position ==28){
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    hw.start();
                }
                if(position ==29)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    why.start();
                }
                if(position ==30)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whynt.start();
                }
                if(position ==31)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    which.start();
                }
                if(position ==32)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whre.start();
                }
                if(position ==33)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whn.start();
                }
                if(position ==34)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    isthr.start();
                }
                if(position ==35)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    arthr.start();
                }
                if(position ==36)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    wtisthis.start();
                }
                if(position ==37)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whosisthis.start();
                }
                if(position ==38)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    hwmchthis.start();
                }
                if(position ==39)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    watrudng.start();
                }
                if(position ==40)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    wduwnt.start();
                }
                if(position ==41)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whrwegng.start();
                }
                if(position ==42)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    wgntibt.start();
                }
                if(position ==43)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    whenurbrday.start();
                }
                if(position ==44)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dntfrgt.start();
                }
                if(position ==45)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    excsem.start();
                }
                if(position ==46)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    tkcrslf.start();
                }
                if(position ==47)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    bf.start();
                }
                if(position ==48)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    af.start();
                }
                if(position ==49)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    bfmv.start();
                }
                if(position ==50)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    aftrshp.start();
                }
                if(position ==51)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    until.start();
                }
                if(position ==52)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    untltmr.start();
                }
                if(position ==53)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dlvehr.start();
                }
                if(position ==54)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    dlivhre.start();
                }
                if(position ==55)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    ilvhr.start();
                }
                if(position ==56)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    mhrholid.start();
                }
                if(position ==57)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    onbsn.start();
                }
                if(position ==58)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    towork.start();
                }
                if(position ==59)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    tostudy.start();
                }
                if(position ==60)
                {
                    TextView mytext = (TextView) view.findViewById(R.id.textView_tib2);
                    mytext.setText(name1[position]);
                    jstkidng.start();
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
            convertView =getLayoutInflater().inflate(R.layout.thirdclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name2);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker2);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
