package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteLienarVSConstante {
        public static void main(String[] args){
            Vetor vetor = new Vetor();
            long inicio = System.currentTimeMillis();
            for (int i = 1; i<100000;i++){
                Teste2.Aluno aluno = new Teste2.Aluno();
                vetor.adiciona(aluno);
            }

            long fim = System.currentTimeMillis();
            double tempo = (fim - inicio) / 1000.0;
            System.out.println("Tempo em segundos = " + tempo);
        }
    }

