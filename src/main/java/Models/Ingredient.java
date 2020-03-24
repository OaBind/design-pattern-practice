package Models;

public class Ingredient {
    private IngredientName name;
    private IngredientType type;

    public Ingredient(IngredientName name, IngredientType it) {
        this.name = name;
        this.type = it;
    }

    public IngredientName getName() {
        return name;
    }

    public void setName(IngredientName name) {
        this.name = name;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }
}
