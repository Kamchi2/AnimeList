package com.example.anime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {
    ItemClicker listener;
    ArrayList<String> list;

    public AnimeAdapter(ArrayList<String> list, ItemClicker listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.animeTv);
        }

        public void onBind(String name) {
            textView.setText(name);

            textView.setOnClickListener(view -> listener.itemClick(getAdapterPosition()));

        }
    }
}
