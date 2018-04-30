
public class Encapsulate {
	//Encapsulatin used to keep the newName and newAge is private
	private String newName;
	private int newAge;
	
	
	public int getAge() {
		return newAge;
	}
	
	public String getName() {
		return newName;
	}
	
	public void setAge(int nowAge) {
		newAge = nowAge;
	}
	
	public void setName(String nowName) {
		newName = nowName;
	}
 
}
