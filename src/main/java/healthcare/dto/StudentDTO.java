package healthcare.dto;

import lombok.Data;

@Data
public class StudentDTO {
    private String name;

    private String usn;

    private String branch;

    private Integer semester;

    private String bloodGroup;

    private Double weight;

    private Double height;
}
