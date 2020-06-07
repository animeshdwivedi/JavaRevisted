package animesh.javacodes;

public class ArraySearch {

	public ArraySearch() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println("Array Search Linear and Binary");
		int num[] = {10, -5, 34, 55, 6, 789, 666, 35};
		int searchNum = 789;
		for(int i = 0; i < num.length; i++) {
			if(searchNum == num[i]) {
				System.out.println("Number found at : " + i);
			}
		}

	}

}
