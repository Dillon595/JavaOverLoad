
package HomeWork;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:23:46 
*/

public class Test {
	public static void main(String[] args) {
		System.out.println("***************************第一题***************************");
		Student student = new Student("雷杨龙",20,"学士学位");
		student.show();
		Undergraduate ungraduate = new Undergraduate("雷杨龙",20,"学士学位","软件工程");
		ungraduate.UndergraduateShow();
		Graduate graduate = new Graduate("雷杨龙",20,"学士学位","软件工程","人工智能");
		graduate.graduateShow();
		
		System.out.println();
		System.out.println("***************************第二题***************************");
		Tank tank = new Tank("500","600",'上');
		tank.TankAttack();
		Bullet bullet = new Bullet("500","600","机枪子弹");
		bullet.BulletAttack();
		
		System.out.println();
		System.out.println("***************************第三题***************************");
		Dog leilin1 = new Dog("雷琳",900);
		Frog leilin2 = new Frog("雷琳",900);
		leilin1.bite();
		leilin2.swim();
		
		System.out.println();
		System.out.println("***************************第四题***************************");
		Chicken chicken1 = new Chicken("花花",'母',"一对金黄色的翅膀");
		Chicken chicken2 = new Chicken("草草",'公',"一对银黄色的翅膀");
		chicken1.chickenToString();
		chicken2.chickenToString();
		Dog dog1 = new Dog("小白",'公',"一条金黄色的尾巴");
		Dog dog2 = new Dog("小黄",'母',"一条银白色的尾巴");
		dog1.dogToString();
		dog2.dogToString();
		
		System.out.println();
		System.out.println("***************************第五题***************************");
		ZhaFruit zf = new ZhaFruit();
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的")));
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的"),new Banana("香蕉","黄色","酸酸的")));
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的"),5));
		
		System.out.println();
		System.out.println("***************************第六题***************************");
		Dog1 dog3 = new Dog1();
		Person person1 = new Person('男');
		Person person2 = new Person('女');
		dog3.yao();
		dog3.yao(person1);
		dog3.yao(person2);
		
		System.out.println();
		System.out.println("***************************第六题***************************");
		Student s1 = new Student();
		System.out.print("未赋值：");
		s1.show();
		Student s2 = new Student("雷杨龙");
		System.out.print("给名字赋值：");
		s2.show();
		Student s3 = new Student(20,"雷杨龙",'男');
		System.out.print("名字性别年龄全赋值：");
		s3.show();
		
	}
}
