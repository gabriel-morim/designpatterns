package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringDrink> wanteddrinks =  new ArrayList<>();
    private List<StringRecipe> wantedrecipe =  new ArrayList<>();
    private List<StringBar> wantedbar =  new ArrayList<>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if (bar.isHappyHour()){
            bar.order(drink, recipe);
        }else{
            wanteddrinks.add(drink);
            wantedrecipe.add(recipe);
            wantedbar.add(bar);
            }
        };
    @Override
    public void happyHourStarted(StringBar bar){
        for (int i = 0; i < wanteddrinks.size(); i++) {
            wantedbar.get(i).order(wanteddrinks.get(i), wantedrecipe.get(i));
            }
        wanteddrinks.clear();
        wantedrecipe.clear();
        wantedbar.clear();
        };
    @Override
    public void happyHourEnded(StringBar bar){
        };
}

