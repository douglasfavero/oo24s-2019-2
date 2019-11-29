package br.edu.utfpr.pb.douglas.favero.model;

import java.io.Serializable;

public interface AbstractModel<ID extends Serializable>
        extends Serializable {

    ID getId();
}
