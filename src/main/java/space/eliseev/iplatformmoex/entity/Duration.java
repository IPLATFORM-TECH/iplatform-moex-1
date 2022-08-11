package space.eliseev.iplatformmoex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Duration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer interval;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "days")
    private Integer days;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "hint", length = 765)
    private String hint;
}
