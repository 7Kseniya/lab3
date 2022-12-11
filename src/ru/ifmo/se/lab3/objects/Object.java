package ru.ifmo.se.lab3.objects;

public abstract class Object {
    String object_name;
    public Object(String object_name){
        this.object_name = object_name;
    }

    public String getObject_name(){
        return object_name + "";
    }
}
