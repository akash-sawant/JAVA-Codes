class Test{
	public void m1(int i){
		System.out.println("the integr argument is:");
	}
	public void m1(flaot f){
		System.out.println("the float argument is:");
	}
}
public class OverLodedMethodEx{
	public static void main(String[]args){
		Test t=new Test();
		t.m1(10);
		t.m1(10.5f);
	}
}