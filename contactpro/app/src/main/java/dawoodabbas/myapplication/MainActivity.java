package dawoodabbas.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity
{

    String[] names={"dravid","dhoni","gambhir","rohit","sachin","virat"};
    String[] r;
    String  temp;
    int temp1;
    int[] pic={R.drawable.download,R.drawable.gaara,R.drawable.pic2,R.drawable.ging,R.drawable.gon,R.drawable.hisoka};
     int[]num=pic;
    public void list()
    {
        ListAdapter abbasadapter =new dawoodabbas.myapplication.customadapter(this,names,pic);
        ListView abbasListView=(ListView)findViewById(R.id.abbasListView);
        abbasListView.setAdapter(abbasadapter);
    }

    public  void main()

    {String[] Array=names;
        int[] num=pic;
        String temp;
        int tem;

        for (int j = 0; j < names.length; j++) {
            for (int i = j + 1; i < names.length; i++) {
                if((names[i].trim().compareTo(names[j].trim())<0)) {
                     temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                    tem=num[j];
                    num[j]=num[i];
                    num[i]=tem;


                }

            }
        }
        r=names;
        num=pic;
    }

    public  void main1()

    {
        String[] Array=names;
        int[] num=pic;
        String temp;
        int tem;
        for(int j=0; j<names.length;j++)
        {
            for (int i=j+1 ; i<names.length; i++)
            {
                if((names[i].trim().compareTo(names[j].trim())>0))
                {
                     temp= names[j];
                    names[j]= names[i];
                    names[i]=temp;
                    tem=num[j];
                    num[j]=num[i];
                    num[i]=tem;


                }
            }


        }
    r=names;
     num=pic;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list();

    }


    public void OnToggleClicked(View view1)
    {
        boolean on = ((ToggleButton) view1).isChecked();

        if (on) {
            main();

            list();
        }



        else
        {
            main1();
            list();
        }
    }
    public void search(View v){
        int flag=0;
        EditText name=(EditText)findViewById(R.id.search);
        String see=name.getText().toString();

        for(String i : r){
            if(i.compareToIgnoreCase(see)==0){
                Toast.makeText(getApplicationContext(), "Found: " + i, Toast.LENGTH_SHORT).show();
                flag=1;

            }

        }
        if(flag==0)
            Toast.makeText(getApplicationContext(),"NotFound",Toast.LENGTH_SHORT).show();


    }


}

