package br.com.caelum.ed.vetores;

import br.caelum.ed.vetores.testes.Teste2;

public class Vetor {             //lista com Array    //Vetor constante
    private Teste2.Aluno[] alunos = new Teste2.Aluno[100000];

    private int totalDeAlunos = 0;

    public void adiciona(Teste2.Aluno aluno) {
        //this.garantaEspaco();
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }


    //        for (int i = 0; i < this.alunos.length; i++) {
    //            if (this.alunos[i] == null) {
    //                this.alunos[i] = aluno;
    //                break;
    //            }



    public void adiciona(int posicao, Teste2.Aluno aluno) {
        //this.garantaEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        for(int i = this.totalDeAlunos - 1; i>= posicao; i--){
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;


    }

    private boolean posicaoValida(int posicao) {
        return posicao >=0 && posicao < this.totalDeAlunos;
    }

    public Teste2.Aluno pega(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");         //IllegalArgumentException = exceção
        }
        return this.alunos[posicao];
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }           //%% Construtor => e lógico
    public void remove(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = posicao; i < this.totalDeAlunos - 1; i++){
            this.alunos[1] = this.alunos[i+1];
        }
        this.totalDeAlunos--;

    }

    public boolean contem(Teste2.Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++){
            if (aluno == this.alunos[i]){                       // == Construtor -> igual
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();                    //Constrói o String
        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(",");
        }

        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");

        return builder.toString();

    }

    private void garantaEspaco(){                           //Verifica se o Array está cheio e cria um novo com o dobro de tamanho
        if(this.totalDeAlunos == this.alunos.length){
            Teste2.Aluno[] novaArray = new Teste2.Aluno[this.alunos.length*2];
            for(int i = 0; i < this.alunos.length; i++){
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }
}

