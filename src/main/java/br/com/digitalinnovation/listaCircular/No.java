package br.com.digitalinnovation.listaCircular;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No<T> {

    private T conteudo;
    private No<T> noProximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
