package ru.ifmo.se.lab3.characters;
import ru.ifmo.se.lab3.enums.Adverbs;
import ru.ifmo.se.lab3.objects.AdverbNormalization;

import static ru.ifmo.se.lab3.enums.Adverbs.WITHINTEREST;

public class Snusmumrik extends Person implements OverLooked, AdverbNormalization {

    public Snusmumrik(String name, String p, String l) {
        super(name);
        preposition = p;
        location = l;
    }
    public String stepForward(){
        return "выступил вперед ";
    }
    @Override
    public String overLook(){
        return "стал осматривать ";
    }
    @Override
    public String adverbsToString(Adverbs adverb) {
        if (adverb == WITHINTEREST){
            return " с интересом ";
        }
        return null;
    }

    public String grab(){
        return "ухватился ";
    }
    public String pull(){
        return " потянул";
    }
    //ONTO SOMEKINDOFSTEM
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Snusmumrik smusmumrik  = (Snusmumrik) o;
        return Objects.equals(name, smusmumrik.name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

}

