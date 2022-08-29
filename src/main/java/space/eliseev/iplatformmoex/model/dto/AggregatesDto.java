package space.eliseev.iplatformmoex.model.dto;

import lombok.Value;
import space.eliseev.iplatformmoex.model.Aggregates;

import java.util.List;

@Value
public class AggregatesDto {
    List<Aggregates> aggregates;
}
