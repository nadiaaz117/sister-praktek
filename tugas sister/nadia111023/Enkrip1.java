/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadia111023;

/**
 *
 * @author user
 */
public class Enkrip1 {
    public static void main(String[] args) {
        String text = "Selamat Datang";
        String temp = "";
        int tambah = 2;
        for(int i=0;i<text.length();i++) {
            int h = (int) (text.charAt (1));
            char t = (char) (h+tambah);
            temp += t;
            //System.out.println(h);
            
        }
        System.out.println(temp);
    }
}
