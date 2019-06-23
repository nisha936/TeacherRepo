package test;

public class SplitExample {
	public static void main(String[] args) {
		String str = "Nisha Shrestha";
		String nameArray[] = str.split("s");
		for(String a:nameArray) {
		System.out.println(a);
		}
	}
}