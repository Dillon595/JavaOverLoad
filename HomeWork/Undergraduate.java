
package HomeWork;

/**  
 * @ClassName: Undergraduate
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:10:15 
*/

public class Undergraduate extends Student {
	String specialty;
	
	Undergraduate(String name,int age,String degree,String specialty){
		super(name,age,degree);
		this.specialty=specialty;
	}
	public void UndergraduateShow() {
		System.out.println("name = "+name+"£¬age = "+age+"£¬degree = "+degree+"£¬specialty = "+specialty);
	}
}
