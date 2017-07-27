package com.example.a.lab3;

import java.io.Serializable;

/**
 * Created by A on 7/21/2017.
 */

public class ClassListView implements Serializable {
    String ListviewText;


    public ClassListView() {

    }

    public ClassListView(String listviewText) {
        ListviewText = listviewText;
    }

    public String getListviewText() {

        return ListviewText;
    }

    public void setListviewText(String listviewText) {

        ListviewText = listviewText;
    }

    @Override
    public String toString() {
        return this.ListviewText;
    }
}
