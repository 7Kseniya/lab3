package ru.ifmo.se.lab3.objects.nature;
import ru.ifmo.se.lab3.characters.Person;
import ru.ifmo.se.lab3.enums.*;
import ru.ifmo.se.lab3.objects.AdverbNormalization;
import static ru.ifmo.se.lab3.enums.Adverbs.KINDABYCHANCE;
import static ru.ifmo.se.lab3.enums.Adverbs.LIKE;
import static ru.ifmo.se.lab3.enums.Pronouns.HE;
import static ru.ifmo.se.lab3.enums.Pronouns.HER;
import static ru.ifmo.se.lab3.enums.StemParams.ELASTIC;
import static ru.ifmo.se.lab3.enums.StemParams.RUBBER;

public class Stem extends Person implements Describable, AdverbNormalization, StemParamsNormalization, PronounsNormalization {
    public Stem(String nature_name, String p, String l) {
        super(nature_name);
        preposition = p;
        location = l;
    }

    @Override
    public String describe(){
        return getName() + "был"+ stemParamsToString(ELASTIC) + adverbsToString(LIKE) + stemParamsToString(RUBBER);
    }

    public String adverbsToString(Adverbs adverb){
        if (adverb == LIKE){
            return "словно";
        }
        if (adverb == KINDABYCHANCE){
            return "как бы невзначай ";
        }
        return null;
    }

    public String wrappedAround(){
        return "обвился";
    }
    //AROUD SNUSMUMRICHAT

    public String notPull(){
        return "не выдергивался ";
    }
    //OUTOFF GROUND
    public String takeOff(){
        return " снял ";
    }

    @Override
    public String stemParamsToString(StemParams stemParam){
        if (stemParam == ELASTIC){
            return " упругий ";
        }
        if (stemParam == RUBBER){
            return " резиновый ";
        }
        return null;
    }

    @Override
    public String pronounsToString(Pronouns pronoun) {
        if (pronoun == HE){
            return " он ";
        }
        if (pronoun == HER){
            return "ee";
        }
        return  null;
    }
}
