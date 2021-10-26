package com.example.recyclerviewwithmvvm.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithmvvm.R;
import com.example.recyclerviewwithmvvm.pojo.MovieModle;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MovieListAdapter  extends RecyclerView.Adapter<MovieListAdapter.MovieViweHolder> {
    private ArrayList<MovieModle> moviesList = new ArrayList<>();
    @NonNull
    @NotNull
    @Override
    public MovieViweHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MovieViweHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MovieViweHolder holder, int position) {
        holder.movenameTv.setText(moviesList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
    public void setList(ArrayList<MovieModle> moviesList){
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public class MovieViweHolder extends RecyclerView.ViewHolder {
        TextView movenameTv;
        public MovieViweHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            movenameTv = itemView.findViewById(R.id.move_name_tv);
        }
    }
}
