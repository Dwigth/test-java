package com.company.controllers;

import java.util.Scanner;

public class Menu {
    private Scanner sn;
    private String word;
    private boolean show = true;

    public Menu() {
        Scanner _sn = new Scanner(System.in);
        this.sn = _sn;
    }

    public void Show() {
        while (show) {
            System.out.println("********************");
            System.out.println("1. Cambiar primera y ultima letra");
            System.out.println("2. Revolver todas las letras");
            System.out.println("3. Salir");
            System.out.println("********************");
            int opt = sn.nextInt();
            this.sn.nextLine();
            this.Choose(opt);
        }
    }

    private void InputWord() {
        System.out.println("Ingrese una palabra");
        this.word = this.sn.nextLine();  // Obtener el input del usuario
    }

    private void Choose(int opt) {
        switch (opt) {
            case 1:
                this.InputWord();
                Words.SwapFirstLastLetters(word);
                break;
            case 2:
                this.InputWord();
                Words.ScrambleLetters(word);
                break;
            case 3:
                this.show = false;
                break;
            default:
                System.out.println("Seleccione una opción: ");
                break;
        }
    }
}
