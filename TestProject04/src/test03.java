
public class test03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Java_12
		for(int i = 1; i <= 2; i++){
			 System.out.println( i );
			 System.out.println( "-" );
			 }
		for( int i = 0; i < 3; i++){
			 System.out.println(i);
			 }
		for( int i= 10;   i > 5;  i--){
			System.out.println(i);
			}
		for( int i=1; i< 10; i+=2){
	        System.out.println(i);
		}
		for( int i=10; i> 1; i-=2){
	        System.out.println(i);
		}
		for(int i=1; i<=5; i++){
			System.out.println("★");
		}
		//Java_13
		 for(int i=1; i<=10; i++) {
			 if(i % 2 == 0) {
			 System.out.println( i );
			 }
		 }
		//ある数(ｉ)が、初期値1から10以下の間で、
		//ある数(i )が偶数(÷2して余りが0)の場合は、ある数( i )を表示する。
		 for(int a=0; a<3; a++){
			 for(int b=1; b<4; b++){
				 System.out.println(b);
			 }
		 }
		 //for文とfor文のネスト(外側のfor文一回目→内側のfor文3回繰り返す）
		 int a =10;
		 String b= a >= 0 ? "プラス":"マイナス";
		 System.out.println(b);
		 //ある数(a)が0以上だった場合プラス、0未満だった場合マイナス、と表示する。
		 int c = 2;
		 String d = c % 2 == 0 ?  "偶数":"奇数";
		 System.out.println(d);
		 
		 for(int i=0; i<=5; i++) {
			String e= i % 2 == 0 ? "☆":"★";
		    System.out.println(e);	
		 }
	}

}
