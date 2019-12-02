package br.edu.utfpr.pb.douglas.favero.dao;

import br.edu.utfpr.pb.douglas.favero.model.Usuario;
import java.util.List;
import javax.persistence.Query;


public class UsuarioDao extends GenericDao<Usuario, Long> {

    public UsuarioDao() {
        super(Usuario.class);
    }

   public List<Usuario> findByPermissaoNome(String nome) {
        Query q = em.createQuery("Select u from Usuario u "
                + "join fetch u.permissoes p where p.nome = :nome");
        q.setParameter("nome", nome);
        return q.getResultList();
    }

    public Usuario findByPermissaoNome(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
