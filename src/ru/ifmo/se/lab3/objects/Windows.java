package ru.ifmo.se.lab3.objects;

public class Windows extends Object implements NonExisted {

    public Windows(String object_name) {
        super(object_name);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getObject_name();
    }
}
