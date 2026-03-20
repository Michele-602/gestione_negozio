/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneanimali;

/**
 *
 * @author filip
 */
public class Leone extends Animale {

    private boolean criniera;

    public Leone(String nome, int eta, boolean criniera) {
        super(nome, eta);
        this.criniera = criniera;
    }

    public boolean isMaschio() {
        return criniera;
    }

    @Override
    public String verso() {
        return "Roar!";
    }

    @Override
    public String descrizione() {
        return "Leone: " + getNome() + ", età: " + getEta() + ", criniera: " + (criniera ? "sì" : "no");
    }
    
    //metodo specifico
    public void corsa() {
        System.out.println(getNome() + " sta correndo nella savana!!");
    }
}
