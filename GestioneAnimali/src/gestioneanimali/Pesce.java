/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneanimali;

/**
 *
 * @author filip
 */
public class Pesce extends Animale {

    private String acqua;

    public Pesce(String nome, int eta, String acqua) {
        super(nome, eta);
        this.acqua = acqua;
    }

    public String getAcqua() {
        return acqua;
    }

    @Override
    public String verso() {
        return "Blub!";
    }

    @Override
    public String descrizione() {
        return "Pesce: " + getNome() + ", età: " + getEta() + ", acqua: " + acqua;
    }

    //metodo specifico
    public void nuota() {
        System.out.println(getNome() + " sta nuotando!!!");
    }
}