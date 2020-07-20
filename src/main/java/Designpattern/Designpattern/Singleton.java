package Designpattern.Designpattern;

/**
 * Hello world!
 *
 */
class Singleton 
{ 
    

 // Double Checked Locking based Java implementation of 
 // singleton design pattern 

     private volatile static Singleton singletonObj; 
   
     private Singleton() {} 
   
     public static Singleton getInstance() 
     { 
         if ( singletonObj == null) 
         { 
             // To make thread safe 
             synchronized (Singleton.class) 
             { 
                 // check again as multiple threads 
                 // can reach above step 
                 if ( singletonObj== null) 
                	 singletonObj= new Singleton(); 
                 System.out.println("Singleton object is created for the first time ");
             } 
         } 
         return  singletonObj; 
     } 
 } 