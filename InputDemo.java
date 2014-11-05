import java.io.*; 
//save file as InputDemo.java
public class InputDemo {
	public static void main(String[] args) throws IOException {
			int ilist[] = new int[1000];// this is an array
    	    int i, c,count;// integers i, c and count
    	     count = 0;
    	     
    	     // *****************************  this code was obtained from Oracle
    	     FileReader inputStream = null;
    	     try { inputStream = new FileReader("datafile.txt");
    	          while ((c = inputStream.read()) != -1) {
    	     //******************************
    	          	  
    	       
    	        
    	     //******************************     	  
				count++;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }//end of finally and try
       // ***************************** 
        int val;
        char ncar;

        // This for loop prints the list.
			System.out.println("This of items in the array");
            for (i = 0; i < count ; i ++){
				System.out.print (ilist[i]);
            }
            
    }
}
