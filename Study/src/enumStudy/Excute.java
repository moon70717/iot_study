package enumStudy;

public class Excute {

	public static void main(String[]args) {
		for(Table t: Table.values()) {
			System.out.println(t.getName());
		}
	}
}
