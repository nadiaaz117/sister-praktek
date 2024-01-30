/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadia200923;

/**
 *
 * @author user
 */
public class PrintNameThread extends Thread {
    PrintNameThread(String name){
        super(name);
        start();   }
    
    public void run() {
        String name = getName();
        for (int i = 0; i< 100; i++) {
           System.out.print(name);
        }
    } 
}
