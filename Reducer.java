import java.util.concurrent.TimeUnit; 
import java.util.concurrent.TimeoutException; 
import java.util.concurrent.BrokenBarrierException; 
import java.util.concurrent.CyclicBarrier;  
import java.util.Arrays;
import java.util.*;
import java.io.*;

public class Reducer extends Thread
{
    private CyclicBarrier barrier;
    public Thread t;
    
  public void run() 
    {      
            
        try{ 
            /*
          
            */
           //reading stream fromthe  mapper
           Reader reader = new InputStreamReader(System.in);
           BufferedReader br = new BufferedReader(reader);
           String x = br.readLine();
           
           barrier.await(); 
        }catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
         
    } 
  
    public static void main(String args[]) throws InterruptedException, BrokenBarrierException{
     /*
     Test vals 
     __________  
     Hashtable<String, Integer> h = new Hashtable<String, Integer>(); 
     String stemWords = "Lorem 1,Ipsum 1,is 1,simply 1,dummy 1,text 1,of 1,the 1,printing 1,and 1,typesetting 1,industry 1,";
     String[] words = stemWords.split("[ ,]");  
   
     for (int i = 0; i < words.length; i += 2) {
               h.put(words[i],Integer.parseInt(words[i + 1]));
             }
     System.out.println(Arrays.asList(h));
     for(int i = 0; i < words.length; i++)
     {
        System.out.print(words[i]);
        }
        */
       //creating the barrier
       CyclicBarrier newBarrier = new CyclicBarrier(4);
       Thread t1 = new Thread(new Reducer());
       Thread t2 = new Thread(new Reducer());
       Thread t3 = new Thread(new Reducer());
       Thread t4 = new Thread(new Reducer());
       
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       //populating the hashtable
       String stemWords = "";
       String[] words = stemWords.split("[, ]");
       Hashtable<String, Integer> h = new Hashtable<String, Integer>(); 
       for (int i = 0; i < words.length; i += 2) {
               h.put(words[i], Integer.parseInt(words[i + 1]));
              }
   }     
  

  
    

}
