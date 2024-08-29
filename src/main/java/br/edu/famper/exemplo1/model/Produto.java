package br.edu.famper.exemplo1.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.boot.registry.selector.StrategyRegistration;

@Entity
@Table(name = "tbl_produto")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "produto_id")
    private Long id;

    @Column(name = "name", length = 75)
    private String nome;

    @Column(name= "descreicao", length = 150)
    private String descricao;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "quantidade")
    private int quantidade;
}
