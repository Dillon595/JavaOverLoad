
package HomeWork;

/**  
 * @ClassName: Graduate
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:10:22 
*/

public class Graduate extends Undergraduate {
	String direction;
	
	Graduate(String name,int age,String degree,String specialty,String direction) {
		super(name,age,degree,specialty);
		this.direction=direction;
	}
	public void graduateShow() {
		System.out.println("name = "+name+"£¬age = "+age+"£¬degree = "+degree+"£¬specialty = "+specialty+"£¬direction = "+direction);
	}
	
}
