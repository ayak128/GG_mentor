
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aya
 */
public class Time {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        Date d1 = sdf.parse("2015-01-01 00:00:00");
        Date d2 = sdf.parse("2015-12-31 23:59:59");
        
        long total = (d2.getTime() - d1.getTime());
       
        System.out.println("2015-01-01 00:00:00のタイムスタンプ：" + d1.getTime());
        System.out.println("2015-12-31 23:59:59のタイムスタンプ：" + d2.getTime());
        
        // 1秒が60個で60秒　60秒（1分）が60個で60分（1時間）
        // 60分（1時間）が24個で24時間（1日）
        // ふたつの日付のタイムスタンプ（ミリ秒）を取得し、それを「1日」で割っている
        System.out.println((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        
    }
}
