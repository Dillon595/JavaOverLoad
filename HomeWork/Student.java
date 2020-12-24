
package HomeWork;

/**
 * @ClassName: Student
 * @Description:
 * @author LYL
 * @date 2020-12-24 05:06:28
 */

public class Student {
	String name;
	char sex;
	int age;
	String degree;

	Student() {

	}

	Student(String name, int age, String degree) {
		this.name = name;
		this.age = age;
		this.degree = degree;
	}

	Student(int age, String name, char sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	Student(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("name = " + name + "£¬age = " + age + "£¬degree = " + degree);
	}
}
