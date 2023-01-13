package ru.ifmo.se.lab3.objects;

public abstract class Objects {
    String objects_name;
    public Objects(String objects_name){
        this.objects_name = objects_name;
    }

    public String getObjects_name(){
        return objects_name + "";
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Objects person  = (Objects) o;
        return Objects.equals(name, objects.objects_name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(objects_name);
    }
}
