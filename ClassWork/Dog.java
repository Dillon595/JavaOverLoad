
package ClassWork;

/**  
 * @ClassName: Dog
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:36:10 
*/

public class Dog {
	public void yao() {
		System.out.println("汪汪叫");
	}
	public void yao(String str) {
		System.out.println("咬"+str+"，好香啊");
	}
	public void yao(Person p) {
		if(p.getSex()=='男') {
			System.out.println("扑上去撕咬");
		}
		if(p.getSex()=='女') {
			System.out.println("跑过去舔两口");
		}
	}
}
