
package ClassWork;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:31:49 
*/

public class Test {
	public static void main(String[] args) {
		System.out.println("***************************�ڶ���***************************");
		ZhaFruit zf = new ZhaFruit();
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����")));
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����"),new Banana("�㽶","��ɫ","�����")));
		System.out.println(zf.GetFruitZhi(new Apple("ƻ��","��ɫ","�����"),5));
		
		System.out.println();
		System.out.println("***************************������***************************");
		Dog dog = new Dog();
		Person person1 = new Person('��');
		Person person2 = new Person('Ů');
		dog.yao();
		dog.yao(person1);
		dog.yao(person2);
	}
}
