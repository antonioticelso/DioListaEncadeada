package br.com.digitalinnovation.listaEncadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No<T> {

    private T conteudo;
    private No proximoNo = null;

    public No(T conteudo){
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }

}
