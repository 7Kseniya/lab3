package ru.ifmo.se.lab3.objects.nature;
import ru.ifmo.se.lab3.enums.Adverbs;
import ru.ifmo.se.lab3.objects.AdverbNormalization;

import static ru.ifmo.se.lab3.enums.Adverbs.*;

public class Flowers extends Nature implements AdverbNormalization {
    public Flowers(String nature_name) {
        super(nature_name);
    }

    public String blossom(){
        return "распускались " + getNature_name();
    }

    @Override
    public String adverbsToString(Adverbs adverb){
        if (adverb == ONWHICH){
            return "на котором ";
        }
        if (adverb == RIGHTBEFOREEYES){
            return "прямо перед глазами ";
        }
        return null;
    }

}
