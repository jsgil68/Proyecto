/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.controlador;

import com.mycompany.proyecto.modelo.ModeloCursos;
import com.mycompany.proyecto.vista.Cursos;
import com.mycompany.proyecto.vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class ControladorCursos implements ActionListener{
   
    private Cursos curse;
    private ModeloCursos cursemod;

    public ControladorCursos(Cursos curse, ModeloCursos cursemod) {
        this.curse = curse;
        this.cursemod = cursemod;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
   
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Cursos menus = new Cursos();
    public static void mostrar(){ 
        menus.setVisible(true);
        menus.setLocationRelativeTo(null);
    }
    public static void ocultar(){ 
        menus.setVisible(false);
        menus.setLocationRelativeTo(null);
    }
    
    
    public static void eventobtnCompleted(){
        ControladorPrincipal.mostrar();
        ControladorCursos.ocultar();
    }

}
