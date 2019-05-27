/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.decorator;

import logica.builder.AbsEngineer;

/**
 *
 * @author David Bohorquez
 */
public abstract class Decorator extends AbsEngineer {

    protected AbsEngineer engineer;

    public Decorator(AbsEngineer engineer) {
        this.engineer = engineer;
    }

}
