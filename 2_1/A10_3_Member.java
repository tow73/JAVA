import java.util.*;
public class Member {
	TreeSet<String> name = new TreeSet<>(Collections.reverseOrder());
	String n;

	void TreeSet(String n){
		name.add(n);
	}

	void Print() {
		System.out.println(name);
	}
}
