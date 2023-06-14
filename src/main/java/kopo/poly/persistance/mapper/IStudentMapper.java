package kopo.poly.persistance.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//Spring Boot 시작 -> Mapper XML 파일과 연결 & 메모리 올림 (자동)
// 메모리에 올리는 것 -> 서로서로 호출이 가능해짐
public interface IStudentMapper {

    void insertStudent(StudentDTO pDTO) throws Exception;

    List<StudentDTO> getStudentList() throws Exception;
    // select 는 앞에 get을 붙임
    // 튜플 = 레코드 = 열(row)

    StudentDTO getStudent(StudentDTO pDTO) throws Exception;

    void updateStudent(StudentDTO pDTO) throws Exception;

    void deleteStudent(StudentDTO pDTO) throws Exception;

}
// 자바 인터페이스를 이용해서 자바에서 xml을 실행할 수 있도록 함
// 자바는 자바 밖에 실행 못함
// mapper와 매칭 (연결)
// 쿼리 한 개당 해당되는 함수 한 개 만들어 줌 (1:1)