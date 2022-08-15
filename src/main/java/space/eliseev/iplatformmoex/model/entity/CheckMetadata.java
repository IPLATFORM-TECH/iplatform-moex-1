package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "check_metadata")
public class CheckMetadata {

    @Id
    private Long id;

    @Column(name = "timestamp")
    @Comment("Дата проверки")
    private LocalDateTime timestamp;

    @Column(name = "index")
    @Comment("Справочник")
    private String index;

    @Column(name = "is_valid")
    @Comment("Результат проверки")
    private Boolean isValid;
}
