import java.util.List;
import java.util.Random;

public enum Ingredients {

    CARROT,
    POTATO,
    MEAT;

    private static final List<Ingredients> ingredients = List.of(Ingredients.values());
    private static final int SIZE = ingredients.size();
    private static final Random random = new Random();

    public static Ingredients getRandomIngredient() {
        return ingredients.get(random.nextInt(SIZE));
    }
}
