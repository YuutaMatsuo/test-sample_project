package sample;

public class Main {
	public static void main(String[] args) {
	hello("みなと");
	purasu(10,15);
	purasu(20,10);

	System.out.println("テスト メインブランチ");
	System.out.println("テスト中です");
	
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
		System.out.println("よろしくお願いします");
	}
	
	public static void purasu(int a, int b) {
		System.out.println(a + b);
	}
}
