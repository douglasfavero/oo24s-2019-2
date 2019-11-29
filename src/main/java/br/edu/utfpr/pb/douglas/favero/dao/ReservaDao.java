package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Reserva;
import java.io.Serializable;

public class ReservaDao extends GenericDao<Reserva, Long> {

    public ReservaDao() {
        super(Reserva.class);
    }

}
