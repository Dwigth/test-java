package com.company.classes;

public class Empleado extends Persona{
    public Empleado(Persona _persona){
        super(_persona.getNombre());
    }
    public void Saludar(){
        System.out.println("Hola Mundo");
    }
}
