package SingletonDesignPattern;
class Singleton{
	private static Singleton obj=null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(obj==null) {
			synchronized(Singleton.class) {
				if(obj==null)
					obj=new Singleton();
			}
		}
		return obj;
	}
}


public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	
	}
}