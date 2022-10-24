package br.caelum.ed.vetores.testes;

import br.caelum.ed.vetores.testes.Teste2;

import java.util.ArrayList;

public class TesteGenerico {
    public static void main(String[] args){

        ArrayList vetorSemGenerics = new ArrayList();
        ArrayList<Teste2.Aluno> vetorComGenerics = new ArrayList<Teste2.Aluno>();

        Teste2.Aluno aluno = new Teste2.Aluno();

        vetorSemGenerics.add(aluno);
        vetorComGenerics.add(aluno);

        Teste2.Aluno a1 = (Teste2.Aluno) vetorSemGenerics.get(0);
        Teste2.Aluno a2 = vetorComGenerics.get(0);
    }
}
