public class Demo{

	public static void main(String[] args) {
		
     String s="i love my india";
     char c[]=s.toCharArray();
     int count=0;
     
     for( char ch:c)
     {
    	 if(ch=='i')
    	 {
    		 count++;
    	 }
    	 
     }
     System.out.println(count);
	}
	

}
