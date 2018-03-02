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
//親HUMANクラスをDealerに継承
public class Dealer extends Human{
    //cardをDealerのテーブル(フィールド)に新しいインスタンスを生成する
    ArrayList<Integer>cards=new ArrayList<Integer>();
    //どこからでも参照可能なDealerメソッド
    public Dealer(){
        //スペード・ハート・ダイヤ・クラブの4種類と13の数字を配列cardsに追加
        // スペード・ハート・ダイヤ・クラブの4種類
        //数字の数13
        //ただし11以上は10と数える
        //その他の数は数字通りに数える
        //(==)より(<=)の方が良い
        for(int i=0;i<=4;i++){
            for(int n =1;n<=13;n++){
                 if(n>=11){
                      cards.add(10);
                 }else{
                      cards.add(n);
                    }
                }
        }
    }
    //選ぶ配列select(s)をインスタンス生成
    //hitとdealの処理を書きたい。
    public ArrayList<Integer> deal(){
            ArrayList<Integer> deal = new ArrayList<Integer>();
            //Randoｍ変数名randインスタンス化
    Random rand=new Random();
    //ランダムの数字を宣言
    for(int i=0;i<2;i++){
        //52枚の中からカードを2枚選ぶ
        int num=rand.nextInt(cards.size());
        //山札から引いてArrayListに加える
         deal.add(cards.get(num));
        }
    //hikuでArrayListが戻り値
    return deal;
    }

    public ArrayList<Integer> hit(){
          ArrayList<Integer> hit = new ArrayList<Integer>();
          Random rand=new Random();
            int num=rand.nextInt(cards.size());
            hit.add(cards.get(num));     
         return hit;
}
    
public boolean checkSum(){
    if (open()< 17) {
            return true;
        } else {
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
    //ArrayListの数値(set.get(i)をMyCardに入れる
    //pblicで宣言
    public void setCard(ArrayList<Integer>set) {
        //setされた枚数分引く
        for(int i=0;i<set.size();i++){
            myCards.add(set.get(i));
        }
    }
}