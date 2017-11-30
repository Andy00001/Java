import java.util.*;
import java.io.*;
public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what console ?");
		String name = sc.nextLine();
		System.out.println("what num?");
		int old = sc.nextInt();
		System.out.println("end " + name + old);
		//Console cons = System.console();
		//String name_user = cons.readLine("user name");
		//char[] passwd = cons.readPassword();
		//System.out.print("user is " + name_user + "passwd is "+ passwd);
	}
}
