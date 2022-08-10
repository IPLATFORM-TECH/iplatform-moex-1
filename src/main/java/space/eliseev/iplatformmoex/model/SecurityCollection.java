package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "security_collection")
public class SecurityCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 96)
    private String name;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "security_group_id")
    private int securityGroupId;
}
