package eka;
class Student{
	String name;
	String hakbun;
	String juso;
	String major;
	public Student(){}
	public Student(String name, String hakbun){
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study(){System.out.println("�����ϴ�.");}
	public void eat(){System.out.println("�Ļ��ϴ�.");}
	public void test(){System.out.println("���躸��.");}
	public void extra_act(){System.out.println("���Ƹ� Ȱ���ϴ�.");}
}
class Leader extends Student{
	boolean isLeader;
	public Leader(){}
	public Leader(String name, String hakbun, boolean isLeader){
		super.name = name;
		super.hakbun = hakbun;
		this.isLeader = isLeader;
	}
	public void isLeader(){
		if(this.isLeader){
			System.out.println(name+"�� �б�ȸ���̴�.");
		}else{
			System.out.println(name+"�� �б�ȸ���� �ƴϴ�.");
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		Leader hong = new Leader("ȫ�浿", "30130", true);
		hong.isLeader();
	}

}
