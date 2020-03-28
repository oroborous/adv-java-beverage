package templatemethod;

public abstract class CaffeinatedBeverage {

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
