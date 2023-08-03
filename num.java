import java.util.*;
public class num {
	public static void Numpredict()
	{   
	    int m=6;
        int k,predict;
		Scanner sc = new Scanner(System.in);
		int num = 1 + (int)(100* Math.random());
		System.out.println("Random Number is generated");
        System.out.println("choose the number"+ " between 1 to 100.");
        System.out.println("predict the number"+ " within 6 trials.");
		for (k = 0; k < m; k++) {
            System.out.println("predict the number.Chance no"+(k+1));
			predict = sc.nextInt();
			if (num == predict) {
				System.out.println("Well done!"+ "You predict the num.");
				break;
			}
			else if (num < predict && k != m - 1) {
				System.out.println("The number is "+ "less than " + predict);
			}
			else if (num > predict && k != m - 1) {
				System.out.println("The number is"+ " greather than " + predict);
			}
		}
        if (k == m) {
            System.out.println("The number is " + num);
            System.out.println("You Loss the game");
			System.out.println("Your score is 0");
		}
		sc.close();
	}
	public static void main(String arg[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Start the game : Yes/No");
	String s=sc.nextLine();
	while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
	{
		Numpredict();
		System.out.println("DO you want to continue Yes/No");
		s=sc.nextLine();
	}
	sc.close();
}
}