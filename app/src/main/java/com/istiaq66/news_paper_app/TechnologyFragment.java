package com.istiaq66.news_paper_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TechnologyFragment extends Fragment {
    String api="8ed5bc910e31439b8dd03cecd7bdc1a5";
    ArrayList<Modelclass> modelclassArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewoftechnology;
    private  String category="technology";
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, @Nullable  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.technologyfragment,null);


        recyclerViewoftechnology = v.findViewById(R.id.reclycler_technology);
        modelclassArrayList = new ArrayList<>();
        recyclerViewoftechnology.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modelclassArrayList);
        recyclerViewoftechnology.setAdapter(adapter);
        findNews();

        return v;



    }
    private  void  findNews(){




        Apiutilities.getAPiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<Mainnews>() {
            @Override
            public void onResponse(Call<Mainnews> call, Response<Mainnews> response) {
                if(response.isSuccessful()){

                    modelclassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<Mainnews> call, Throwable t) {

            }
        });


    }

}

