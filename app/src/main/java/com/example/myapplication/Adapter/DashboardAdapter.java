package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.Model.DashboardModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.viewHolder>{

    public DashboardAdapter(ArrayList<DashboardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<DashboardModel> list;
    Context context;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard_rv_sample, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DashboardModel postHelper = list.get(position);
        holder.profile_image.setImageResource(postHelper.getProfile_image());
        holder.postImage.setImageResource(postHelper.getPostImage());
        holder.userName.setText(postHelper.getUserName());
        holder.about.setText(postHelper.getAbout());
        holder.like.setText(postHelper.getLike());
        holder.Comment.setText(postHelper.getComment());
        holder.Share.setText(postHelper.getShare());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView profile_image, postImage;
        TextView userName, about, like, Comment, Share;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profile_image = itemView.findViewById(R.id.profile_image);
            postImage = itemView.findViewById(R.id.postImage);
            userName = itemView.findViewById(R.id.userName);
            about = itemView.findViewById(R.id.about);
            like = itemView.findViewById(R.id.like);
            Comment = itemView.findViewById(R.id.Comment);
            Share = itemView.findViewById(R.id.Share);
        }
    }
}
