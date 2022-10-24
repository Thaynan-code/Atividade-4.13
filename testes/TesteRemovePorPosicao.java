package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteRemovePorPosicao {
    public static void main(String[] args){

        Teste2.Aluno a1 = new Teste2.Aluno();
        Teste2.Aluno a2 = new Teste2.Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);             //Rafael(0)
        lista.adiciona(a2);             //Paulo(1)

        lista.remove(0);        //Rafael

        System.out.println(lista);         //Imprime Paulo
    }

}
