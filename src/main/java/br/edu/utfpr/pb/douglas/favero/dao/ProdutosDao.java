package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Produtos;
import java.io.Serializable;

public class ProdutosDao extends GenericDao<Produtos, Long> {

    public ProdutosDao() {
        super(Produtos.class);
    }

}
