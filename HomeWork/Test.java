
package HomeWork;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:23:46 
*/

public class Test {
	public static void main(String[] args) {
		System.out.println("***************************��һ��***************************");
		Student student = new Student("������",20,"ѧʿѧλ");
		student.show();
		Undergraduate ungraduate = new Undergraduate("������",20,"ѧʿѧλ","�������");
		ungraduate.UndergraduateShow();
		Graduate graduate = new Graduate("������",20,"ѧʿѧλ","�������","�˹�����");
		graduate.graduateShow();
		
		System.out.println();
		System.out.println("***************************�ڶ���***************************");
		Tank tank = new Tank("500","600",'��');
		tank.TankAttack();
		Bullet bullet = new Bullet("500","600","��ǹ�ӵ�");
		bullet.BulletAttack();
		
		System.out.println();
		System.out.println("***************************������***************************");
		Dog leilin1 = new Dog("����",900);
		Frog leilin2 = new Frog("����",900);
		leilin1.bite();
		leilin2.swim();
		
		System.out.println();
		System.out.println("***************************������***************************");
		Chicken chicken1 = new Chicken("����",'ĸ',"һ�Խ��ɫ�ĳ��");
		Chicken chicken2 = new Chicken("�ݲ�",'��',"һ������ɫ�ĳ��");
		chicken1.chickenToString();
		chicken2.chickenToString();
		Dog dog1 = new Dog("С��",'��',"һ�����ɫ��β��");
		Dog dog2 = new Dog("С��",'ĸ',"һ������ɫ��β��");
		dog1.dogToString();
		dog2.dogToString();
		
		System.out.println();
		System.out.println("***************************������***************************");
		ZhaFruit zf = new ZhaFruit();
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����")));
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����"),new Banana("�㽶","��ɫ","�����")));
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����"),5));
		
		System.out.println();
		System.out.println("***************************������***************************");
		Dog1 dog3 = new Dog1();
		Person person1 = new Person('��');
		Person person2 = new Person('Ů');
		dog3.yao();
		dog3.yao(person1);
		dog3.yao(person2);
		
		System.out.println();
		System.out.println("***************************������***************************");
		Student s1 = new Student();
		System.out.print("δ��ֵ��");
		s1.show();
		Student s2 = new Student("������");
		System.out.print("�����ָ�ֵ��");
		s2.show();
		Student s3 = new Student(20,"������",'��');
		System.out.print("�����Ա�����ȫ��ֵ��");
		s3.show();
		
	}
}
