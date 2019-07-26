package example.com.learntibetan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TimedateActivity extends AppCompatActivity {
    String names[] ={"what time is it?","It's 10 o'clock","AM","PM","1 hour","Half an hour","5 minutes",
            "At what time does it start?","It starts at 9am","How many hours will it take?","How many days will it take","Midnight","Noon","Today","Yesterday","The day before yesterday",
            "Tomorrow","The day after tomorrow","Tonight","Last night","Morning","Afternoon","Evening","Now","Soon"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timedate);
        ListView list1 = (ListView) findViewById(R.id.Tibet6listview);
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
            convertView =getLayoutInflater().inflate(R.layout.timedateclayout, null);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name6);
            mytext.setText(names[position]);
            ImageView myimg = (ImageView) convertView.findViewById(R.id.speaker6);
            myimg.setImageResource(R.drawable.speaker);


            return convertView;
        }
    }
}
