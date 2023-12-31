package com.nba.statistics.repsonse;

import java.sql.Timestamp;
import java.util.ArrayList;

public class ResponseData<T>{
     Timestamp dateCreation;
    ArrayList<T> data;
    String errorMessage = null;

    public ResponseData() {
        this.setDateCreation(new Timestamp(System.currentTimeMillis()));
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    public ArrayList<T> getData() {
        return data;
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void addToData(T data) {
        if (this.getData() == null) this.setData(new ArrayList<>());
        this.getData().add(data);
    }
}
