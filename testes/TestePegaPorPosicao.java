package br.caelum.ed.vetores.testes;
import br.com.caelum.ed.vetores.Vetor;

public class TestePegaPorPosicao {

    public static void main(String[] args){
        Teste2.Aluno a1 = new Teste2.Aluno();
        Teste2.Aluno a2 = new Teste2.Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);    //Rafael
        lista.adiciona(a2);     //Paulo

        Teste2.Aluno aluno1 = lista.pega(0);      //1º Lugar: Rafael
        Teste2.Aluno aluno2 = lista.pega(1);       //2º Lugar: Paulo

        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
