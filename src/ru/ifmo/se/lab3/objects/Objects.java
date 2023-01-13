package ru.ifmo.se.lab3.objects;

public abstract class House {
    String house_name;
    public House(String house_name){
        this.house_name = house_name;
    }

    public String getHouse_name(){
        return house_name + "";
    }
}
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        House house  = (House) o;
        return Objects.equals(house_name, house.house_name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(house_name);
    }
}
