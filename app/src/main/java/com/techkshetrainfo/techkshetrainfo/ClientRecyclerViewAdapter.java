package com.techkshetrainfo.techkshetrainfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ClientRecyclerViewAdapter extends RecyclerView.Adapter<ClientRecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<Client> mData;

    public ClientRecyclerViewAdapter(Context mcontext, List<Client> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(mcontext).inflate(R.layout.client_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.client_name.setText(mData.get(position).getName());
        holder.client_img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView client_name;
        private ImageView client_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            client_name=itemView.findViewById(R.id.client_text_item);
            client_img=itemView.findViewById(R.id.client_imageview_item);
        }
    }
}
