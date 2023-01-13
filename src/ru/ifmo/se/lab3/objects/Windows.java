package ru.ifmo.se.lab3.objects;

public class Windows extends Objects implements NonExisted {

    public Windows(String objects_name) {
        super(objects_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getObjects_name();
    }
}
