import java.util.*;
public class PersonTest {

	public static void main(String[] args) {
		Person[] array;
		array = new Person[3];
		
		array[0] = new Person("홍길동", 180);
		array[1] = new Person("이길동", 170);
		array[2] = new Person("김길동", 190);
		
		System.out.println("[제일 키 큰 사람]");
		System.out.println(getMax(array));
	}
	public static String getMax(Person[] array){
		Person max = array[0];
		
		for(int i = 0; i < array.length; i++)
			if(array[i].getHeight() > max.getHeight())
				max = array[i];
		return "이름: " + max.getName() + ", height: " + max.getHeight();
	}
	
}
