/**
 * @author xy
 * @version 1.0
 * @date 2020/11/6 21:36
 */
public class User {

	private String name;

	private int age;

	private String gender;

	public User() {
	}

	public User(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ioc.repository.injection.User{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
