package ru.ifmo.se.lab3.objects;

public class Windows extends House implements NonExisted {

    public Windows(String house_name) {
        super(house_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getHouse_name();
    }
}
