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
		System.out.println("������");
	}
	public void yao(String str) {
		System.out.println("ҧ"+str+"�����㰡");
	}
	public void yao(Person p) {
		if(p.getSex()=='��') {
			System.out.println("����ȥ˺ҧ");
		}
		if(p.getSex()=='Ů') {
			System.out.println("�ܹ�ȥ������");
		}
	}
}
