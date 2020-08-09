package com.alvin.wisatapalembang.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alvin.wisatapalembang.R;
import com.alvin.wisatapalembang.Wisata;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {

    private ArrayList<Wisata> listWisata;

    public CardViewAdapter(ArrayList<Wisata> listWisata) {
        this.listWisata = listWisata;
    }


    private OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        final Wisata w = listWisata.get(position);

        holder.tvName.setText(w.getName());
        holder.tvAddress.setText(w.getAddress());

        Glide.with(holder.itemView.getContext())
                .load(w.getImg())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.ivImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallBack.onItemClicked(listWisata.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvAddress;
        ImageView ivImg;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvAddress = itemView.findViewById(R.id.tv_address);
            ivImg = itemView.findViewById(R.id.iv_img);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Wisata data);
    }
}
