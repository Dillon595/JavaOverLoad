
package HomeWork;

/**  
 * @ClassName: Tank
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:36:57 
*/

public class Tank extends Weapon {
	private char dir;
	
	Tank(String power,String speed,char dir){
		super(power,speed);
		this.dir=dir;
	}
	
	public void TankAttack() {
		System.out.println("����̹�ˣ���"+dir+"�����˶����ٶ�"+speed+"��������"+power);
	}
}
