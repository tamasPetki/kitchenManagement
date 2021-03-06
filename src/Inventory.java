import java.util.HashMap;
import java.util.Random;

public class Inventory {

    HashMap<Ingredients, Integer> inventory = new HashMap<Ingredients, Integer>();
    Random random = new Random();

    Inventory() {
        init();
    }

    public void init() {
        inventory.put(Ingredients.CARROT, random.nextInt(3));
        inventory.put(Ingredients.POTATO, random.nextInt(3));
        inventory.put(Ingredients.MEAT, random.nextInt(3));
    }

    public boolean checkIfHas(Ingredients ingredient) {
        return inventory.get(ingredient) > 0;
    }

    public void removeIngredient(Ingredients ingredient) {
        if(checkIfHas(ingredient)) {
         inventory.put(ingredient, inventory.get(ingredient)-1);
        }
    }

}
