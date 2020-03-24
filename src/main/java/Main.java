import Models.Ingredient;
import Models.Kebab;

public class Main {
    public static void main (String[] args) {
        Kebab k = new Kebab();
        k.addIngredient(new Ingredient("Salade", true));
        k.addIngredient(new Ingredient("Tomate", true));
        k.addIngredient(new Ingredient("Oignon", true));
        if(k.isVegan()) {
            System.out.println("That kebab is vegan");
        } else {
            System.out.println("Uh, meet...");
        }
    }
}
