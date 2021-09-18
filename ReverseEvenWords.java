package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a Automation tester";
		String[] split = test.split(" ");
		int len = split.length;
		// System.out.println(len);
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
				System.out.print(split[i]);
			}
			if (i % 2 != 0) {
				// System.out.println("Index is odd: " + i);
				//System.out.println(split[i]);
				System.out.print(" ");
				char[] ch = (split[i]).toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);

				}

				// System.out.println(split2[i]);
			}

		}
	}

}
