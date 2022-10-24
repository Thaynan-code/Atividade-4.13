package br.caelum.ed.vetores.testes;


import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionanoFim {

    public static void main(String[] args){
        Teste2.Aluno a1 = new Teste2.Aluno();
        Teste2.Aluno a2 = new Teste2.Aluno();

        a1.setNome("Rafael");             //define o nome
        a2.setNome("Paulo");              //define o nome

        Vetor lista = new Vetor();        //array

        lista.adiciona(a1);              //lista implementada
        lista.adiciona(a2);              //lista implementada

        System.out.println(lista);
    }
}
