
package HomeWork;

/**  
 * @ClassName: Bullen
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:43:47 
*/

public class Bullet extends Weapon {
	private String type;
	
	Bullet(String power,String speed,String type){
		super(power,speed);
		this.type=type;
	}
	
	public void BulletAttack() {
		System.out.println("�����ӵ�"+type+"���ٶ�"+speed+"��������"+power);
	}
}
