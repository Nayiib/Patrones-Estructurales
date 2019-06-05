/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Álvaro
 */
public class proxy implements Runnable {

    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter salida;
    int character;
    int restriccion = 0;

    public proxy() {
        try {
            socket = new Socket(InetAddress.getLocalHost().getHostName(), 40000);
            System.out.println("Conectando al servidor...");
            in = socket.getInputStream();
            salida = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException ioe) {
            System.err.println("Error de conexion: " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        if (socket != null && socket.isConnected()) {
            System.out.println("Conectado");
        }
    }

    @Override
    public void run() {
        try {
            while ((character = in.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void obtenerServicio1() {

        salida.println("obtener archivo");

    }

    public void obtenerServicio2() {
        restriccion = 1;
        if (restriccion == 0) {
            salida.println("obtener server name");
        } else {
            System.out.println("Acceso restringido a este servicio");
        }
    }

}
