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
public class Universite {
    @Id
    @GeneratedValue
    private long idUniversite;

    private String nomUniversite;
    private String adresseUniversite;
}
