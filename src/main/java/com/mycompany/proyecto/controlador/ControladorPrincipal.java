/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.vista.Menu;

/**
 *
 * @author USUARIO
 */
public class ControladorPrincipal {
    public static Menu menu = new Menu();
    public static void mostrar(){ 
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
    public static void ocultar(){ 
        menu.setVisible(false);
        menu.setLocationRelativeTo(null);
    }
    
}
