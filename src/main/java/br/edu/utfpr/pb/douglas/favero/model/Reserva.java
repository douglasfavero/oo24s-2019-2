package br.edu.utfpr.pb.douglas.favero.model;

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
    @JoinColumn(name = "cliente_id"), referencedColumnName = "id")
    private Cliente cliente;

}
