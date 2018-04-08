package enumTest;

public class EnumWithSwithCase {
	
	public static void main(String[] args) {
		Season summer = Season.SUMMER;
		
		switch(summer){
			case SUMMER : System.out.println("This is a summer."); break;
			// case Winter: erroe SeasonEnum has not Winter
			case FALL : System.out.println("This is a FALL");break;
			// case Season.SPRING  : error you must use only SPRING
		}
	}
}
