import Models.Ingredient;
import Models.IngredientType;
import Models.Kebab;
import Models.Sauce;

public class Main {
    public static void main (String[] args) {
        Kebab k = new Kebab();
        k.addIngredient(new Ingredient("Salade", IngredientType.VEGETARIAN));
        k.addIngredient(new Ingredient("Tomate", IngredientType.VEGETARIAN));
        k.addIngredient(new Ingredient("Oignon", IngredientType.VEGETARIAN));
        k.setSauce(Sauce.BARBECUE);
        if(k.isVegan()) {
            System.out.println("That kebab is vegan");
        } else {
            if(k.isPescetarian()) {
                System.out.println("Quite ok");
            } else {
                System.out.println("Not vegan at all, meat-eater");
            }
        }
    }
}
