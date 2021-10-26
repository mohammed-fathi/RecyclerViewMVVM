package com.example.recyclerviewwithmvvm.ui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import com.example.recyclerviewwithmvvm.R;
import com.example.recyclerviewwithmvvm.databinding.ActivityMainBinding;
import com.example.recyclerviewwithmvvm.pojo.MovieModle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MovieViweModle movieViweModle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MovieListAdapter adapter = new MovieListAdapter();
        binding.movieRecyclerViwe.setAdapter(adapter);
        movieViweModle =ViewModelProviders.of(this).get(MovieViweModle.class);
        movieViweModle.movieNameMutableLiveData.observe(this, new Observer<ArrayList<MovieModle>>() {
            @Override
            public void onChanged(ArrayList<MovieModle> movieModles) {
                adapter.setList(movieModles);
            }
        });
        binding.movieRecyclerViwe.setLayoutManager(new LinearLayoutManager(this));
        binding.setLifecycleOwner(this);
    }
}