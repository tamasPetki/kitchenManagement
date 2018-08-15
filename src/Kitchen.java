import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Kitchen {
    List<Employee> employees = new ArrayList<>();
    List<KitchenHelper> kitchenHelpers = new ArrayList<>();

    void init() {

        for (int i = 0; i < 4; i++) {
            employees.add(new KitchenHelper());
        }

        for (int i = 0; i < 4; i++) {
            employees.add(new Cooker());
        }

        employees.add(new Chef());

        employees.stream()
                .filter(e -> e instanceof KitchenHelper)
                .forEach(e -> kitchenHelpers.add((KitchenHelper) e));
    }

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.init();
    }
}
