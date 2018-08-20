package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProductFragment extends Fragment {
    View view;
    public ProductFragment() {
    }

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(Bundle)} and {@link #onActivityCreated(Bundle)}.
     * <p>
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.product_fragment,container,false);

        String[] products = {"K-Pariksha","K-Shiksha","Online Pariksha","E-Magazine","K-Shiksha HER","E-Waste","School ERP","Complaint Management",
                "Water Distribution","Training ERP"};

        ListView productlist=view.findViewById(R.id.product_list);
        ArrayAdapter<String> listadapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,products);
        productlist.setAdapter(listadapter);
        productlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String productlist=(String) adapterView.getItemAtPosition(i);
                if (i==0){
                    startActivity(new Intent(getActivity(),KparikshaActivity.class));
                } else if (i==1){
                    startActivity(new Intent(getActivity(),KshikshaActivity.class));
                } else if (i==2){
                    startActivity(new Intent(getActivity(),OnparikshaActivity.class));
                } else if (i==3){
                    startActivity(new Intent(getActivity(),EmagazineActivity.class));
                } else if (i==4){
                    startActivity(new Intent(getActivity(),KshikshaherActivity.class));
                } else if (i==5){
                    startActivity(new Intent(getActivity(),EwasteActivity.class));
                } else if (i==6){
                    startActivity(new Intent(getActivity(),ErpActivity.class));
                } else if (i==7){
                    startActivity(new Intent(getActivity(),ComplaintmanActivity.class));
                } else if (i==8){
                    startActivity(new Intent(getActivity(),WaterdistributionActivity.class));
                } else if (i==9){
                    startActivity(new Intent(getActivity(),TrainingerpActivity.class));
                }

            }
        });
        return view;
    }
}
