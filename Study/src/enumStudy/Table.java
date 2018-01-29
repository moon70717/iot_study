package enumStudy;

public enum Table {

	mountain("산악용"),sea("워터슈즈");
	
	final private String name;
	
	private Table(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
