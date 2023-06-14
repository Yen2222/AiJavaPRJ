package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO {

    private String userId;
    private String userName;
    private String email;
    private String addr;

    // DB에 있는 컬럼명과 매칭시켜주는 역할함
}
