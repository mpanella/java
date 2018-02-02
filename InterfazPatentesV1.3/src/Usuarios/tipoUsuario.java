/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import Ventanas.Principal;
/**
 *
 * @author facuf
 */
public class tipoUsuario {
    
    public static int valorUsuario;
    public static String dominioActual;

    public static String getDominioActual() {
        return dominioActual;
    }

    public static void setDominioActual(String dominioActual) {
        tipoUsuario.dominioActual = dominioActual;
    }
    
    public int getValorUsuario(){
        return valorUsuario;
    }
    
    public void setValorUsuario (int valorUsuario){
        this.valorUsuario = valorUsuario;
    }
    
    
}