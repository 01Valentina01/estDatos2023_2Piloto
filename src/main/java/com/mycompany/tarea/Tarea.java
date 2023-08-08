/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea;

/**
 *
 * @author sg702-08
 */
public class Tarea {

    public static void main(String[] args) {
        //array
        IngTeleco[] teleco = IngTeleco.values();
        for(int i = 0; i < teleco.length; i++){
            System.out.println(teleco[i]);
        }
    }
}
