package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
	//	String revString = "";
		char[] conArr = test.toCharArray();
		// System.out.println("length " + conArr.length);
		// System.out.println("Return type is " + conArr.getClass().getTypeName());
		for (int i = conArr.length - 1; i >= 0; i--) {
		//	revString = revString + conArr[i];
			System.out.print(conArr[i]);
			
		}
	}

}
