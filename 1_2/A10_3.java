import java.util.*;
public class DogTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dog2[] dogArray = new Dog2[3];
		Dog2 d = new Dog2();
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.print("pet�� �̸��� �Է��ϼ���: ");
			d.setName(sc.nextLine());
			System.out.print("pet�� ������ �Է��ϼ���: ");
			d.setType(sc.nextLine());
			dogArray[i] = new Dog2(d.getName(), d.getType());
		}
		
		System.out.println("** for�� **");
		for(int i=0; i<dogArray.length; i++)
			System.out.println(dogArray[i].toString());
		
		System.out.println("** foreach�� **");
		for(Dog2 d2 : dogArray)
			System.out.println(d2.toString());
	}

}
