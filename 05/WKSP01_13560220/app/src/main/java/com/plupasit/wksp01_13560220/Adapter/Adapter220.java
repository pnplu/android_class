package com.plupasit.wksp01_13560220.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.plupasit.wksp01_13560220.DataModel.DataModel220;
import com.plupasit.wksp01_13560220.R;

import java.util.ArrayList;

/**
 * Created by PnPlu on 9/19/2016 AD.
 */
public class Adapter220 extends RecyclerView.Adapter
{
    private ArrayList<DataModel220> dataset;

    public Adapter220(ArrayList<DataModel220> dataset) {this.dataset = dataset;}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ContactViewHolder current = new ContactViewHolder(view);

        return current;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DataModel220 model = dataset.get(position);
        ContactViewHolder cv_holder = (ContactViewHolder)holder;

        cv_holder.food_tv.setText(model.getFood());
        cv_holder.qualtity_tv.setText(String.valueOf(model.getQualtitys()));
        cv_holder.calorie_tv.setText(String.valueOf(model.getCalories()));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder
    {
        public TextView food_tv;
        public TextView qualtity_tv;
        public TextView calorie_tv;

        public ContactViewHolder(View itemView)
        {
            super(itemView);

            food_tv = (TextView)itemView.findViewById(R.id.TVName);
            qualtity_tv = (TextView)itemView.findViewById(R.id.TVQual);
            calorie_tv = (TextView)itemView.findViewById(R.id.TVCal);
        }
    }
}
