package ohi.com.series.project_ohi_springboot.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

    private String idx;
    private String name;
    private String title;
    private String content;
    private java.sql.Date postdate;
    private String ofile;
    private String sfile;
    private int downcount;

    private int visitcount;

    private String id;
    private String pass;

}
