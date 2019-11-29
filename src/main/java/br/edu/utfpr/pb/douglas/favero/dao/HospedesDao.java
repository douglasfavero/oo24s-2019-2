
package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Hospedes;
import java.io.Serializable;


public class HospedesDao extends GenericDao<Hospedes,Long>{
    
    public HospedesDao(){
        super(Hospedes.class);
    }
    
}
