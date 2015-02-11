import java.io.*;

public class subseq {

	static int[] stackarr= new int[15];
	static int stacktop=0;
	public static void main(String[] args) {
	
	    int maxcnt=0;
		int varcnt=1;
		int cnt=1;
		int island_cnt=0;
	    try
	    {
		 FileReader ifile = new FileReader("H.txt");	
     	 BufferedReader reader = new BufferedReader(ifile);
	     String line = reader.readLine();
	     maxcnt=Integer.parseInt(line);
	    
	     while(maxcnt>0)
	     {
	    	 line = reader.readLine();
	    	 String[] charr = line.split(" ");
	    	 while(cnt<16)
	    	 {
	    	   int n = Integer.parseInt(charr[cnt]);
	    	   if(n > stackarr[stacktop])
	    	   {
	    		   push(n);	 
	 	  	   }//comment
	    	   else 
	    	   {
	    		   if(n < stackarr[stacktop])
	    		   {
	    			   pop();
	    			   if(stackarr[stacktop]==n)
	    				   island_cnt++; 
	    		   }
	    	   }
	    	   cnt++;
	    	 }
	    	
	    	 System.out.println(varcnt + " " + island_cnt);
	    	 island_cnt=0;
	    	 cnt=2;
	    	 EmptyStack();
	    	 maxcnt--; 
	         varcnt++;
	     }
	     reader.close();
	    }
	    
	    catch(Exception ex)
	    {
	    	System.out.println("Exception occured");
	    	
	    }
     	 
     	
	
	}
	
	public static void push(int n)
	{
		stacktop++;
	    stackarr[stacktop] = n;	 
	}
	
	public static int pop()
	{
      int val = stackarr[stacktop];
      stacktop--;
      return val;
	}
	public static void EmptyStack()
	{
		while(stacktop!=0)
			pop();
		
	}
	

}
