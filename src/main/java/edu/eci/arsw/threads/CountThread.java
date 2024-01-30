/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.ArrayList;

/**
 *
 * @author hcadavid
 */
public class CountThread implements Runnable {
    int a = 0;
    int b = 0;
    public CountThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = a + 1; i < b; i = i + 1)
        {
            c.add(i);
        }
        System.out.println(c);
    }
}