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
public class EsercizioContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoEsteso a = new ContoEsteso(20, 30, "365");
        System.out.println(a.getBilancio());
        System.out.println(a.getNumeroConto());
        System.out.println(a.getFido());
        a.deposito();
        System.out.println(a.getBilancio());
        a.prelievo();
        System.out.println(a.getBilancio());
        ContoEsteso b = new ContoEsteso(48, "555");
        System.out.println(a.getBilancio());
        System.out.println(a.getNumeroConto());
        System.out.println(a.getFido());
        a.deposito();
        System.out.println(a.getBilancio());
        a.prelievo();
        ContoEsteso c = new ContoEsteso("666");
        System.out.println(a.getBilancio());
        System.out.println(a.getNumeroConto());
        System.out.println(a.getFido());
        a.deposito();
        System.out.println(a.getBilancio());
        a.prelievo();
        
    }
}
