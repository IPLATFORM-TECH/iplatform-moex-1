package space.eliseev.iplatformmoex.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.Date;

@Value
@AllArgsConstructor
@Builder
public class Aggregates {
    String marketName;
    String marketTitle;
    String engine;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date tradedate;
    String secid;
    Double value;
    Integer volume;
    Integer numtrades;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime updatedAt;
}
