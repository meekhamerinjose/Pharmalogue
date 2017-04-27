package pillapp.viewcontroller;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.pharmalogue.R;
import com.google.gson.Gson;

import pillapp.model.Drug;

public class DrugDetailActivity extends AppCompatActivity {

    private Drug drug;
    private TextView drugGenericName;
    private TextView drugBrandName;
    private TextView drugPrescriptionDetails;
    private TextView drugContraindications;
    private TextView drugPregnancyCategory;
    private TextView drugDosage;
    private TextView drugWarnings;
    private TextView drugSideEffects;
    private TextView drugInteractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_detail);
        String drugJson = getIntent().getStringExtra("DRUG");
        if(drugJson.isEmpty())
            finish();
        drug = new Gson().fromJson(drugJson, Drug.class);

        drugGenericName = (TextView) findViewById(R.id.drugGenericName);
        drugBrandName = (TextView) findViewById(R.id.drugBrandName);
        drugPrescriptionDetails = (TextView) findViewById(R.id.drugPrescriptionDetails);
        drugContraindications = (TextView) findViewById(R.id.drugContraindications);
        drugPregnancyCategory = (TextView) findViewById(R.id.drugPregnancyCategory);
        drugDosage = (TextView) findViewById(R.id.drugDosage);
        drugWarnings = (TextView) findViewById(R.id.drugWarnings);
        drugSideEffects = (TextView) findViewById(R.id.drugSideEffects);
        drugInteractions = (TextView) findViewById(R.id.drugInteractions);

        drugGenericName.setText(drug.getDrugGenericName());
        drugBrandName.setText(drug.getDrugBrandName());
        drugPrescriptionDetails.setText(drug.getDrugPrescriptionDetails());
        drugContraindications.setText(drug.getDrugContraindications());
        drugPregnancyCategory.setText(drug.getDrugPregnancyCategory());
        drugDosage.setText(drug.getDrugDosage());
        drugWarnings.setText(drug.getDrugWarnings());
        drugSideEffects.setText(drug.getDrugSideEffects());
        drugInteractions.setText(drug.getDrugInteractions());

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(drug.getDrugBrandName());
        }
    }

}
