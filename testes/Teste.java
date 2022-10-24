package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class Teste {
    public static void main(String[] args){
        Teste2.Aluno a1 = new Teste2.Aluno();

        a1.setNome("Rafael");

        Vetor lista = new Vetor();

        lista.adiciona(a1);

        lista.pega(0);

        lista.pega(1);

        lista.pega(100000000);


    }
}
