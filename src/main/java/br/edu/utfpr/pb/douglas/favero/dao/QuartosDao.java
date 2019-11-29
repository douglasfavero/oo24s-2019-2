package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Quartos;
import java.io.Serializable;

public class QuartosDao extends GenericDao<Quartos, Long> {

    public QuartosDao() {
        super(Quartos.class);
    }
}
