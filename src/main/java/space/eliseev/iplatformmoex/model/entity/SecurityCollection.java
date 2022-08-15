package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "security_collection")
public class SecurityCollection {

    @Id
    private Integer id;

    @Column(name = "name", length = 96)
    private String name;

    @Column(name = "title", length = 765)
    private String title;

    @ManyToOne
    @JoinColumn(name = "security_group_id")
    private SecurityGroup securityGroup;

}
