package enumTest;

public enum OnlyOneEnum {
	ONE("One"){
		
	};
	
	private String name;
	
	private OnlyOneEnum(String name){
		this.name = name;
		System.out.println("Only One");
	}
	
	public String getName(){
		return this.name();
	}
}
