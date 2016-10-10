package com.plupasit.wksp02_13560220.Adapter;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.plupasit.wksp02_13560220.DataModel.Datamodel220;
import com.plupasit.wksp02_13560220.R;

import java.util.ArrayList;

public class Adapter220 extends RecyclerView.Adapter
{
    private ArrayList<Datamodel220> dataset;
    public Adapter220(ArrayList<Datamodel220> dataset) {this.dataset = dataset;}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent , int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ContactViewHolder current = new ContactViewHolder(view);

        return current;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Datamodel220 model = dataset.get(position);

        ContactViewHolder cv_holder = (ContactViewHolder)holder;

        cv_holder.name_tv.setText(model.getName_pay());
        cv_holder.money2_tv.setText(String.valueOf(model.getPay_money()));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder
    {
        public TextView name_tv;
        public TextView money_tv;
        public TextView money2_tv;

        public ContactViewHolder(View itemView)
        {
            super(itemView);

            name_tv = (TextView)itemView.findViewById(R.id.TVName);
            money_tv = (TextView)itemView.findViewById(R.id.TVMoney);
            money2_tv = (TextView)itemView.findViewById(R.id.TVMoney2);
        }
    }
}
