package space.eliseev.iplatformmoex.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Content {

    private List<String> columns;
    private List<List<String>> data;
}
