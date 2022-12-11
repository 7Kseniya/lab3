package ru.ifmo.se.lab3.objects;

public class Doors extends Object implements NonExisted {
    public Doors(String object_name) {
        super(object_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getObject_name();
    }
}


