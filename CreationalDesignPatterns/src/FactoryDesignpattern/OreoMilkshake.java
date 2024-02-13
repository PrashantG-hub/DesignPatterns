package FactoryDesignpattern;

public class OreoMilkshake implements Milkshake{
	public final String name;

    public OreoMilkshake() {
        this.name = MilkshakeName.OreoMilkshake.toString();
    }
}
