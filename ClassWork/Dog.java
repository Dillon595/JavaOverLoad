
package ClassWork;

/**  
 * @ClassName: Dog
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:36:10 
*/

public class Dog {
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
