package com.istiaq66.news_paper_app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiutilities {

    private  static Retrofit retrofit=null;


    public  static ApiInterface getAPiInterface()
    {

        if(retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }

       return retrofit.create(ApiInterface.class);
    }
}
