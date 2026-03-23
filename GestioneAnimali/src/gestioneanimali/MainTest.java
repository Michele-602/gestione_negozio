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

        Gatto g = new Gatto("Charlie Kirk", 3, "Siamese");
        Cane c = new Cane("Paolo Ruffini", 5, "Grande");
        Pesce p = new Pesce("Andrea Bocelli", 1, "Salata");
        Leone l = new Leone("Gerry Scotti", 4, true);

        Animale[] animali = {g, c, p, l};

        for (Animale a : animali) {
            System.out.println(a.descrizione());
            System.out.println("Verso: " + a.verso());

            if (a instanceof Gatto) {
                ((Gatto) a).fusa();
            } 
            else if (a instanceof Cane) {
                ((Cane) a).abbaia();
            } 
            else if (a instanceof Pesce) {
                ((Pesce) a).nuota();
            } 
            else if (a instanceof Leone) {
                ((Leone) a).corsa();
            }
        }
}
}
