package org.example;

public class StringCaseChanger implements StringTransformer{
    private String text;
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stb = new StringBuilder("");
        this.text = drink.getText();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c))
                stb.append(Character.toUpperCase(c));
            else stb.append(Character.toLowerCase(c));
        }
        drink.setText(stb.toString());






    }
}
