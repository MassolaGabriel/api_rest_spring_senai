
package com.springDataEx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "assentos")
@Data
public class Assento {
    @Id
    @Column(name = "codigo_assento")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
}
