package ru.ifmo.se.lab3;
import ru.ifmo.se.lab3.characters.*;
import ru.ifmo.se.lab3.enums.Adverbs;
import ru.ifmo.se.lab3.enums.ColorParams;
import ru.ifmo.se.lab3.enums.NatureParams;
import ru.ifmo.se.lab3.enums.Pronouns;
import ru.ifmo.se.lab3.objects.*;
import ru.ifmo.se.lab3.objects.nature.*;

public class Main {
    public static void main(String[] args){
        MummiTrol mummiTrol = new MummiTrol("Мумми Троль", "на", "дворе");
        Snusmumrik snusmumrik = new Snusmumrik("Снусмурик", "за", "какой-то");
        Doors doors = new Doors("дверей");
        Windows windows = new Windows("окон");
        Stem stem1 = new Stem("стебель", "из", "земли");
        Stem stem2 = new Stem("стебель","вокруг", "шляпы Снусмумрика");
        Flowers flowers = new Flowers("цветы");
        Harvest harvest = new Harvest("плоды");
        Carpet carpet = new Carpet("ковер");
        Rain rain = new Rain("дождем");
        Hill hill = new Hill("холм");
        Greenery greenery = new Greenery("растительности");


        String output1 = mummiTrol() + rain.getNature_name() + mummiTrol.stay() + mummiTrol.getName();
        output1 += "и" + mummiTrol.adverbsToString(Adverbs.WITHINTEREST) + mummiTrol.overLook() + mummiTrol.natureParamsToString(NatureParams.HIGH)+ mummiTrol.natureParamsToString(NatureParams.GREEN) + hill.getNature_name() + ",";
        String output2 = flowers.adverbsToString(Adverbs.ONWHICH) + flowers.adverbsToString(Adverbs.RIGHTBEFOREEYES) + flowers.blossom() + "и" + harvest.repine() + ",";
        output2 += harvest.changeColor(ColorParams.GREEN_TO_YELLOW) + harvest.changeColor(ColorParams.YELLOW_TO_RED) + ". ";
        String output3 = snusmumrik.getName() + snusmumrik.stepForward() + "и" + snusmumrik.adverbsToString(Adverbs.WITHINTEREST)+ snusmumrik.overLook() + hill.getNature_name() + ". ";
        output3 += windows.thereAreNo() + ", " + doors.thereAreNo() + ".";
        output3 += carpet() + greenery.getNature_name() + ".";
        String output4 = snusmumrik.getName() + snusmumrik.grab() + snusmumrik.getPreposition() + snusmumrik.getLocation() + stem1.getName() + "и" + snusmumrik.pull() + ". ";
        output4 += stem1() + "и " + stem1.notPull() + stem1.getPreposition() + stem1.getLocation() + "!";
        String output5 = stem2.adverbsToString(Adverbs.KINDABYCHANCE) + stem2.wrappedAround() + stem1.pronounsToString(Pronouns.HE) + stem2.getPreposition() + stem2.getLocation();
        output5 += "и" + stem2.takeOff() + stem2.pronounsToString(Pronouns.HER)+ ".";

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
    }
}
