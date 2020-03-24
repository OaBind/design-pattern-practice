package Models;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
    private List<Ingredient> ingredients;

    public Kebab() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean isVegan() {
        for (Ingredient ingredient : ingredients) {
            if(!ingredient.isVegan()) return false;
        }
        return true;
    }
}
