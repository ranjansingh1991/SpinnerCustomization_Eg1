package in.semicolonindia.spinnercustomization_eg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] dogsNames={"Charlie","Buddy","Molly","Maggie","Lola","Duke"};
    int dogs[] = {R.drawable.image, R.drawable.images1, R.drawable.images2,
            R.drawable.images3, R.drawable.images4, R.drawable.images5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),dogs,dogsNames);
        spin.setAdapter(customAdapter);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), dogsNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
