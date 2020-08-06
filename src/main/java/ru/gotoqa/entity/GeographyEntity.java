package ru.gotoqa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Entity class for mapping to Geography table
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Geography")
public class GeographyEntity {

    @EmbeddedId
    private PK pk;

    @Basic
    private Integer population;

    @Basic
    private String language;

    @Embeddable
    @Data
    public static class PK implements Serializable {

        @Basic
        @Column(name = "country", insertable = false, updatable = false)
        private String country;

        @Basic
        @Column(name = "city", insertable = false, updatable = false)
        private String city;
    }

}
