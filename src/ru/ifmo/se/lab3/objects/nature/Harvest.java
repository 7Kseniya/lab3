package ru.ifmo.se.lab3.objects.nature;
import ru.ifmo.se.lab3.enums.ColorParams;

public class Harvest extends Nature implements Multicolored {
    public Harvest(String nature_name) {
        super(nature_name);
    }

    public String repine(){
        return " созревали " + getNature_name();
    }

    @Override
    public String changeColor(ColorParams color){
        String type = "";
        switch (color) {
            case GREEN_TO_YELLOW -> type = " меняя цвет из зеленого в желтый,";
            case YELLOW_TO_RED -> type = " из желтого в красный";
        }
        return type;
    }
}
