/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioneanimali;

/**
 *
 * @author filip
 */
public class MainTest {

    public static void main(String[] args) {

        Animale gatto = new Gatto("Charlie Kirk", 3, "Siamese");
        Animale cane = new Cane("Paolo Ruffini", 5, "Grande");
        Animale pesce = new Pesce("Andrea Bocelli", 1, "Salata");
        Animale leone = new Leone("Gerry Scotti", 4, true);

        Animale[] animali = {gatto, cane, pesce, leone};

        //polimorfismo
        for (Animale a : animali) {
            System.out.println(a.descrizione());
            System.out.println("Verso: " + a.verso());
        }

        //casting 
        ((Gatto) gatto).fusa();
        ((Cane) cane).abbaia();
        ((Pesce) pesce).nuota();
        ((Leone) leone).corsa();
    }
}
