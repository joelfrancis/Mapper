import java.io.*;
import java.util.*;

public class Mapper{

public static void Mapper(String stemWords){
    
        if(stemWords != null) 
        {
            
       String[] words = stemWords.split(" ");
       
       for(int i =0; i<words.length;i++)
       {
           words[i] = words[i] + " 1";    
        }
           
        for(int i =0; i<words.length;i++)
       {
           System.out.print(words[i]+",");
           
        }    
 
    }
}
public static void main(String[] args) throws IOException{

    Reader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    String x = br.readLine();
    Mapper(x); 
}
}
