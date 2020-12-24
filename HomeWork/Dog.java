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
		System.out.println("�������Ն���ҧ���㣡");
	}
	
	public void dogToString() {
		System.out.println("����"+name+"������"+sex+"������"+tail);
	}
}
