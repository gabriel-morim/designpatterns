package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer {

    List<StringTransformer> transformers;



    public StringTransformerGroup(List<StringTransformer> transform){
        this.transformers = transform;
    }


    public void execute (StringDrink drink){
        for (StringTransformer transform : transformers){
            transform.execute(drink);
        }

    }


    public void undo(StringDrink drink) {
        for (StringTransformer transform : transformers){
            transform.execute(drink);
        }
    }

}
