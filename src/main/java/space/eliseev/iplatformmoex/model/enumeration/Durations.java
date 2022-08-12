package space.eliseev.iplatformmoex.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Durations {
    MINUTE("minute"),
    TEN_MINUTES("ten_minutes"),
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    QUARTAL("quartal");

    private final String name;
}
