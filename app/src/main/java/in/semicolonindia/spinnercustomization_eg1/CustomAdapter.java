package in.semicolonindia.spinnercustomization_eg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RANJAN SINGH on 5/17/2018.
 */
@SuppressWarnings("ALL")
public class CustomAdapter extends BaseAdapter {

    Context context;
    int dogs[];
    String[] dogsNames;
    LayoutInflater inflter;

    public CustomAdapter(Context context, int[] dogs, String[] dogsNames) {
        this.context = context;
        this.dogs = dogs;
        this.dogsNames = dogsNames;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return dogs.length;
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

    convertView = inflter.inflate(R.layout.ustom_spinner_items, null);
        ImageView icon = (ImageView) convertView.findViewById(R.id.imageView);
        TextView names = (TextView) convertView.findViewById(R.id.textView);
        icon.setImageResource(dogs[position]);
        names.setText(dogsNames[position]);
        return convertView;
    }
}
