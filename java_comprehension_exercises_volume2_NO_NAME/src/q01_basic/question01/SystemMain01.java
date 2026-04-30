package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36Mem
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member memberM = new Member();

		memberM.name = "Miura Manabu";
		memberM.age = 24;
		memberM.rank = 1;
		memberM.showMember();

		Member memberS = new Member();

		memberS.name = "Sato Kensuke";
		memberS.age = 36;
		memberS.rank = 2;
		memberS.showMember();

	}

}
