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

public class ClientFragment extends Fragment {

    View view;
    private RecyclerView myrecylerview;
    private List<Client> lstClient;
    public ClientFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.client_fragment,container,false);
        myrecylerview=view.findViewById(R.id.client_recycler);
        ClientRecyclerViewAdapter recyclerViewAdapter=new ClientRecyclerViewAdapter(getContext(),lstClient);
        myrecylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecylerview.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstClient=new ArrayList<>();
        lstClient.add(new Client("Anushree Enterprises",R.drawable.anushree));
        lstClient.add(new Client("Turning Point Computers",R.drawable.tp));
        lstClient.add(new Client("Keonics",R.drawable.keonics));
        lstClient.add(new Client("CCA",R.drawable.cca));
        lstClient.add(new Client("Kshiksha",R.drawable.kshiksha));

    }
}
