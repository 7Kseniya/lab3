package ru.ifmo.se.lab3.characters;

import java.util.Objects;

public abstract class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name + " ";
    }

    protected String preposition;
    protected String location;

    public String getPreposition(){
        return preposition + " ";
    }

    public String getLocation() {
        return location + " ";
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Person person  = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }
}
