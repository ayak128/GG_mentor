/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aya
 */
public class Method extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // ===============================================
    // 　　　　　これは、「メソッド」に関する説明文です
    // ===============================================
    // -----------------------------------------------    
    // メソッドの定義
    // 引数と戻り値のないメソッドで、メソッド名は「おはよう」です
    // メソッドは呼び出されない限り、特になにもしません
    // -----------------------------------------------    
    void おはよう() {
        System.out.print("山田さん、おはよう");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // -----------------------------------------------        
            // メソッドの呼び出し
            // おはようメソッドは「引数なし」なので、()の中に値をなにも渡さずに呼び出します
            // -----------------------------------------------
            おはよう();

            // -----------------------------------------------
            // 実行結果を見てみよう
            // -----------------------------------------------
            // ちなみに今回はprocessRequestメソッド（サーブレットファイルを
            // 新規作成するとデフォルトで記述されている部分）より前に
            // おはようメソッドを定義しましたが、processRequestメソッドより下に
            // おはようメソッドを定義して、呼び出すことも可能です
            // 定義したおはようメソッドを切り取り、processRequestメソッドの外
            // （下記の「このへん」のあたり）に貼り付けして、動きを確認してみましょう
            // -----------------------------------------------
        }
    }

    // ↓このへん
    
    // ↑このへん
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
