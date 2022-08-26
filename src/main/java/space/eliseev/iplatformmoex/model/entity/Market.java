package space.eliseev.iplatformmoex.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "trade_engine_id", referencedColumnName = "id"),
            @JoinColumn(name = "trade_engine_name", referencedColumnName = "name"),
            @JoinColumn(name = "trade_engine_title", referencedColumnName = "title")
    })
    private Engine engine;

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
