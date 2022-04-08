package string_Study;

public class String_use {

	public static void main(String[] args) {
//		
//		String a="Pune";
//		int a1=10;
//		String_use s=new String_use();
		
		String m="Velocity"; //Object creation without using new keyword
        
		String m1="Velocity";
		String n=new String("Velocity"); //Object creation with using new keyword
		String n1=new String("Velocity");
		String n2=new String("Velocity Pune");
		
		//equals()
		
		System.out.println("======equals()=======");
		System.out.println(m==m1);
		System.out.println(m==n);
		System.out.println(m.equals(n));
		System.out.println(n.equals(n1));
		System.out.println(n.equals(n2));
		
		//length()
		
		int lengthofn2=n2.length();
		int lengthofm=m.length();
		int lengthofm1=m1.length();
		
		System.out.println("=====length()========");
		System.out.println("lenght is "+lengthofn2);
		System.out.println("lenght is "+lengthofm);
		System.out.println("lenght is "+lengthofm1);
		
		//toUpperCase()
		System.out.println("=====toUpperCase()========");
		System.out.println(m.toUpperCase());
		System.out.println(n2.toUpperCase());
		
		//toLowerCase()
		System.out.println("=====toLowerCase()========");
		System.out.println(m.toLowerCase());
		System.out.println(n2.toLowerCase());
		
		//equalsIgnoreCase()
		
		String a="velocity";
		String b="Velocity";
		
		System.out.println("======equalsIgnoreCase()=======");
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(m.equalsIgnoreCase(n2));
		
		//contains()
		
		System.out.println("=====contains()========");
		System.out.println(a.contains("ve"));
		System.out.println(a.contains("v"));
		
		//isEmpty()
		
		String ab="";
		String cd=" ";
		String pq="Velocity";
		System.out.println("======isEmpty()=======");
		System.out.println(a.isEmpty());
		System.out.println(ab.isEmpty());
		System.out.println(cd.isEmpty());
		
		//charAt
		System.out.println("======charAt()=======");
		System.out.println(pq.charAt(7));
		System.out.println(pq.charAt(0));
		System.out.println("charAt(7)is "+pq.charAt(7));
//		System.out.println(pq.charAt(-1));
		
//		String ef=null;
//		System.out.println(ef.length());
		
		System.out.println("======ends with/starts with()=======");
		String mn="Velocity";
		System.out.println(mn.startsWith("Vel"));
		System.out.println(mn.endsWith("ty"));
		
		//substring
		
		System.out.println("======substring()=======");
		System.out.println(mn.substring(4));
		System.out.println(mn.substring(2, 7));
		System.out.println(mn.subSequence(1, 6));
		
		//concat
		
		String p="Velocity ";
		String q="Corporte ";
		String r="Training ";
		String s="Center ";
		String t="Katraj ";
		
		System.out.println("======concat()=======");
		System.out.println(p.concat(q));
		System.out.println(p.concat(q).concat(r).concat(s).concat(t));
		
		System.out.println("======indexOf()=======");
		String FinalString=p.concat(q).concat(r).concat(s);
		System.out.println(FinalString.indexOf('o'));
		System.out.println(FinalString.lastIndexOf('o'));
		System.out.println(FinalString.replace('o', 'i'));
		
		String k="NITIN";
				
		System.out.println("======replace()=======");
		System.out.println(k.replace("NI", "SA"));
		
	
	  
		
	
		
		
		
		
		
		
		
		
		
	}

}
