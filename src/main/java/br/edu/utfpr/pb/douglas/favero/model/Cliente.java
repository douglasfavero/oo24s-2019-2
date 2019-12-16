package br.edu.utfpr.pb.douglas.favero.model;

import java.util.Objects;
import javax.persistence.Entity;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

   @Enumerated(EnumType.STRING)
    private EEstados eEstados;

    @Column(name = "cidade", length = 70, nullable = false)
    private String cidade;

    @Column(name = "rua", length = 70, nullable = false)
    private String rua;

    @Column(name = "numero",lenght = 10, nullable = false)
    private String numero;

    @Column(name = "bairro", length = 80, nullable = false)
    private String bairro;

    @Column(name = "telefone", length = 70, nullable = false)
    private String telefone;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "rg", length = 10, nullable = false)
    private String rg;
    
    @Column(name = "passaporte", length = 20)
    private String passaporte;

    public Cliente() {
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EEstados geteEstados() {
        return eEstados;
    }

    public void seteEstados(EEstados eEstados) {
        this.eEstados = eEstados;
    }

   
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
