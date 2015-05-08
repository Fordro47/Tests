
public class FirstTest{
	public static void main (String[] args){
		System.out.println("This is my first test");
		SecondTest sT = new SecondTest();
		int answer = sT.add(1, 2);
		System.out.print(answer);
	}
}