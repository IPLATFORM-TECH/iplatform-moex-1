package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "duration")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Duration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interval")
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
