/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Álvaro
 */
public class servicios implements Runnable {
    
    private Thread thread;
    ServerSocket socket;
    PrintWriter salida;
    Socket communicationSocket;
    
    public servicios(){
        try{
        socket = new ServerSocket(40000);
        communicationSocket = socket.accept();
        salida = new PrintWriter(communicationSocket.getOutputStream(), true);
        thread = new Thread(this);
        thread.start();        
        } catch (Exception e){
            System.out.println("se ha presentado un error: "+e.getMessage());
        }
    }            

    @Override
    public void run() {
        String Entrada;
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
        while((Entrada = in.readLine()) != null){
            if(Entrada.equals("obtener archivo"))
                obtenerarchivo();
            else if(Entrada.equals("obtener server name"))
                obtenernombreservidor();
        }     
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    private void obtenerarchivo() {
        salida.println("aqui va un metodo para obtener un archivo en la aplicacion cilente");
    }

    private void obtenernombreservidor() {
        salida.println("aqui va un metodo para obtener el nombre del servidor");
    }
    
}
