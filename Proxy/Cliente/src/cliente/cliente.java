/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class cliente {
    proxy p;
    
    cliente(){
        p = new proxy();
        
        int opcion = 1;
        int maxOpc = 2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese 1 o "+ maxOpc +" para usar un servicio");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > maxOpc);
        switch (opcion){
            case 1:
                p.obtenerServicio1();
               break;
            case 2:   
                p.obtenerServicio2();
                break;
        }
    }
}
