package pillapp.viewcontroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pharmalogue.R;

import pillapp.model.PillBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonPillReminder;
    Button buttonBmiCalc;
    Button buttondd;
    PillBox pillBox = new PillBox();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPillReminder = (Button) findViewById(R.id.buttonpillr);
        buttonBmiCalc = (Button) findViewById(R.id.buttonbmi);
        buttondd = (Button) findViewById(R.id.buttondd);

        buttonPillReminder.setOnClickListener(this);
        buttonBmiCalc.setOnClickListener(this);
        buttondd.setOnClickListener(this);

        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle(R.string.app_name);
        }

        pillBox.addDrugs(getApplicationContext());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonpillr:
                Intent intentpr = new Intent(this, PillReminderActivity.class);
                startActivity(intentpr);
                break;
            case R.id.buttonbmi:
                Intent intentbmi = new Intent(this, BMIActivity.class);
                startActivity(intentbmi);
                break;
            case R.id.buttondd:
                Intent intentdd = new Intent(this, DrugDictionaryActivity.class);
                startActivity(intentdd);
                break;
        }
    }
}

