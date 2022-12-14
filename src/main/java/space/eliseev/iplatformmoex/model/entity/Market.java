package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "trade_engine_id")
    private Integer tradeEngineId;

    @Column(name = "trade_engine_name")
    private String tradeEngineName;

    @Column(name = "trade_engine_title")
    private String tradeEngineTitle;

    @Column(name = "market_name")
    private String marketName;

    @Column(name = "market_title")
    private String marketTitle;

    @Column(name = "market_id")
    private Integer marketId;

    @Column(name = "marketplace")
    private String marketplace;

    @Column(name = "is_otc")
    private Integer isOtc;

    @Column(name = "has_history_files ")
    private Integer hasHistoryFiles  ;

    @Column(name = "has_history_trades_files")
    private Integer hasHistoryTradesFiles  ;

    @Column(name = "has_trades")
    private Integer hasTrades ;

    @Column(name = "has_history ")
    private Integer hasHistory ;
}
