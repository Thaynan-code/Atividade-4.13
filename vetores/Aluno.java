package br.com.caelum.ed.vetores;

//O sistema irá criar objetos

public class Aluno {
    public String nome;

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
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.nome);
    }
}
