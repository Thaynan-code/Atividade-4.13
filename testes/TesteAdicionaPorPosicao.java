package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionaPorPosicao {

    public static void main(String[] args) {
        Teste2.Aluno a1 = new Teste2.Aluno();
        Teste2.Aluno a2 = new Teste2.Aluno();
        Teste2.Aluno a3 = new Teste2.Aluno();

        a1.setNome("Rafael");        //a1:Rafael
        a2.setNome("Paulo");         //a2:Paulo
        a3.setNome("Ana");           //a3:Ana

        Vetor lista = new Vetor();

        lista.adiciona(a1);              //Paulo
        lista.adiciona(0, a2);     //Ana
        lista.adiciona(1, a3);      //Rafael

        System.out.println(lista);
    }
}