package sample.application;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("Hello world!");
		int i = 1;
		String o = new String("Hello");
		Hello h = new Hello();
		
		Hello.show(o);
		//Hello.show(i);
	
		
	}
	
	public static void show(String a){
		System.out.println(a);
	}


}
