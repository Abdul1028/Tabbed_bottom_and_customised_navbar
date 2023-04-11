package com.example.assignment2;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Offers> offers;

    public RecyclerViewAdapter (Context mContext , List<Offers> offers){
        this.mContext = mContext;
        this.offers = offers;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {


        holder.txtoffername.setText(offers.get(position).getOffer_name());
        holder.txtoffertype.setText(offers.get(position).getOffer_type());
        holder.offerimg.setImageResource(offers.get(position).getOffer_img());
    }

    @Override
    public int getItemCount() {
        return offers.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView txtoffername;
        private TextView txtoffertype;
        private ImageView offerimg;
        private CardView mainCard;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            txtoffername = itemView.findViewById(R.id.offer_name);
            txtoffertype = itemView.findViewById(R.id.offer_type);
            offerimg = itemView.findViewById(R.id.offer_img);
            mainCard = itemView.findViewById(R.id.maiCard);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Offers offers_for_details =  offers.get(position);
            Intent intent = new Intent(mContext,Details.class);
            intent.putExtra("offer_name",offers_for_details.getOffer_name());
            intent.putExtra("offer_type",offers_for_details.getOffer_type());
            intent.putExtra("offer_img",offers_for_details.getOffer_img());

            mContext.startActivity(intent);

        }
    }
}
