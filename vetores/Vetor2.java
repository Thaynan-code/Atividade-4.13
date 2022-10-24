package br.com.caelum.ed.vetores;

//Esse vetor foi criado para armazenar diferentes tipos de dados (objetos), diferente do vetor Aluno que só armazena 1 tipo de dado
//Vetor para objetos

import br.caelum.ed.vetores.testes.Teste2;

public class Vetor2 {

    private Object[] objetos = new Object[1000];

    private int totalDeObjetos = 0;
    private int i;

    public void adiciona(Object objeto){
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
    }

    public void adiciona (int posicao, Teste2.Aluno aluno){
        this.garantaEspaco();
        if(!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = this.totalDeObjetos - 1; 1 >= posicao; i--){
            this.objetos[i+1] = this.objetos[i];
        }
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }

    public Object pega(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.objetos[posicao];
    }

    public void remove (int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = posicao; i < this.totalDeObjetos - 1; i++){
            this.objetos[i] = this.objetos[i+1];
        }
        this.totalDeObjetos--;
    }

    public boolean contem(Teste2.Aluno aluno){
        for (int i = 0; i < this.totalDeObjetos; i++){
            if(aluno.equals(this.objetos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalDeObjetos;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <=this.totalDeObjetos;
    }

    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length){
            Object[] novaArray = new Object[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++);{
                novaArray[i] = this.objetos[i];
            }
            this.objetos = novaArray;
        }
    }
}
