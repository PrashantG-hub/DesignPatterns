package FactoryDesignpattern;

public class Client {
	 public static void main(String[] args) {
	        MilkshakeFactory milkshakeFactory = new MilkshakeFactory();

	        OreoMilkshake oreoMilkshake = 
	            (OreoMilkshake) milkshakeFactory.prepare(MilkshakeName.OreoMilkshake);
	        
	        ButterscotchMilkshake butterscotchMilkshake = 
	            (ButterscotchMilkshake) milkshakeFactory.prepare(MilkshakeName.ButterscotchMilkshake);
	        
	        VannilaMilkshake vannilaMilkshake = 
	            (VannilaMilkshake) milkshakeFactory.prepare(MilkshakeName.VannilaMilkshake);
	    }
}
