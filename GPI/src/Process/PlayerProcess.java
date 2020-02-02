package Process;

import java.util.Random;

import data.*;


	public class PlayerProcess {
	    private static int Max = 90;
		private static int Min = 20;
	
		
	    
	    	
	   
	    	
	    public static Goalkeeper generateGoalkeeper(int i) {
	    	Random rand = new Random();
	    	if(i==0) {
	    		
	            Goalkeeper g=new Goalkeeper(20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1),0,false,false,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
	            g.setSubstitute(true);
	            return g;
	    	}else {
	    		Goalkeeper g=new Goalkeeper(20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1),0,false,false,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
	    		 return g;
	    	}
	    }
	    
	    
	    
	    public static Forward generateForward(int i)
	    {
	    	Random rand = new Random();
	    	if(i>3) {
	            Forward forw=new Forward(20+(int) rand.nextInt(Max - Min + 1),
	            		20+(int) rand.nextInt(Max - Min + 1),0,false,true,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
	            forw.setSubstitute(true);
	            return forw;
	    	}else {
	    		Forward forw=new Forward(20+(int) rand.nextInt(Max - Min + 1),
	            		20+(int) rand.nextInt(Max - Min + 1),0,false,false,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
	    		return forw;
	    	}
	    }
	            
	            
	            
	    public static Defender generateDefender(int i)
	    {
	    	Random rand = new Random();
	    	if(i<6) {
	    		Defender d=new Defender(20+(int) rand.nextInt(Max - Min + 1),
	            		20+(int) rand.nextInt(Max - Min + 1),0,false,true,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
	           d.setSubstitute(true);
	           return d;
	    	}else {
	    		Defender d=new Defender(20+(int) rand.nextInt(Max - Min + 1),
	            		20+(int) rand.nextInt(Max - Min + 1),0,false,false,
	            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		           return d;
	    	}
	     }
	    
	    
	}
	    


