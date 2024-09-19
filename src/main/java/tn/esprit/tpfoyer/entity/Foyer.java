package tn.esprit.tpfoyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Foyer {
    @Id
    @GeneratedValue
    private long id;

    private String nomFoyer;
    private long capaciteFoyer;
}
