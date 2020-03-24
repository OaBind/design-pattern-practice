package Models;

public class Ingredient {
    private String name;
    private boolean isVegan;

    public Ingredient(String name, boolean isVegan) {
        this.name = name;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
