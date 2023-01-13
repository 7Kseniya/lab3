package ru.ifmo.se.lab3.objects.nature;
public abstract class Nature {
    String nature_name;
    public Nature(String nature_name){
        this.nature_name = nature_name;
    }
    public String getNature_name(){
        return nature_name + " ";
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Nature nature  = (Nature) o;
        return Objects.equals(nature_name, nature.nature_name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(nature_name);
    }

}
