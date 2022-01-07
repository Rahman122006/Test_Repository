package ClassBasic;

public class PassValuesoForMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassValuesoForMethod object = new PassValuesoForMethod();
		//object.main(args);
		int output=object.add(2, 40);
		int result=object.sub(3, output);
		object.multi(3, result);
	
		object.add(2, 40);
		object.sub(2, 4);
	}

	
	public int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public int sub(int a,int b) {
		System.out.println(b-a);
		return b-a;
	}
	
	public void multi(int a,int b) {
		System.out.println(b*a);
	}
	
	public Object noTyperetrun(int b) {
		return b;
	}
	
/*	
	public String multi(String a,int b) {
		return "fsdfas";
	}*/
	
}
