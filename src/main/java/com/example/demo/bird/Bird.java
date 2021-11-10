package com.example.demo.bird;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Bird {
    @Id
    @SequenceGenerator(
        name = "bird_sequence",
        sequenceName = "bird_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "bird_sequence"
    )

    private Long id;
    private String name;
    private String family;
    private Integer yearIntroduced;

public Bird() {
    
    }

public Bird(Long id,
                String name,
                String family,
                Integer yearIntroduced) {
            this.id = id;
            this.name = name;
            this.family = family;
            this.yearIntroduced = yearIntroduced;
        }

public Bird(String name,
                String family,
                Integer yearIntroduced) {
            this.name = name;
            this.family = family;
            this.yearIntroduced = yearIntroduced;
        }

public Long getId() {
        return id;
    }

public void setId(Long id) {
        this.id = id;
    }

public String getName() {
        return name;
    }

public void setName(String name) {
        this.name = name;
    }
        
    public String getFamily() {
        return family;
    }

public void setFamily(String family) {
        this.family = family;
    }

public Integer getYearIntroduced() {
        return yearIntroduced;
    }

public void setYearIntroduced(Integer yearIntroduced) {
        this.yearIntroduced = yearIntroduced;
    }

@Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                "name=" + name +
                "family=" + family +
                "yearIntroduced=" + yearIntroduced +
                '}';
    }
}
