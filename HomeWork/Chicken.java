/**  
 * @Title: Chicken.java
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:59:50 
 */  

package HomeWork;

/**  
 * @ClassName: Chicken
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:59:50 
*/

public class Chicken extends Animal{
	private String wing;
	Chicken(String name,char sex,String wing){
		super(name,sex);
		this.wing=wing;
	}
	
	public void chickenToString() {
		System.out.println("我是"+name+"，我是"+sex+"，我有"+wing);
	}
}
