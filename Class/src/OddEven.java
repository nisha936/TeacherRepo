public class OddEven {
	public static void main(String[] args) {
		int[] v= {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<=v.length;i++) {
			//System.out.println(v[i]);
			if(i%2==1) {
				System.out.println("odd:" +i);
			}
			else
				System.out.println("even" +i);
		}
	}

}
