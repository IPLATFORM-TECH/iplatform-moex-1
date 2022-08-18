package space.eliseev.iplatformmoex.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "Board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @OneToMany
//    @JoinColumn(name = "board_group_id")
    @Column(name = "board_group_id")
    private Collection<BoardGroup> boardGroup;

//    @OneToMany
//    @JoinColumn(name = "engine_id")
    @Column(name = "engine_id")
    private Collection<Engine> engine;

//    @OneToMany
//    @JoinColumn(name = "market_id")
    @Column(name = "market_id")
    private Collection<Market> market;

    @Column(name = "boardid")
    private String boardId;

    @Column(name = "board_title")
    private String boardTitle;

    @Column(name = "is_traded")
    private int isTraded;

    @Column(name = "has_candles")
    private int hasCandles;

    @Column(name = "is_primary")
    private int isPrimary;
}
