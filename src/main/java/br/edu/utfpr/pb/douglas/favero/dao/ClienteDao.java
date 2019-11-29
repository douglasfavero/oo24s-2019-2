package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Cliente;
import java.io.Serializable;

public class ClienteDao extends GenericDao<Cliente, Long> {

    public ClienteDao() {
        super(Cliente.class);
    }

}
