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

import java.util.List;

/**
 * Created by virgi on 30/03/2018.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    Context mContext;
    List<City> values;

    public MyRecyclerAdapter(List<City> values, Context context){

        this.values = values;
        this.mContext = context;

    }


    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

        private Context context;
        private TextView txt;
        private int position;
        private String settedName;

        public ViewHolder(View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.text);

            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {
            Intent intent = new Intent(mContext, DetailActivity.class);
            intent.putExtra("citta", settedName);
            mContext.startActivity(intent);

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
        City currentCity = values.get(position);
        holder.txt.setText(currentCity.getName());
        holder.settedName = currentCity.getName();
        holder.position = position;
        holder.context = mContext;

    }

    @Override
    public int getItemCount() {
        return Utils.getCityList().size();
    }

}
