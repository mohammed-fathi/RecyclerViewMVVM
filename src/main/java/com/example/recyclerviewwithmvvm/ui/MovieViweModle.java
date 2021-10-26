package com.example.recyclerviewwithmvvm.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.recyclerviewwithmvvm.pojo.MovieModle;

import java.util.ArrayList;

public class MovieViweModle  extends ViewModel {
   public  MutableLiveData<ArrayList<MovieModle>> movieNameMutableLiveData = new MutableLiveData();

   public void getMovieName(){

       movieNameMutableLiveData.setValue(getMovieFromDatabase());
   }
    private ArrayList<MovieModle> getMovieFromDatabase(){
        ArrayList<MovieModle> arrayList = new ArrayList<>();
        arrayList.add(new MovieModle("Bereaking Bad","2018" , "good" , 1));
        arrayList.add(new MovieModle("Avatar","2010" , "verygood" , 2));
        arrayList.add(new MovieModle("Spider_Man","2015" , "good" , 3));
        arrayList.add(new MovieModle("The Orignal","2017" , "Verygood" , 4));
        arrayList.add(new MovieModle("game Of thrones","2019" , "good" , 5));
        arrayList.add(new MovieModle("Hanter X Hanter","2005" , "exlant" , 6));
        return arrayList;

    }
}
