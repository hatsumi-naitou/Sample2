package sample.application;

public class Fourth {

	public String name = null; //new String();
	public static String name2 = null;	
	
	public Fourth(String a) {
		this.name = a;
		name2 = a;
	}
	
	public void showName(){
		System.out.println(this.name);
	}
	
	public void showName2(){
		System.out.println(name2);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Fourth fourth = new Fourth(new String("hoge"));
		fourth.showName(); //hoge
		fourth.showName2(); //hoge
		
		Fourth fifth = new Fourth(new String("デジハリ"));
		fifth.showName(); //デジハリ
		fifth.showName2(); //デジハリ
		
		fourth.showName();//hoge　　　　//アンケートの枠がコンストラクター/入力情報が一度に出てくるのがインスタンス？セットになっている。
		fourth.showName2();//デジハリ　　//showName2はname2を出力するもの。name２はクラスにひもづくため、インスタンスには関係ない。　//車を何個作ったかという全体的な数を把握するときに使えるかも？
		
		fifth.showName2();//
		
		fourth = new Fourth("test");
		
		fourth.showName2();//test
		fifth.showName2();//test
		
		fourth.showName();//test
		fifth.showName();//デジハリ
		
		
		System.out.println("toString() called! :" + fourth.toString());
		Hello hello = new Hello();
		System.out.println("hello.toString() called! :" + hello.toString());
		
		
		

	}

}
