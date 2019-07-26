package example.com.learntibetan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    int[] images = { R.drawable.alphabetfinal,R.drawable.vowelsfina,R.drawable.pronounfinal,R.drawable.greetings1,R.drawable.conversationss,R.drawable.colors,
  R.drawable.family1,R.drawable.numbers};
    String[] names ={"ALPHABETS","FOUR VOWELS ","PRONOUNS","GREETINGS","CONVERSATIONS","COLORS","FAMILY",
    "NUMBERS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.Tibetlistview );
        customAdaptor customAdaptor = new customAdaptor();
        listView.setAdapter(customAdaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent i = new Intent(MainActivity.this, AlphabetActivity.class);
                    startActivity(i);
                }
                if(position == 1){
                    Intent i = new Intent(MainActivity.this, VowelsActivity.class);
                    startActivity(i);
                    }

                if(position ==2){
                    Intent i = new Intent(MainActivity.this, PronounsActivity.class);
                    startActivity(i);
                }

                if(position ==3){
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i);
                }

                if(position == 4){
                    Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(i);
                }
                if(position ==5){
                    Intent i = new Intent(MainActivity.this, FourthActivity.class);
                    startActivity(i);
                }
                if(position ==6){
                    Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(i);
                }
                if(position ==7){
                    Intent i = new Intent(MainActivity.this, NumberActivity.class);
                    startActivity(i);
                }



            }
        });
    }
    class customAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
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
            convertView =getLayoutInflater().inflate(R.layout.customlayout, null);
           ImageView img = (ImageView) convertView.findViewById(R.id.image_id);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name);
           img.setImageResource(images[position]);
             mytext.setText(names[position]);

            return convertView;
        }
    }

}
