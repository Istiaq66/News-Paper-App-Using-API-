package com.istiaq66.news_paper_app;

import java.util.ArrayList;

public class Mainnews {


    private String status;
    private  String totalResult;
    private ArrayList<Modelclass> articles;

    public Mainnews(String status, String totalResult, ArrayList<Modelclass> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<Modelclass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Modelclass> articles) {
        this.articles = articles;
    }
}
