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
public class Argument2 extends HttpServlet {

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
    // 　　　　　これは、「引数」に関する説明文２です
    // ===============================================
    // すでに定義されたメソッドと同じメソッド名をつけることはできませんが、
    // 引数が異なる場合は、同じメソッド名でのメソッドの定義が可能です
    // 下記に「おはようメソッド」を４つ定義しました
    //「同じメソッド名だとしても、引数によって呼び出されるメソッドが変わる」という動きを確認しましょう
    // -----------------------------------------------
    // メソッドの定義１（メソッドの呼び出し１とあわせて読むこと）
    // 引数１つ、戻り値のないメソッドで、メソッド名は「おはよう」です
    // 呼び出し元から渡された値を、処理に使用することができます
    // このときに渡される値のことを「引数」といいます
    // このおはようメソッドでは、引数として文字列型変数を１つ宣言します
    // void おはよう(ここに渡される値を引数といいます){・・・
    // -----------------------------------------------
    void おはよう(String name) {
        System.out.println("これはメソッドの定義１です：");
        System.out.println(name + "さん、おはよう");
    }

    // -----------------------------------------------
    // メソッドの定義２（メソッドの呼び出し２とあわせて読むこと）
    // 引数２つ、戻り値のないメソッドで、メソッド名は「おはよう」です
    // このおはようメソッドでは、引数として「文字列型１つ、整数型１つ」の順で、変数宣言を行います
    // -----------------------------------------------
    void おはよう(String name, int time) {
        System.out.println("これはメソッドの定義２です：");
        System.out.println(name + "さん、おはよう");
        System.out.println("今日は" + time + "時に起きたよ");
    }

    // -----------------------------------------------
    // メソッドの定義３（メソッドの呼び出し３とあわせて読むこと）
    // 引数２つ、戻り値のないメソッドで、メソッド名は「おはよう」です
    // このおはようメソッドでは、引数として「整数型１つ、文字列型１つ」の順で、変数宣言を行います
    // -----------------------------------------------
    void おはよう(int time, String name) {
        System.out.println("これはメソッドの定義３です：");
        System.out.println(name + "さん、おはよう");
        System.out.print("朝ごはんは" + time + "時からだよ");
    }

    // -----------------------------------------------
    // メソッドの定義４（メソッドの呼び出し４とあわせて読むこと）
    // 引数２つ、戻り値のないメソッドで、メソッド名は「おはよう」です
    // このおはようメソッドでは、引数として文字列型変数を２つ宣言します
    // -----------------------------------------------
    void おはよう(String name, String breakfast) {
        System.out.println("これはメソッドの定義４です：");
        System.out.println(name + "さん、おはよう");
        System.out.println("朝ごはんは" + breakfast + "だよ");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // -----------------------------------------------
            // それぞれのメソッドの呼び出しを行います
            // NetBeans下部の「GlassFish Server」の部分で実行結果を確認したら、
            // 引数をちがう文字列・整数に変えたり、引数の順番を変えたりして、動きを確認してみましょう
            // -----------------------------------------------
            // メソッドの呼び出し１
            // このおはようメソッドを呼び出すとき、引数「"片桐"」を渡します
            // このおはようメソッドを呼び出したい場合は、文字列型で引数を１つ渡さなければいけません
            // -----------------------------------------------            
            おはよう("片桐");
            // メソッドの呼び出し２
            // このおはようメソッドを呼び出すとき、引数「"片桐"」と「7」を渡します
            // このおはようメソッドを呼び出したい場合は、
            // 文字列型、整数型の順で引数を２つ渡さなければいけません
            // ----------------------------------------------- 
            おはよう("片桐", 7);
            // メソッドの呼び出し３
            // このおはようメソッドを呼び出すとき、引数「8」と「"片桐"」を渡します
            // このおはようメソッドを呼び出したい場合は、
            // 整数型、文字列型の順で引数を２つ渡さなければいけません
            // ----------------------------------------------- 
            おはよう(8, "片桐");
            // メソッドの呼び出し４
            // このおはようメソッドを呼び出すとき、引数「"片桐"」と「"食パン"」を渡します
            // このおはようメソッドを呼び出したい場合は、
            // 文字列型引数を２つ渡さなければいけません
            // ----------------------------------------------- 
            おはよう("片桐", "食パン");

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
