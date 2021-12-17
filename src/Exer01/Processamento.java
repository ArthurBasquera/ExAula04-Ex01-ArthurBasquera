/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer01;

/**
 *
 * @author ArthurBasquera
 */
public class Processamento {
    private Processador cpu;
    private PlacaDeVideo gpu;
    private RAM ram;
    private HD hd;

    public void ligarPC(int nucleos, String modelo, int quantidade, int armazenamento) {
        cpu = new Processador(nucleos);
        gpu = new PlacaDeVideo(modelo);
        ram = new RAM(quantidade);
        hd = new HD(armazenamento);
    }
    
    public void imprimeDados(){
        System.out.println("Nucleos do processador: "+cpu.getNucleos());
        System.out.println("Placa de Video: "+gpu.getModelo());
        System.out.println("RAM: "+ram.getQuantidade()+"GB");
        System.out.println("Armazenamento: "+hd.getArmazenamento()+"TB");
    }
    
    
}
