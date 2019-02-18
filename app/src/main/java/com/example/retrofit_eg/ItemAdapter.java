package com.example.retrofit_eg;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{

    private final List<GithubRepo> data;

    public ItemAdapter(){
        this.data = new ArrayList<>();
    }
    public void setData (List<GithubRepo> newData){
        data.clear();
        data.addAll(newData);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_name, viewGroup, false);
        return new ItemViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int position) {
        GithubRepo githubRepo = data.get(position);
        itemViewHolder.tvName.setText(githubRepo.getName());
        itemViewHolder.tvDetails.setText(githubRepo.getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvDetails;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDetails = itemView.findViewById(R.id.tvDetails);

        }

    }
}
