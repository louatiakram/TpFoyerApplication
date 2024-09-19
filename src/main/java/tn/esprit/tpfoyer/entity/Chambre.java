package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Chambre {
    @Id
    @GeneratedValue
    private Long id;

    private String numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typec;
}
