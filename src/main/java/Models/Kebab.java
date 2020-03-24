package Models;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
    private List<Ingredient> ingredients;
    private Sauce sauce;

    public Kebab() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public boolean isVegan() {
        for (Ingredient ingredient : ingredients) {
            if(ingredient.getType() != IngredientType.VEGETARIAN) return false;
        }
        return true;
    }

    public boolean isPescetarian() {
        for (Ingredient i : ingredients) {
            if(i.getType() == IngredientType.MEAT) return false;
        }
        return true;
    }
}
