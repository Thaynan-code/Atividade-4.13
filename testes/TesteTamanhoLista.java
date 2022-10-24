package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteTamanhoLista {
    public static void main(String[] args){
        Teste2.Aluno a1 = new Teste2.Aluno();
        Teste2.Aluno a2 = new Teste2.Aluno();
        Teste2.Aluno a3 = new Teste2.Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.tamanho());
        lista.adiciona(a3);

        System.out.println(lista.tamanho());
    }
}
