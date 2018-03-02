/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geek.servlet;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author guest1Day
 */
//USER(DelarがdealしてそこからBlackJackからカードをもらうのでUSERはdealしない)
//mycardsの数に応じてArrayLIstにsumに代入する
//sum合計値をカードを引いた分だけ加算
public class USER extends Human{

public boolean checkSum(){
    if (open()< 17) {
            return true;
        }else{
            return false;
        }
    
}
public int open() {
        int sum=0;
        //mycardsの数に応じてアクセスする
        for(int i=0;i<myCards.size();i++){
        //sum合計値をカードを引いた分だけ加算    
        sum +=myCards.get(i);
    }
return sum;
}
public void setCard(ArrayList<Integer> set){
        for (int i=0;i<set.size();i++){
            myCards.add(set.get(i));
                  }
           }

}