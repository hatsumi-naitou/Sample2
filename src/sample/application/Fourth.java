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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Fourth fourth = new Fourth(new String("hoge"));
		fourth.showName(); //hoge
		fourth.showName2(); //hoge
		
		Fourth fifth = new Fourth(new String("�f�W�n��"));
		fifth.showName(); //�f�W�n��
		fifth.showName2(); //�f�W�n��
		
		fourth.showName();//hoge�@�@�@�@//�A���P�[�g�̘g���R���X�g���N�^�[/���͏�񂪈�x�ɏo�Ă���̂��C���X�^���X�H�Z�b�g�ɂȂ��Ă���B
		fourth.showName2();//�f�W�n���@�@//showName2��name2���o�͂�����́Bname�Q�̓N���X�ɂЂ��Â����߁A�C���X�^���X�ɂ͊֌W�Ȃ��B�@//�Ԃ�����������Ƃ����S�̓I�Ȑ���c������Ƃ��Ɏg���邩���H
		
		fifth.showName2();//
		
		fourth = new Fourth("test");
		
		fourth.showName2();//test
		fifth.showName2();//test
		
		fourth.showName();//test
		fifth.showName();//�f�W�n��
		
		
		System.out.println("toString() called! :" + fourth.toString());
		Hello hello = new Hello();
		System.out.println("hello.toString() called! :" + hello.toString());
		
		
		

	}

}
