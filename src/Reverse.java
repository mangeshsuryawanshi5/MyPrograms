
public class Reverse {

	public static void main(String[] args) {
		String str = "Hi I am Velocity";
		String s[]=str.split(" ");
		
				for(int i=s.length-1;i>=0;i--)
			{
				System.out.print(s[i]+" ");
			}
	}

}
