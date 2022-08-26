package space.eliseev.iplatformmoex.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "marketdata")
@Getter
@Setter
public class MarketData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 189)
    private String name;

    @Column(name = "short_title", length = 192)
    private String shortTitle;

    @Column(name = "title", length = 765)
    private String title;

    @Column(name = "is_ordered")
    private Integer isOrdered;

    @Column(name = "is_system")
    private Integer isSystem;

    @Column(name = "is_hidden")
    private Integer isHidden;

    @Column(name = "trend_by")
    private Integer trendBy;

    @Column(name = "is_signed")
    private Integer isSigned;

    @Column(name = "has_percent")
    private Integer hasPercent;

    @Column(name = "type", length = 48)
    private Integer type;

    @Column(name = "precision")
    private Integer precision;

    @Column(name = "is_linked")
    private Integer isLinked;
}
