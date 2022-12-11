package ru.ifmo.se.lab3.objects.nature;
public abstract class Nature {
    String nature_name;
    public Nature(String nature_name){
        this.nature_name = nature_name;
    }
    public String getNature_name(){
        return nature_name + " ";
    }

}
