package com.chaty.samg.chaty.model;

import java.util.ArrayList;



public class Conversations {
    private ArrayList<Message> listMessageData;
    public Conversations(){
        listMessageData = new ArrayList<>();
    }

    public ArrayList<Message> getListMessageData() {
        return listMessageData;
    }
}
