/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author alfieri.fabio
 */
public class ContoBancario {

    protected String numeroConto;
    protected int bilancio = 0;

    public ContoBancario(int bilancio) {
        this.bilancio = bilancio;
    }

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public ContoBancario(int bilancio, String numeroConto) {
        this.bilancio = bilancio;
        this.numeroConto = numeroConto;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public int getBilancio() {
        return bilancio;
    }

    public int prelievo() {
        int soldi; 
        int scelta = 0;
        do {
            soldi = Integer.parseInt("Inserire i soldi da prelevare");
            if (bilancio > soldi) {
                bilancio = bilancio - soldi;
                System.out.println(bilancio);
            } else {
                System.out.println("I soldi da prelevare superano il suo conto.");
            }
            scelta = JOptionPane.showConfirmDialog(null,"Vuoi continuare a prelevare i soldi ?");
        } while (scelta == 0);
        return bilancio;
    }

    public int deposito() {
        int soldi;
        soldi = Integer.parseInt(JOptionPane.showInputDialog("Inserire i soldi da depositare"));
        bilancio = bilancio + soldi;
        return bilancio;
    }
}
