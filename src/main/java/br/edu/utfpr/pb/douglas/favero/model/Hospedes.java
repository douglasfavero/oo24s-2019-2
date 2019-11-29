package br.edu.utfpr.pb.douglas.favero.model;

import javax.persistence.Entity;

@Entity
@Table(name = "hospedes")
public class Hospedes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

   
    @OneToMany()
    @JoinColumn(name = "cliente_id"), referencedColumnName = "id")
    private Cliente cliente;

}
