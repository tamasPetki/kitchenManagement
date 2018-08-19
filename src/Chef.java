import java.util.Random;
import java.util.function.Supplier;

public class Chef extends CookerEmployee {

    Random randomBoolean = new Random();
    public Ingredients neededIngredient;

    @Override
    public void cook() {
        System.out.println("CHEF YELLs");
        if(randomBoolean.nextBoolean()) {
            neededIngredient = Ingredients.getRandomIngredient();
            System.out.println("Chef needs " + neededIngredient);
        }
        neededIngredient = null;
    }
}
