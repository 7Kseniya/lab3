package ru.ifmo.se.lab3.objects;

public abstract class Objects {
    String objects_name;
    public Objects(String objects_name){
        this.objects_name = objects_name;
    }

    public String getObjects_name(){
        return objects_name + "";
    }
}
