/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geek.servlet;
import java.util.ArrayList;
/**
 *
 * @author guest1Day
 */
    //抽象クラスを宣言するときはabstract
    //抽象クラスを継承しているので4つクラスを使わないと実行できない
    abstract class   Human{
    //publicどこからでも参照可能
    //抽象メソッドも宣言するときはabstract     
    abstract public int open();
    //抽象メソッドsetCardで整数が入る配列名ar
    //voidは戻り値無し
    abstract public void setCard(ArrayList<Integer> set);
    //checkSum(TRUEとFALSEが出力)を宣言
    abstract public boolean checkSum();
    //整数が入るArrayListmycardsを新しくインスタンス生成
    public ArrayList<Integer> myCards = new ArrayList<Integer>();
    
}


