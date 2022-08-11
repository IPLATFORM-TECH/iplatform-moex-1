package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "board_group")
public class BoardGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "trade_engine_id")
    private int tradeEngineId;

    @Column(name = "trade_engine_name", length = 45)
    private String trageEngineName;

    @Column(name = "trade_engine_title", length = 765)
    private String tradeEngineTitle;

    @Column(name = "market_id")
    private int marketId;

    @Column(name = "market_name", length = 45)
    private String marketName;

    @Column(name = "name", length = 192)
    private String name;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "is_default")
    private int isDefault;

    @Column(name = "board_group_id")
    private int boardGroupId;

    @Column(name = "is_traded")
    private int isTraded;

    @Column(name = "is_order_driven")
    private Integer isOrderDriven;

    @Column(name = "category", length = 45)
    private String category;
}
