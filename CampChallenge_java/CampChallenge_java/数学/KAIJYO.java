/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class KAIJYO {
   public static void main(String[] args) { 
    double result1 = 0;  double result2 = 1;
    result1 = 15d*14*13*12*11*10* 9
              * 8* 7* 6* 5* 4* 3* 2* 1;
    System.out.println("result1 = " + result1);
    for(int i = 15; i>=1 ; --i){result2 *= i; };
    System.out.println("result2 = " + result2);
  }// end of main
}// end of class 
//1.307674368×10^12
