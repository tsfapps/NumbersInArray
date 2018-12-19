/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package givennumber;

/**
 *
 * @author user
 */
public class GivenNumber {

   public static void particulaNumber(int mat[]) 
	{ 
     
     int n;
     int count = 0;
     int num = 0;
     int flag = 0;
      for(int i = 0; i<mat.length; i++)
      {
          int x = mat[i];
     while(x > 0){
          n = x%10;
          if(n == 5){
          count = count + 1;
        
         }
            x = x/10;
            
      }
  
      }
        System.out.println(count);
}
    public static void main(String[] args) {
       
        int arr[] = {25, 57, 54, 55, 85, 95, 93, 29, 53, 5564, 6554, 986555543};
        particulaNumber(arr);
    }
    
}
