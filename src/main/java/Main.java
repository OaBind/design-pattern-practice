import Models.*;

public class Main {
    public static void main (String[] args) {

        Kebab k = new Kebab();

        k.addIngredient(new Ingredient(IngredientName.SALAD, IngredientType.VEGETARIAN));
        k.addIngredient(new Ingredient(IngredientName.TOMATO, IngredientType.VEGETARIAN));
        k.addIngredient(new Ingredient(IngredientName.OIGNON, IngredientType.VEGETARIAN));
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
