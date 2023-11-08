package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringRecipe {

    List<StringTransformer> transformers;


    public StringRecipe(List<StringTransformer> transform) {
        this.transformers = transform;
    }


    public void mix(StringDrink drink) {
        for (StringTransformer transform : transformers) {
            transform.execute(drink);
        }

    }
}


