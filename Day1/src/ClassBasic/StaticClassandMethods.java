package ClassBasic;

public class StaticClassandMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticClassandMethods obj = new StaticClassandMethods();
		add(3,5);
	/*	new StaticClassandMethods().sub(4, 6);
		new StaticClassandMethods().add(9, 6);
		new StaticClassandMethods().sub(4, 6);
		new StaticClassandMethods().add(9, 6);
		new StaticClassandMethods().sub(4, 6);
		new StaticClassandMethods().add(9, 6);
		
		new StaticClassandMethods().sub(4, 6);
		new StaticClassandMethods().add(9, 6);*/
		
	}

	
	public static int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public int sub(int a,int b) {
		System.out.println(b-a);
		return b-a;
	}
}
