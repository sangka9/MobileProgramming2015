package kr.ac.kookmin.exception.fileio;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/

public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

         String line = null;
         int num = 1;
 		
		while((line = inputStream.readLine()) != null) {
			outputStream.write(num + line);
			outputStream.println();
			num++;
		}

         inputStream.close( );
         outputStream.close( );
      }
      catch(FileNotFoundException fnfe)
      {
          System.out.println(fnfe.getMessage());
      }

      catch(IOException ioe)
      {
          System.out.println(ioe.getMessage());
      }
      /** catch() 구문 작성하시오 **/

   }
}