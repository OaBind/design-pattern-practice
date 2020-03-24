package Models;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
    private List<Ingredient> ingredients;
    private Sauce sauce;

    public Kebab() {
        this.ingredients = new ArrayList<Ingredient>();
        this.sauce = null;
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

    public void removeOignons() {
        for (Ingredient i : ingredients) {
            if(i.getName() == IngredientName.OIGNON) ingredients.remove(i);
        }
    }

    public void addCheese() {
        int count = 0;
        for (Ingredient i : ingredients) {
            if(i.getName() == IngredientName.CHEESE) count++;
        }
        for(int i = 0; i < count; i++) {
            ingredients.add(new Ingredient(IngredientName.CHEESE, IngredientType.VEGETARIAN));
        }
    }
}
