/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Servicios.Servicio1;
import Servicios.Servicio2;
import Servicios.Servicio3;
import Servicios.Servicio4;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Álvaro
 */
@ManagedBean
@ApplicationScoped
public class FacadeImplementation {

    private Servicio1 s1 = new Servicio1();
    private Servicio2 s2 = new Servicio2();
    private Servicio3 s3 = new Servicio3();
    private Servicio4 s4 = new Servicio4();

    private String servicio;

    public String getServicio() {
        return servicio;
    }

    public FacadeImplementation() {
    }

    public String usarServicio1() {
        this.servicio = s1.getServicio1();
        return this.servicio;
    }

    public String usarServicio2() {
        this.servicio = s2.getServicio2();
        return this.servicio;
    }

    public String usarServicio3() {
        this.servicio = s3.getServicio3();
        return this.servicio;
    }

    public String usarServicio4() {
        this.servicio = s4.getServicio4();
        return this.servicio;
    }

}
