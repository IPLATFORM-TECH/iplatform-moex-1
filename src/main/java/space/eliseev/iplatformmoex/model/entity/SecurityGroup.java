package space.eliseev.iplatformmoex.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "security_group")
public class SecurityGroup {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "is_hidden")
    private Boolean is_hidden;

    @OneToMany(mappedBy = "securityGroup")
    private Collection<SecurityCollection> securityCollections;
}
