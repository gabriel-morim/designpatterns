package org.example;

public class StringReplacer implements StringTransformer{
    private char OldChar;

    private char NewChar;

    public StringReplacer(char OldChar, char NewChar){
        this.OldChar = OldChar;
        this.NewChar = NewChar;

    }

    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(OldChar,NewChar));
    }

    @Override
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(NewChar,OldChar));
    }




}
