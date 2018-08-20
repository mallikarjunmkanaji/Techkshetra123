package com.techkshetrainfo.techkshetrainfo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ServiceRecyclerViewAdapter extends RecyclerView.Adapter<ServiceRecyclerViewAdapter.ServiceViewHolder>  {

    Context scontext;
    List<Service> sData;

    public ServiceRecyclerViewAdapter(Context scontext, List<Service> sData) {
        this.scontext = scontext;
        this.sData = sData;
    }

    @NonNull
    @Override
    public ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(scontext).inflate(R.layout.service_items,parent,false);
        ServiceViewHolder serviceViewHolder=new ServiceViewHolder(view);
        return serviceViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ServiceViewHolder holder, int position) {

        holder.service_text.setText(sData.get(position).getSname());
        holder.service_img.setImageResource(sData.get(position).getSphoto());

    }


    @Override
    public int getItemCount() {
        return sData.size();
    }

    public static class ServiceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Context context;
        private TextView service_text;
        private ImageView service_img;
        public ServiceViewHolder(View itemView) {
            super(itemView);
            context=itemView.getContext();
            service_text=itemView.findViewById(R.id.service_text_item);
            service_img=itemView.findViewById(R.id.service_img_item);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent=new Intent(context,SoftwareDevelopActivity.class);
                    break;
                case 1:
                    intent=new Intent(context,MadActivity.class);
                    break;
                case 2:
                    intent=new Intent(context,DomainActivity.class);
                    break;
                case 3:
                    intent=new Intent(context,DigitalMarketActivity.class);
                    break;
                case 4:
                    intent=new Intent(context,WddActivity.class);
                    break;
                case 5:
                    intent=new Intent(context,InternshipActivity.class);
                    break;
                case 6:
                    intent=new Intent(context,IeeeActivity.class);
                    break;
                    default:
                        intent=new Intent(context,ServiceFragment.class);
                        break;
            }
            context.startActivity(intent);
        }
    }

}
