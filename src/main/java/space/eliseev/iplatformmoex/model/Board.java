package space.eliseev.iplatformmoex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "board_group_id")
    private int boardGroupId;

    @Column(name = "engine_id")
    private int engineId;

    @Column(name = "market_id")
    private int marketId;

    @Column(name = "boardid", length = 12)
    private String boardId;

    @Column(name = "board_title", length = 381)
    private String boardTitle;

    @Column(name = "is_traded")
    private int isTraded;

    @Column(name = "has_candles")
    private int hasCandles;

    @Column(name = "is_primary")
    private int isPrimary;
}
