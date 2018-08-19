import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    List<Employee> employees = new ArrayList<>();
    List<KitchenHelper> kitchenHelpers = new ArrayList<>();
    List<canCook> canCooks = new ArrayList<>();

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.init();

        for (int i = 0; i < 40; i++) {
            for (canCook cooker : kitchen.canCooks) {
                cooker.cook();

                if (cooker instanceof Chef && ((Chef) cooker).neededIngredient != null) {
                    kitchen.chefYells(((Chef) cooker).neededIngredient);
                }
            }
        }
    }

    void init() {

        for (int i = 0; i < 4; i++) {
            employees.add(new KitchenHelper());
        }

        for (int i = 0; i < 1; i++) {
            employees.add(new Cooker());
        }

        employees.add(new Chef());

        employees.stream()
                .filter(e -> e instanceof KitchenHelper)
                .forEach(e -> kitchenHelpers.add((KitchenHelper) e));

        employees.stream()
                .filter(e -> e instanceof canCook)
                .forEach(e -> canCooks.add((canCook) e));
    }


    void chefYells(Ingredients ingredient) {

        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            if (kitchenHelper.inventory.checkIfHas(ingredient)) {
                kitchenHelper.inventory.removeIngredient(ingredient);
                System.out.println(ingredient + " removed");
                return;
            }
        }
        kitchenHelpers.forEach(KitchenHelper::shoutIfNotHave);
    }
}
