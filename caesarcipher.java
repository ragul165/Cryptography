
/**
 * Write a description of caesarcipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class caesarcipher {
   public String encrypt(String input,int key){
    
    StringBuilder encrypted=new StringBuilder(input);
    String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphal="abcdefghijklmnopqrstuvwxyz";
    String shiftalpha=alpha.substring(key)+alpha.substring(0,key);
    String shiftalphal=alphal.substring(key)+alphal.substring(0,key);
    for(int i=0;i<encrypted.length();i++){
     
      char currChar=encrypted.charAt(i);
      if(Character.isLowerCase(currChar)==false){
      int idx=alpha.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalpha.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
     
    
    }
    else{
    
       int idx=alphal.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalphal.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
    
    
    }
   }
    return encrypted.toString();
   }
   public String encryptTwoKeys(String input,int key1,int key2){
    
    StringBuilder encrypted=new StringBuilder(input);
    String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphal="abcdefghijklmnopqrstuvwxyz";
    String shiftalpha=alpha.substring(key1)+alpha.substring(0,key1);
    String shiftalphal=alphal.substring(key1)+alphal.substring(0,key1);
    String shiftalpha2=alpha.substring(key2)+alpha.substring(0,key2);
    String shiftalphal2=alphal.substring(key2)+alphal.substring(0,key2);
    for(int i=0;i<encrypted.length();i++){
     if(i%2==0){
      char currChar=encrypted.charAt(i);
      if(Character.isLowerCase(currChar)==false){
      int idx=alpha.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalpha.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
     
    
    }
    else{
    
       int idx=alphal.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalphal.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
    
    
    }
   }
   else{
      char currChar=encrypted.charAt(i);
      if(Character.isLowerCase(currChar)==false){
      int idx=alpha.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalpha2.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
     
    
    }
    else{
    
       int idx=alphal.indexOf(currChar);
      if(idx!=-1){
        
        char newChar=shiftalphal2.charAt(idx);
        encrypted.setCharAt(i,newChar);
        
        
        }
    
    
    
    }
    
    
    
    
    
    
    }
  }
    return encrypted.toString();
   }
 
 public void testcaesar(){
    
    int key=17;int key2=23;
    //FileResource fr=new FileResource();
    String message="First Legion";
    String encrypted=encrypt(message,key);
    System.out.println("key is "+ key +"\n" + encrypted);
    String encrypt=encryptTwoKeys(message,key2,key);
    System.out.println("key is "+ key + "\t"+key2+"\n" + encrypt);
    }
    
    
    
    }

