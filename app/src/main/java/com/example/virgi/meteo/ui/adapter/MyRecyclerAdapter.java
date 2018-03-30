package com.example.virgi.meteo.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.virgi.meteo.R;
import com.example.virgi.meteo.data.City;
import com.example.virgi.meteo.logic.Utils;
import com.example.virgi.meteo.ui.activity.DetailActivity;
import com.example.virgi.meteo.ui.activity.MainActivity;

/**
 * Created by virgi on 30/03/2018.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    Context mContext;
    Intent intent;


    public MyRecyclerAdapter(Context context){
        mContext = context;

    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView txt;
        private View root;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
            txt = itemView.findViewById(R.id.text);

        }

        public void setOnclick(String nome){

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(mContext, DetailActivity.class);
                    mContext.startActivity(intent);
                }
            });
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layout,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        City city = Utils.getCityList().get(position);
        holder.txt.setText(city.getName());

        holder.setOnclick(city.getName());
    }

    @Override
    public int getItemCount() {
        return Utils.getCityList().size();
    }

}
