import java.util.*;
public class PersonTest {

	public static void main(String[] args) {
		Person[] array;
		array = new Person[3];
		
		array[0] = new Person("ȫ�浿", 180);
		array[1] = new Person("�̱浿", 170);
		array[2] = new Person("��浿", 190);
		
		System.out.println("[���� Ű ū ���]");
		System.out.println(getMax(array));
	}
	public static String getMax(Person[] array){
		Person max = array[0];
		
		for(int i = 0; i < array.length; i++)
			if(array[i].getHeight() > max.getHeight())
				max = array[i];
		return "�̸�: " + max.getName() + ", height: " + max.getHeight();
	}
	
}
