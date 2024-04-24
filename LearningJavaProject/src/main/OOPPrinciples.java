

package main;

/**
 * @summary
 * Принципы ООП.
 * Разработать класс, в котором реализовать инкапсуляцию, наследование, полиморфизм.
 * Для полиморфизма реализовать перегрузку методов.
 * Дополнительно использовано переопределение метода toString() класса Object.
 */
public class OOPPrinciples extends Person{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", getFirstName(), getLastName());
	}
	
	public String toString(String address) {
		return String.format("%s %s, %s", getFirstName(), getLastName(), address);
	}
}
