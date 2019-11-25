
package br.edu.utfpr.pb.douglas.favero.model;

import java.util.Objects;
import javax.persistence.Entity;

@Entity
@Table(name = "quartos")
public class Quartos {
    
    @Id
    @GeneratedValuestrategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "numero",  nullable = false)
    private Integer numero;
            
    @Enumerated(EnumType.STRING)
    private ETipoQuarto quarto;
        
    @Column(name = "qtd_cama", nullable false)
    private Integer qtd_cama;
    
    @Column(name = "qtd_pessoas", nullable false)
    private Integer qtd_pessoas;
    
    @Column(name = "diaria",length = 20, nullable false)
    private String diaria;

    @OneToMany()
    @JoinColumn(name = "reserva_id"), referencedColumnName="id")
    private Reserva reserva;
    
    public Quartos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ETipoQuarto getQuarto() {
        return quarto;
    }

    public void setQuarto(ETipoQuarto quarto) {
        this.quarto = quarto;
    }

    public Integer getQtd_cama() {
        return qtd_cama;
    }

    public void setQtd_cama(Integer qtd_cama) {
        this.qtd_cama = qtd_cama;
    }

    public Integer getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(Integer qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public String getDiaria() {
        return diaria;
    }

    public void setDiaria(String diaria) {
        this.diaria = diaria;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Quartos other = (Quartos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
