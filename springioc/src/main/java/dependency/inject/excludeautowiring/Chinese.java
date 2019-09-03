package dependency.inject.excludeautowiring;

public class Chinese {
    private SteelAxe steelAxe;

    public void setSteelAxe(SteelAxe steelAxe) {
        this.steelAxe = steelAxe;
    }

    public void greet() {
        steelAxe.sayHello();
    }
}
