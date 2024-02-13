package FactoryDesignpattern;

public class VannilaMilkshake implements Milkshake{
	public final String name;

    public VannilaMilkshake() {
        this.name = MilkshakeName.VannilaMilkshake.toString();
    }
}
