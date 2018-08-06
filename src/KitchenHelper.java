public class KitchenHelper extends Employee {

    Inventory inventory = new Inventory();

    public void shoutIfNotHave() {
        System.out.println("We’re all out");
    }
}
