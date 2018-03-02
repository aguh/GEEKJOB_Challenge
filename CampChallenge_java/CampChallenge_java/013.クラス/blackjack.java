/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geek.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class blackjack extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //DelarとUSERをインスタンス化
            //Delar(対象クラス名)dealer(任意の変数名)=new Dealer()(対象クラス名)
            Dealer dealer=new Dealer();
            USER user=new USER();
            //シミュレーションでUSERとDealerに2枚渡したもの
            //myCardsに2枚ずつセット
            //dealerのsetCardを用いてdealer.deal(2枚のカード情報)
            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());
            //中身を表示させる
            out.println("ディーラーの手札"+dealer.myCards+"<br>");
            out.println("ユーザーの手札"+user.myCards+"<br>");
            //myCardsの中身を計算
            //dealer(クラス名)のopen(メソッド)を呼び出す
            out.println("ディーラーの合計"+dealer.open()+"<br>");
            out.println("ユーザーの合計"+user.open()+"<br>");        
        //もう一枚引くかどうか
        //dealer.checkSUM()でカードの合計値が21以下かどうか判断しTRUEかFalseが返ってくる
        //TRUEだったらhitメソッドを使ってカードの数字をsetCardの引数としていれるそしてDealerはカードをsetして追加
        while(!(dealer.checkSum()==false&&user.checkSum()==false)){
            if(dealer.checkSum()){
               dealer.setCard(dealer.hit());
               out.println("ディーラーはカードをセットしました<br>");
           }else{
               out.println("ディーラーはカードをセットしませんでした<br>");
           }        
        //上の説明とほぼ同様
           if(user.checkSum()){
               user.setCard(dealer.hit());
               out.println("ユーザーはカードをセットしました<br>");
           }else{
               out.println("ユーザーはカードをセットしませんでした<br>");
           }
           //もう一枚引いたあとの合計
           out.println("もう一枚引いたあとのディーラーの合計"+dealer.open()+"<br>");
           out.println("もう一枚引いたあとのユーザーの合計"+user.open()+"<br>");                             
        }            //勝敗の判定
           //dealerとuserどちらのopenメソッド(カードの合計)が同じ場合。どちらもカードの合計が22以上だった場合。
           //(||)はあるいは。(＆＆)且。
           if(dealer.open()==user.open()||(dealer.open()>= 22 &&user.open()>= 22 )){
               out.print("引き分け<br>");
               //dealerが22以上でdealerの負け
           }else if(dealer.open()>= 22){
               out.print("ユーザーの勝ち<br>");
               //userが22以上でuserの負け
           }else if(user.open()>=22){
               out.print("ディーラーの勝ち<br>");
               //userのカードの合計が21以外でdealerのカードが21の場合
           }else if(dealer.open()==21){
               out.print("ディーラーの勝ち<br>");
               //dealerのカードが21以外でuserのカードの合計が21の場合
           }else if(user.open()==21){
               out.print("ユーザーの勝ち<br>");
           //userのカードの合計値がdealerのカードの合計値より大きい場合    
           }else if(user.open()>dealer.open()){
               out.print("ユーザーの勝ち<br>");
           }else if(user.open()<dealer.open()){
               out.print("ディーラーの勝ち<br>");        
           }
           
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
