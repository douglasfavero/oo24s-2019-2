package br.edu.utfpr.pb.douglas.favero.model;

import javax.persistence.Entity;

@Entity
@Column(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double valor;

    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;

    @Column(name = "categoria", length = 50, nullable = false)
    private String categoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = true)
    private Reserva reserva;
    
    

}
