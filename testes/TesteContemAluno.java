package br.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;

public class TesteContemAluno {
        public static void main(String[] args){

            Teste2.Aluno a1 = new Teste2.Aluno();
            Teste2.Aluno a2 = new Teste2.Aluno();

            a1.setNome("Rafael");
            a2.setNome("Paulo");

            Vetor lista = new Vetor();

            lista.adiciona(a1);
            lista.adiciona(a2);

            System.out.println(lista.contem(a1));

            System.out.println(lista.contem(a2));

            Teste2.Aluno aluno = new Teste2.Aluno();
            aluno.setNome("Ana");    //Colocar Ana

            System.out.println(lista.contem(aluno));

        }
    }

