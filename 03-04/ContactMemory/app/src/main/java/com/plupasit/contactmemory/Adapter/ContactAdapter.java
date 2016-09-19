package com.plupasit.contactmemory.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.plupasit.contactmemory.Model.ContactModel;
import com.plupasit.contactmemory.R;

import java.util.ArrayList;

/**
 * Created by PnPlu on 9/12/2016 AD.
 */
public class  ContactAdapter extends RecyclerView.Adapter
{
    private ArrayList<ContactModel> dataset;

    public ContactAdapter(ArrayList<ContactModel> dataset) {
        this.dataset = dataset;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ContactViewHolder current = new ContactViewHolder(view);

        return current;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ContactModel model = dataset.get(position);
        ContactViewHolder cv_holder = (ContactViewHolder)holder;

        cv_holder.name_tv.setText(model.getName());
        cv_holder.tel_tv.setText(model.getTel());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder
    {
        public TextView name_tv;
        public TextView tel_tv;

        public ContactViewHolder(View itemView) {
            super(itemView);

            name_tv = (TextView)itemView.findViewById(R.id.TVName);
            tel_tv = (TextView)itemView.findViewById(R.id.TVTel);
        }
    }

}
