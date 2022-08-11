package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "engine")
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "title", length = 765)
    private String title;
}
