package chap5;
/* 
 * [결과]
 * (1)+(1+2)+(1+2+3)+ ... +(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10)=220
 */

public class Test5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum += j;
			}
		}
		System.out.println("sum="+sum);
		sum=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + ((j == i) ? "" : "+"));
				sum += j;
			}
			System.out.print(")" + ((i == 10) ? "=" : "+"));
		}
		System.out.println(sum);

	}
}