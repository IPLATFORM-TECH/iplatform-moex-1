package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "security_group")
public class SecurityGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 93)
    private String name;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "is_hidden")
    private int isHidden;
}
