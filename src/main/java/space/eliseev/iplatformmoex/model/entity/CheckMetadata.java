package space.eliseev.iplatformmoex.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
<<<<<<< HEAD
=======
import org.hibernate.annotations.Comment;
>>>>>>> 4488fa0827d4b0851550fd1d81de4c1a27404216

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "check_metadata")
public class CheckMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "index")
    private String index;

    @Column(name = "is_valid")
    private Boolean isValid;
<<<<<<< HEAD
}
=======
}
>>>>>>> 4488fa0827d4b0851550fd1d81de4c1a27404216
