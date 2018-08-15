abstract class CookerEmployee extends Employee implements canCook {

    final boolean hasKnife;

    protected CookerEmployee() {
        hasKnife = true;
    }
}
