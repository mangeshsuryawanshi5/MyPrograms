package inheritance;

public class Single_Level_Study {

	public static void main(String[] args) {
	
		Mother m=new Mother(); //Created object for mother class
		
        m.look();  // calling methods from mother class
        m.money();
        
	
	    Daughter d=new Daughter(); //Created object for daughter class
	    
	    d.mobile(); // calling methods from daughter class
	    
	    
        d.look(); // Calling methods from superclass
        d.money();
        
        
        
	}
	

}
