package br.com.lex4crypto.monolito.models.interfaces;

import br.com.lex4crypto.monolito.models.Cliente;

public interface Ordem {
    public void executar(Cliente cliente);
}
