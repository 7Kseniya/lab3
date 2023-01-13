package ru.ifmo.se.lab3.characters;
import ru.ifmo.se.lab3.enums.Adverbs;
import ru.ifmo.se.lab3.enums.NatureParams;
import ru.ifmo.se.lab3.objects.nature.*;
import ru.ifmo.se.lab3.objects.AdverbNormalization;

import static ru.ifmo.se.lab3.enums.Adverbs.SURPRISED;
import static ru.ifmo.se.lab3.enums.Adverbs.WITHINTEREST;
import static ru.ifmo.se.lab3.enums.NatureParams.GREEN;
import static ru.ifmo.se.lab3.enums.NatureParams.HIGH;

public class MummiTrol extends Person implements OverLooked, Describable, AdverbNormalization, NatureParamsNormalization {
    public MummiTrol(String name, String p, String l) {
        super(name);
        preposition = p;
        location = l;
    }

    @Override
    public String toString(){
        return "А " + getPreposition() + getLocation() + " под ";
    }
    public String stay(){
        return "сотоял ";
    }
    //IN YARD

    @Override
    public String overLook(){
        return "озирал";
    }
    @Override
    public String adverbsToString(Adverbs adverb){
        if (adverb == SURPRISED){
            return " удивленно ";
        }
        if (adverb == WITHINTEREST){
            return " с интересом ";
        }
        return null;
    }

    @Override
    public String natureParamsToString(NatureParams natureParam){
        if (natureParam == HIGH){
            return " высокий";
        }
        if (natureParam == GREEN){
            return " зеленый ";
        }
        return null;
    }
     @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        MummiTrol mummiTrol  = (MummiTrol) o;
        return Objects.equals(name, mummiTrol.name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

}
