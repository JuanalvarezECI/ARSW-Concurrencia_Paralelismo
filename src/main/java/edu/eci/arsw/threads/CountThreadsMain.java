/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    public static void main(String a[]){
        System.out.println("se crea hilo 1, 0 a 99");
        Thread hilo1 = new Thread(new CountThread(0,99));
        hilo1.start();

        System.out.println("se crea hilo 2 , 99 a 199");
        Thread hilo2 = new Thread(new CountThread(99,199));
        hilo2.start();

        System.out.println("se crea hilo 3, 200 a 299");
        Thread hilo3 = new Thread(new CountThread(200,299));
        hilo3.start();
    }
}
