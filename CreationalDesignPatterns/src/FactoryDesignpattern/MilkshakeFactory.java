package FactoryDesignpattern;

import java.util.HashMap;
import java.util.Map;

public class MilkshakeFactory {
	private Map<MilkshakeName, Milkshake> milkshakeMenu;

    public MilkshakeFactory() {
        buildMilkshakeMenu();
    }

    public Milkshake prepare(MilkshakeName milkshakeName) {
        if (milkshakeName == null) {
            System.out.println("Please provide a milkshake name!");
            return null;
        }

        System.out.println(milkshakeName + " ready!");
        return milkshakeMenu.get(milkshakeName);
    }

    private void buildMilkshakeMenu() {
        milkshakeMenu = new HashMap<>();

        milkshakeMenu.put(MilkshakeName.OreoMilkshake, new OreoMilkshake());
        milkshakeMenu.put(MilkshakeName.ButterscotchMilkshake, new ButterscotchMilkshake());
        milkshakeMenu.put(MilkshakeName.VannilaMilkshake, new VannilaMilkshake());
    }
}
