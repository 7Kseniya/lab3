package ru.ifmo.se.lab3.objects.nature;
import ru.ifmo.se.lab3.enums.NatureParams;
import static ru.ifmo.se.lab3.enums.NatureParams.CONTINUED;
import static ru.ifmo.se.lab3.enums.NatureParams.WILD;

public class Carpet extends Nature implements Describable, NatureParamsNormalization {
    public Carpet(String nature_name) {
        super(nature_name);
    }

    @Override
    public String toString() {
        return natureParamsToString(CONTINUED) + getNature_name() + natureParamsToString(WILD) ;
    }

    @Override
    public String natureParamsToString(NatureParams natureParam) {
        if (natureParam == CONTINUED){
            return " Сплошной ";
        }
        if (natureParam == WILD){
            return "дикой ";
        }
        return null;

    }
}
