/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.vista.Menu;
import com.mycompany.proyecto.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class ControladorMenu implements ActionListener{
    private Menu menu;

    public ControladorMenu(Menu menu) {
        this.menu = menu;
        menu.btnCreated.addActionListener(this); 
    }
    
    public void iniciar(){
        menu.setTitle("MVC Crear");
        menu.setLocationRelativeTo(null);
        
    }
    
    public static void eventobtnCreated(){
        ControladorPrincipal.ocultar();
        ControladorMenu.mostrar(); 
    }
    
    public static void eventobtnSee(){
        ControladorPrincipal.ocultar();
        ControladorCursos.mostrar();
    }
    
    public static void eventobtnExit(){
        ControladorPrincipal.ocultar();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    public static Vista menus = new Vista();
    public static void mostrar(){ 
        menus.setVisible(true);
        menus.setLocationRelativeTo(null);
    }
    public static void ocultar(){ 
        menus.setVisible(false);
        menus.setLocationRelativeTo(null);
    }
    
}
