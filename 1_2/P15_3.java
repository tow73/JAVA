import java.util.*;
public class P15_3 {

	public static void main(String[] args) {
		Calendar n = Calendar.getInstance();
		
		System.out.println("������ " + n.get(Calendar.HOUR) + "��" + 
				n.get(Calendar.MINUTE) + "�� �Դϴ�");  //HOUR_OF_DAY�� ���� 0~24
		if(n.get(Calendar.HOUR_OF_DAY) >= 6 && n.get(Calendar.HOUR_OF_DAY) <= 12)
			System.out.println("Good Morning");
		else if(n.get(Calendar.HOUR_OF_DAY) > 13 && n.get(Calendar.HOUR_OF_DAY) <= 18)
			System.out.println("Good Afternoon");
		else if(n.get(Calendar.HOUR_OF_DAY) > 18 && n.get(Calendar.HOUR_OF_DAY) <= 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
