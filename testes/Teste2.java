package br.caelum.ed.vetores.testes;

import java.util.ArrayList;

public class Teste2 {
    public static void main(String[] args) {
        ArrayList vetor = new ArrayList();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        vetor.add(aluno1);
        vetor.add(aluno2);
        vetor.add(aluno3);

        int tamanho = vetor.size();

        if (tamanho != 3) {                                                                   // se o tamanho for diferente de 3
            System.out.println("Erro: 0 tamanho da lista está errado.");
        }

        if (!vetor.contains(aluno1)) {                                                        //se o vetor não tiver aluno 1
            System.out.println("Erro: Não achou um aluno que deveria estar na lista");
        }

        vetor.remove(0);
        tamanho = vetor.size();

        if (tamanho != 2) {                                                                   //se o tamanho for diferente de 2
            System.out.println("Erro: O tamanho da lista está errado");
        }

        if (vetor.contains(aluno3)) {
            System.out.println("Erro: Achou um aluno que não deveria estar na lista");
        }
    }


    public static class Aluno {
            private String nome;

            public String getNome(){
                return nome;
            }

            public void setNome(String nome){           //definir/colocar o nome
                this.nome = nome;
            }

            public String toString(){                   //imprime o nome
                return this.nome;
            }

            public boolean equals(Object o){            //compara o nome
                br.com.caelum.ed.vetores.Aluno outro = (br.com.caelum.ed.vetores.Aluno) o;
                return this.nome.equals(outro.nome);
            }
        }

    }
