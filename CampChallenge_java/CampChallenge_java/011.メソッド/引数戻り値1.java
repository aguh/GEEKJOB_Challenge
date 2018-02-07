/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class 引数戻り値1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // 閾ｪ蟾ｱ邏ｹ莉九ｒ陦ｨ遉ｺ縺吶ｋ繝｡繧ｽ繝�繝�
    String[] myprofile(String ID, PrintWriter pw) {
        String[] name = {"1001<br>", "私の名前は大濱拓人です<br>", "1993年6月2日<br>", "東京都江戸川区<br>"};
        String[] n = {"1002<br>", "私の名前は羽田圭介です<br>", "1985年10月19日<br>", "埼玉県北葛飾群<br>"};
        String[] na = {"1003<br>", "私の名前は林修です<br>", "1965年9月2日<br>", "愛知県名古屋市<br>"};
        if (ID == "1001") {
            return name;
        } else if (ID == "1002") {
            return n;
        } else {
            return na;
        }

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String ID = "1001";
            for (int o = 1; o <= 3; o++) {

                String[] j = myprofile(ID, out);

                for (int k = 1; k <= 3; k++) {
                    out.print(j[k]);
                }
                
                if (ID == "1001") {
                    ID = "1002";

                } else if (ID == "1002") {
                    ID = "1003";

                }

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
