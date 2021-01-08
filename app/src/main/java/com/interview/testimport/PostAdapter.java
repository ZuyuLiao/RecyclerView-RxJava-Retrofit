package com.interview.testimport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    Context context;
    List<Model> list;

    public PostAdapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent,false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.txt_author.setText(String.valueOf(list.get(position).userId));
        holder.txt_title.setText(String.valueOf(list.get(position).title));
        holder.txt_content.setText(String.valueOf(list.get(position).body.substring(0,20)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
