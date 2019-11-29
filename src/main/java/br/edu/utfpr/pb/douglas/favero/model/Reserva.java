package br.edu.utfpr.pb.douglas.favero.model;

import java.util.Objects;
import javax.persistence.Entity;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nro_quarto", nullable = false)
    private Integer numero;

    @OneToMany()
    @JoinColumn(name = "cliente_id")
     , referencedColumnName = "id"
    )
    private Cliente cliente;

    @OneToMany()
    @JoinColumn(name = "hospedes_id")
     , referencedColumnName = "id"
    )
    private Hospedes hospedes;

    @Column(name = "data_reserva", nullable = false)
    private LocalDate dataReserva;

    @Column(name = "data_entrada", nullable = false)
    private LocalDate dataEntrada;

    @Column(name = "data_saida", nullable = false)
    private LocalDate dataSaida;

    @Column(name = "motivo_Hospedagem", length = 50, nullable = false)
    private String motivoHospedagem;

    @Column(nullable = false)
    private Double valor;

    @OneToMany(mappedBy = "produtos",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY)
    private List<Produtos> produtos;

    public Reserva() {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hospedes getHospedes() {
        return hospedes;
    }

    public void setHospedes(Hospedes hospedes) {
        this.hospedes = hospedes;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getMotivoHospedagem() {
        return motivoHospedagem;
    }

    public void setMotivoHospedagem(String motivoHospedagem) {
        this.motivoHospedagem = motivoHospedagem;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public <any> getProdutos() {
        return produtos;
    }

    public void setProdutos(<any>  produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
