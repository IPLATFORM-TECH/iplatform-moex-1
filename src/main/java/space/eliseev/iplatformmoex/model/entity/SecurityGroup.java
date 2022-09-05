package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "security_group")
public class SecurityGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 93)
    private String name;

    @Column(length = 756)
    private String title;

    @Column(name = "is_hidden")
    private Integer isHidden;

}
