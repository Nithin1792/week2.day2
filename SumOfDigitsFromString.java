package week2.day2;

public class SumOfDigitsFromString {
int sum =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum = 0;
		System.out.println(text.length());
		
		String replaceAll = text.replaceAll("\\d", "");
		char[] charArray = replaceAll.toCharArray();
		System.out.println(charArray);		 
		
		for (int i = 0; i < charArray.length; i++) {
System.out.println(charArray[i]);
int numVal = Character.getNumericValue(charArray[i]);
//System.out.print(numVal);
sum=sum+ numVal;
System.out.println(sum);
	}

}



}
