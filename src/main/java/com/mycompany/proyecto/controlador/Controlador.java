/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.modelo.Modelo;
import com.mycompany.proyecto.vista.Cursos;
import com.mycompany.proyecto.vista.Menu;
import com.mycompany.proyecto.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class Controlador implements ActionListener {
   
    private Vista view;
    private Modelo model;
    
    public Controlador(){
        this.view = view;
        this.model = model;
        view.btnCreate.addActionListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNametitle(view.txtNametitle.getText());
        
    }
    
    
    
    
    
    
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Menu menus = new Menu();
    public static void mostrar(){ 
        menus.setVisible(true);
        menus.setLocationRelativeTo(null);
    }
    public static void ocultar(){ 
        menus.setVisible(false);
        menus.setLocationRelativeTo(null);
    }
    
    public static void eventobtnCreate(){
        
        ControladorMenu.ocultar();
    }
    
    public static void eventobtnCancel(){
        ControladorPrincipal.mostrar();
        ControladorMenu.ocultar();
    }
    
}
