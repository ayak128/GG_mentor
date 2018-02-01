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
public class Argument extends HttpServlet {

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
    // 　　　　　これは、「引数」に関する説明文です
    // ===============================================
    // メソッドの定義１（メソッドの呼び出し１とあわせて読むこと）
    // 引数１つ、戻り値のないメソッドで、メソッド名は「おはよう」です
    // 呼び出し元から渡された値を、処理に使用することができます
    // このときに渡される値のことを「引数」といいます
    // おはようメソッドでは、引数として文字列型変数を１つ宣言します
    // void おはよう(ここに渡される値を引数といいます){・・・
    // -----------------------------------------------
    void おはよう(String name) {
        System.out.println(name + "さん、おはよう！");
    }

    // -----------------------------------------------
    // メソッドの定義２（メソッドの呼び出し２とあわせて読むこと）
    // 引数２つ、戻り値のないメソッドで、メソッド名は「おきたよ」です
    // おきたよメソッドでは、引数として「文字列型１つ、整数型１つ」の順で、変数宣言を行います
    // -----------------------------------------------
    void おきたよ(String name, int time) {
        System.out.println(name + "さん、おはよう。わたしは今日、" + time + "時に起きたよ");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // -----------------------------------------------
            // メソッドの呼び出し１
            // おはようメソッドを呼び出すとき、引数「"片桐"」を渡します
            // おはようメソッドを呼び出したい場合は、引数を１つ渡さなければいけません
            // 試しに、下記の「"片桐"」の部分を消してみましょう（赤い波線が出ます）
            // NetBeans下部の「GlassFish Server」の部分で実行結果を確認したら、
            // 「"片桐"」の部分をちがう名前に変えて動きを確認してみましょう
            // -----------------------------------------------            
            おはよう("片桐");

            // -----------------------------------------------
            // メソッドの呼び出し２
            // おきたよメソッドを呼び出すとき、引数「"片桐"」と「7」を渡す
            // おきたよメソッドを呼び出したい場合は、引数を２つ渡さなければいけません
            // 試しに、下記の「"片桐,"」の部分を消してみましょう（赤い波線が出ます）
            // NetBeans下部の「GlassFish Server」の部分で実行結果を確認したら、
            // 「"片桐"」と「7」の部分をちがう文字列・整数に変えて動きを確認してみましょう
            // -----------------------------------------------
            おきたよ("片桐", 7);
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
