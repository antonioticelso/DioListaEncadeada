package br.com.digitalinnovation.listaCircular;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoCircular<T> {

    private T conteudo;
    private NoCircular<T> noProximo;

    public NoCircular(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
