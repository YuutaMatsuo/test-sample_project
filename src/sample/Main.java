package sample;

public class Main {
	public static void main(String[] args) {
	hello("みなと");
	purasu(10,15);
	purasu(20,10);
	
	System.out.println("テスト中");
	System.out.println("テスト");

	
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	public static void purasu(int a, int b) {
		System.out.println(a + b);
	}
}
