package pillapp.viewcontroller;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.pharmalogue.R;
import com.google.gson.Gson;

import java.util.List;

import pillapp.model.Drug;
import pillapp.model.PillBox;
import pillapp.viewcontroller.adapter.DrugListAdapter;

public class DrugDictionaryActivity extends AppCompatActivity {

    private DrugListAdapter drugListAdapter;
    private ListView listView;
    private EditText search;
    private PillBox pillBox = new PillBox();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_dictionary);

        listView = (ListView) findViewById(R.id.listView);
        search = (EditText) findViewById(R.id.search);
        drugListAdapter = new DrugListAdapter(getApplicationContext());
        listView.setAdapter(drugListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drug drug = drugListAdapter.getItem(position);
                Intent intent = new Intent(DrugDictionaryActivity.this, DrugDetailActivity.class);
                intent.putExtra("DRUG", new Gson().toJson(drug));
                startActivity(intent);
            }
        });
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                new GetDrugTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, s.toString());
            }
        });


        new GetDrugTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");

    }

    class GetDrugTask extends AsyncTask<String, Void, List<Drug>> {

        @Override
        protected List<Drug> doInBackground(String... params) {
            if (params[0].isEmpty()) {
                return pillBox.getAllDrugs(DrugDictionaryActivity.this);
            } else {
                return pillBox.getDrugsByGeneric(DrugDictionaryActivity.this, params[0]);
            }
        }

        @Override
        protected void onPostExecute(List<Drug> drugs) {
            super.onPostExecute(drugs);
            drugListAdapter.setItems(drugs);
        }
    }

}
