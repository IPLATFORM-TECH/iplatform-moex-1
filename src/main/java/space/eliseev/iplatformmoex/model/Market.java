package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "trade_engine_id")
    private int tradeEngineId;

    @Column(name = "trade_engine_name", length = 45)
    private String tradeEngineName;

    @Column(name = "trade_engine_title", length = 765)
    private String tradeEngineTitle;

    @Column(name = "market_name", length = 45)
    private String marketName;

    @Column(name = "market_title", length = 765)
    private String marketTitle;

    @Column(name = "market_id")
    private int marketId;

    @Column(name = "marketplace", length = 48)
    private String marketplace;

    @Column(name = "is_otc")
    private int isOtc;
}
