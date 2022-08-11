package space.eliseev.iplatformmoex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class SecurityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
