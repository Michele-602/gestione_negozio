/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioneanimali;

/**
 *
 * @author michele
 */
public class Main {

    public static void main(String[] args) {

        GestioneNegozio negozio = new GestioneNegozio();
        negozio.aggiungiAnimale(new Cane("Carlos", 5, "Grande"));
        negozio.aggiungiAnimale(new Gatto("Garfield", 2, "Siamese"));
        negozio.aggiungiAnimale(new Leone("Simba", 4, true));
        negozio.aggiungiAnimale(new Pesce("Bob", 1, "Salata"));
        negozio.aggiungiAnimale(new Cane("Charlie", 3, "Media"));
        negozio.aggiungiAnimale(new Cane("Joe bastianich", 3, "Grande"));
        System.out.println("lista animali");
        
        negozio.stampaAnimali();

        System.out.println("Tot animali: " + negozio.contaAnimali());

        // ricerca
        System.out.println("cerca animale");
        Animale trovato = negozio.cercaPerNome("Carlos");

        if (trovato != null) {
            System.out.println("trovato: " + trovato);
            System.out.println("verso: " + trovato.verso());
        } else {
            System.out.println("Animale non trovato.");
        }

        for (Animale a : new Animale[]{
                new Cane("Hamsik", 2, "Piccola"),
                new Gatto("Luna", 1, "Persiano"),
                new Leone("Pencho", 6, true),
                new Pesce("Dory", 2, "Dolce")
        }) {
            System.out.println(a.descrizione());
            System.out.println("verso: " + a.verso());
        }

        System.out.println("==================");
        if (trovato instanceof Cane) {
            ((Cane) trovato).abbaia();
        }

        System.out.println("=== tolgo Bob ===");
        negozio.rimuoviAnimale("Bob");

        System.out.println("==========");
        negozio.stampaAnimali();
    }
}
