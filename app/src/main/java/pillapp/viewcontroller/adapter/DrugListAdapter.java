package pillapp.viewcontroller.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pharmalogue.R;

import java.util.ArrayList;
import java.util.List;

import pillapp.model.Drug;
import pillapp.model.PillBox;

/**
 * Created by Android SD-1 on 18-04-2017.
 */

public class DrugListAdapter extends BaseAdapter {

    private List<Drug> drugList;
    private Context context;

    public DrugListAdapter(Context context) {
        this.drugList = new ArrayList<>();
        this.context = context;
    }

    @Override
    public int getCount() {
        return drugList.size();
    }

    @Override
    public Drug getItem(int position) {
        return drugList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setItems(List<Drug> drugList){
        this.drugList = drugList;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Drug drug = getItem(position);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.item_drug, null);
        }

        TextView name = (TextView) convertView.findViewById(R.id.textView);
        TextView genericName = (TextView) convertView.findViewById(R.id.textView2);

        name.setText(drug.getDrugBrandName());
        genericName.setText(drug.getDrugGenericName());

        return convertView;
    }
}
