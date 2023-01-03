
public class Profile implements Comparable {
	private int id;
	private String name;
	
	public Profile(int i, String n) {
		id = i;
		name = n;
	}

	public int getId() { return id; }
	public String getName() { return name; }
	
	public int compareTo(Object obj) {
		Profile other = (Profile) obj;
		if(id > other.id)
			return 1;
		else if(id < other.id)
			return -1;
		else
			return 0;
	}
}
