package ru.ifmo.se.lab3.objects;

public class Doors extends House implements NonExisted {
    public Doors(String house_name) {
        super(house_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getHouse_name();
    }
}


