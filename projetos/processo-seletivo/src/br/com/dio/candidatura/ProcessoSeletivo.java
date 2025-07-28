package br.com.dio.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"Caio","Jamilly","Rebeca","Marcos"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado");
            
    }while(!atendeu && tentativasRealizadas < 3);
    if (atendeu)
        System.out.println("Conseguimos contatos com "+candidato+" na "+tentativasRealizadas+" tentativa");
    else
        System.out.println("Não conseguimos contatos com "+candidato+" após 3 tentativas");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Caio","Jamilly","Rebeca","Marcos"};
        System.out.println("Candidatos Selecionados com indices");
        for(int i=0;i <candidatos.length;i++){
            System.out.println("Candidato "+(i+1)+" - " +candidatos[i]);
        }
        
        System.out.println("Candidatos Selecionados de forma abreviada");
        for(String candidato: candidatos){
            System.out.println("Candidato Selecionado: " + candidato);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"Caio","Jamilly","Rebeca","Marcos","Beatriz","Lucas","Veronica","Carol"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 4 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O Candidato " + candidato + " solicitou esse valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}
