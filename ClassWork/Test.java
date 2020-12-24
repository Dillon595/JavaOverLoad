
package ClassWork;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:31:49 
*/

public class Test {
	public static void main(String[] args) {
		System.out.println("***************************第二题***************************");
		ZhaFruit zf = new ZhaFruit();
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的")));
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的"),new Banana("香蕉","黄色","酸酸的")));
		System.out.println(zf.GetFruitZhi(new Apple("苹果","红色","甜甜的"),5));
		
		System.out.println();
		System.out.println("***************************第三题***************************");
		Dog dog = new Dog();
		Person person1 = new Person('男');
		Person person2 = new Person('女');
		dog.yao();
		dog.yao(person1);
		dog.yao(person2);
	}
}
