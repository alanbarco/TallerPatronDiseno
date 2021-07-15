/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Estefany Farias
 */
public class FachadaCanal {
    private Canal web;
    private Canal movil;
    private Canal telefonico;

    public FachadaCanal() {
        web = new Web();
        movil = new Movil();
        telefonico = new Telefonico();
    }
    
    public void compraWeb(Producto p){
        System.out.print(p);
    }
    
     public void compraMovil(Producto p){
        System.out.print(p);
    }
      public void compraTelefonico(Producto p){
        System.out.print(p);
    }
    
    
}
