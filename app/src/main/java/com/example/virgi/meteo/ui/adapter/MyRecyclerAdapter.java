package com.example.virgi.meteo.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.virgi.meteo.R;
import com.example.virgi.meteo.data.City;
import com.example.virgi.meteo.logic.Utils;
import com.example.virgi.meteo.ui.activity.MainActivity;

/**
 * Created by virgi on 30/03/2018.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView txt;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
            txt = itemView.findViewById(R.id.text);
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
    }

    @Override
    public int getItemCount() {
        return Utils.getCityList().size();
    }

}
