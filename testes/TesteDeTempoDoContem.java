package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteDeTempoDoContem {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();

        for (int i = 1; i < 30000; i++) {
            Teste2.Aluno aluno = new Teste2.Aluno();
            vetor.adiciona(aluno);

            if (!vetor.contem(aluno)) {
                System.out.println("Erro: aluno " + aluno + "não foi adicionado");
            }
        }
        for (int i = 1; i < 300000; i++) {
            Teste2.Aluno aluno = new Teste2.Aluno();

            if (vetor.contem(aluno)) {
                System.out.println("Erro: aluno " + aluno + "foi adicionado");
            }
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000;
        System.out.println("Tempo = " + tempo);
    }
}
