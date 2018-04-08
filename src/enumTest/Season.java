package enumTest;

public enum Season {
	WINTER("Low") {
		@Override
		public void printHour() {
			// TODO Auto-generated method stub
			System.out.println("9am-5pm");
			
		}
		
		public void printExpectedVisitors(){
			System.out.println("Test Override");
		}
	}, 
	SPRING("Medium") {
		@Override
		public void printHour() {
			// TODO Auto-generated method stub
			System.out.println("9am-7pm");
		}
	}, 
	SUMMER("High") {
		@Override
		public void printHour() {
			// TODO Auto-generated method stub
			System.out.println("9am-5pm");
		}
	}, 
	FALL("Medium") {
		@Override
		public void printHour() {
			// TODO Auto-generated method stub
			System.out.println("9am-5pm");
		}
	};
	
	public abstract void printHour();
	
	
	private String expectedVisitors;
	
	private Season(String expectedVisitors){
		System.out.println("Test");
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors(){
		System.out.println(this.expectedVisitors);
	}
	
	
}
