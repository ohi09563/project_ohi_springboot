package ohi.com.series.project_ohi_springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;


@Setter
@Getter
@ToString
public class ScoreDTO {


    private Date date;
    private Time time;
    private String location;
    private String type;
    private String weather;
    private String name;
}
