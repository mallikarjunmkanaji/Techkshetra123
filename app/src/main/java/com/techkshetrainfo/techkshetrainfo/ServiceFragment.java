package com.techkshetrainfo.techkshetrainfo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ServiceFragment extends Fragment {
    View view;
    private RecyclerView servicerecyclerview;
    private List<Service> lstService;
    public ServiceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_service,container,false);
       servicerecyclerview=view.findViewById(R.id.service_recycle);
       ServiceRecyclerViewAdapter recyclerViewAdapter=new ServiceRecyclerViewAdapter(getContext(),lstService);
       servicerecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       servicerecyclerview.setAdapter(recyclerViewAdapter);
       return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstService=new ArrayList<>();
        lstService.add(new Service("Software Development",R.drawable.softwaredevelopment));
        lstService.add(new Service("Mobile Application Development",R.drawable.mad));
        lstService.add(new Service("Domain Registration",R.drawable.dom_reg));
        lstService.add(new Service("Digital Marketing",R.drawable.dm));
        lstService.add(new Service("Web Design and maintenance",R.drawable.web_dev));
        lstService.add(new Service("Internship",R.drawable.internship));
        lstService.add(new Service("IEEE Projects",R.drawable.ieee));

    }
}
