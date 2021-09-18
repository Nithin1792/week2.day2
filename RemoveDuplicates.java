package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We learn java basics as part of java sessions in java week1";
		String[] splStr = str.split(" ");
		System.out.println(splStr.length);

		System.out.println(splStr.getClass().getTypeName());
		for (int i = 0; i <= splStr.length - 1; i++) {
			System.out.print(" ");
			System.out.print(splStr[i]);

			for (int j = i + 1; j < splStr.length - 1; j++) {
				if (splStr[i].equalsIgnoreCase(splStr[j])) {
					splStr[j] = "";
				}

			}
		}
	}

}
