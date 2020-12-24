/**  
 * @Title: Dog1.java
 * @Description: 
 * @author LYL
 * @date 2020-12-24 06:16:25 
 */  

package HomeWork;


/**  
 * @ClassName: Dog1
 * @Description: 
 * @author LYL
 * @date 2020-12-24 06:16:25 
*/

public class Dog1 {
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
