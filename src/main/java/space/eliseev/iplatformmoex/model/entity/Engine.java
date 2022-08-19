package space.eliseev.iplatformmoex.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "engine")
public class Engine {

    @Id
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "title", length = 765)
    private String title;
}
