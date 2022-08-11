package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "security_type")
public class SecurityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "trade_engine_id")
    private int tradeEngineId;

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
