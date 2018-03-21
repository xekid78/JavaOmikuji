# JavaOmikuji
おみくじ

## 処理
randomメソッドを使用して1 ～ 6のランダムな数字を使って、おみくじの結果を出力します。

## コード
```
public class Omikuji {
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
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE)： | Eclipse 4.7.0 Oxygen |
| 開発言語： | Java8 |
