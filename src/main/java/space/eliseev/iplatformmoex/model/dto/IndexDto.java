package space.eliseev.iplatformmoex.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import space.eliseev.iplatformmoex.model.enumeration.Engine;

import java.awt.color.ICC_Profile;

@Getter
@Setter
@ToString
public class IndexDto {

    private Content engines;
    private Content markets;
    private Content boards;
    private Content boardgroups;
    private Content durations;
    private Content securitytypes;
    private Content securitygroups;
    private Content securitycollections;
}
