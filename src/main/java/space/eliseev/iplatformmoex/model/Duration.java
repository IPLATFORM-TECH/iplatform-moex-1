package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "duration")
public class Duration {
    @Id
    @Column(name = "interval")
    private int interval;

    @Column(name = "duration")
    private int duration;

    @Column(name = "days")
    private Integer days;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "hint", length = 765)
    private String hint;
}
