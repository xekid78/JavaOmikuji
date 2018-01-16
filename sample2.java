/**
 *
 * @author xekid78
 *
 */
public class sample2 {
	
	public static void main(String[] args) {
		int omikuji = (int)(Math.random() * 6 + 1);
		if (omikuji == 1) {
			System.out.println("大吉");
		} else if (omikuji == 2) {
			System.out.println("中吉");
		} else if (omikuji == 3) {
			System.out.println("小吉");
		} else if (omikuji == 4) {
			System.out.println("吉");
		} else if (omikuji == 5) {
			System.out.println("凶");
		} else {
			System.out.println("大凶");
		}
	}

}
