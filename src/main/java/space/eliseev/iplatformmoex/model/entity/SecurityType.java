package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "security_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SecurityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "trade_engine_id")
    private Integer tradeEngineId;

    @Column(name = "trade_engine_name", length = 45)
    private String tradeEngineName;

    @Column(name = "trade_engine_title", length = 765)
    private String tradeEngineTitle;

    @Column(name = "security_type_name", length = 93)
    private String securityTypeName;

    @Column(name = "security_type_title", length = 765)
    private String securityTypeTitle;

    @Column(name = "security_group_name", length = 93)
    private String securityGroupName;
}
