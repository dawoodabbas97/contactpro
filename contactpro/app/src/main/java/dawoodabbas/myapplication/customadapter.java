
package dawoodabbas.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class customadapter extends ArrayAdapter<String>{
    public int[] a;

    public customadapter(Context context, String[] objects,int[] img) {
        super(context, R.layout.customview, objects);
        a=img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater abbasInflater = LayoutInflater.from(getContext());
        View CustomView = abbasInflater.inflate(R.layout.customview, parent, false);
        int images;
        images = a[position];
        String singlename = getItem(position);
        TextView abbasText = (TextView) CustomView.findViewById(R.id.abbasText);
        ImageView abbasImage = (ImageView) CustomView.findViewById((R.id.abbasImage));
        abbasText.setText(singlename);
        abbasImage.setImageResource(images);
        return CustomView;
    }
}





