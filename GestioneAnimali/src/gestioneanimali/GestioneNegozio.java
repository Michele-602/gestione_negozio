/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneanimali;

/**
 *
 * @author michele
 */
import java.util.ArrayList;

public class GestioneNegozio {

    private ArrayList<Animale> animali;

    public GestioneNegozio() {
        animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void rimuoviAnimale(String nome) {

        Animale daRimuovere = null;

        for (Animale a : animali) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                daRimuovere = a;
                break;
            }
        }

        if (daRimuovere != null) {
            animali.remove(daRimuovere);
            System.out.println(nome + " rimosso dal negozio.");
        } else {
            System.out.println(nome + " non trovato.");
        }
    }

    public Animale cercaPerNome(String nome) {
        for (Animale a : animali) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public void stampaAnimali() {
        if (animali.isEmpty()) {
            System.out.println("non c'è nessun animale nel negozio.");
            return;
        }

        for (Animale a : animali) {
            System.out.println(a);
        }
    }

    public int contaAnimali() {
        return animali.size();
    }
}
