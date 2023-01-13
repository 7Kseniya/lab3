package ru.ifmo.se.lab3.objects;

public class Doors extends Objects implements NonExisted {
    public Doors(String objects_name) {
        super(objects_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getObjects_name();
    }
}


