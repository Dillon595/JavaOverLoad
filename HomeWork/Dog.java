/**  
 * @Title: Dog.java
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:51:44 
 */

package HomeWork;

/**
 * @ClassName: Dog
 * @Description:
 * @author LYL
 * @date 2020-12-24 05:51:44
 */

public class Dog extends Animal {

	private String tail;

	Dog(String name, char sex, String tail) {
		super(name, sex);
		this.tail = tail;
	}

	Dog(String name, int weight) {
		super(name, weight);
	}

	public void bite() {
		System.out.println("惹我雷琳啰，咬死你！");
	}
	
	public void dogToString() {
		System.out.println("我是"+name+"，我是"+sex+"，我有"+tail);
	}
}
