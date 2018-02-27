package by.itacademy.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author i.sukach
 */
@Entity
@Table(name = "quests")
@Getter
@Setter
public class Quest extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "hero_id", nullable = false)
    private Hero hero;
}
