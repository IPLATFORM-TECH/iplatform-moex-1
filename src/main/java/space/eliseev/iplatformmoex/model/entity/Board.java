package space.eliseev.iplatformmoex.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "board")
public class Board {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "board_group_id")
    private Integer boardGroupId;

    @Column(name = "engine_id")
    private Integer engineId;

    @Column(name = "market_id")
    private Integer marketId;

    @Column(name = "boardid")
    private String boardId;

    @Column(name = "board_title")
    private String boardTitle;

    @Column(name = "is_traded")
    private Integer isTraded;

    @Column(name = "has_candles")
    private Integer hasCandles;

    @Column(name = "is_primary")
    private Integer isPrimary;
}
