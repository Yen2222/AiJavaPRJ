package kopo.poly;

import kopo.poly.dto.OcrDTO;
import kopo.poly.service.IOcrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor // 자동으로 파라미터 있는 생성자를 만들어줌
public class AiJavaPrjApplication implements CommandLineRunner {

    private final IOcrService ocrService;
    public static void main(String[] args) {

        SpringApplication.run(AiJavaPrjApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("자바 프로그래밍 시작!");

        String filePath = "image";
        String filename = "sample02.jpg";

        OcrDTO pDTO = new OcrDTO();

        pDTO.setFilePath(filePath);
        pDTO.setFileName(filename);

        OcrDTO rDTO = ocrService.getReadforImageText(pDTO);

        String result = rDTO.getResult();

        log.info("인식된 문자열");
        log.info(result);

        log.info("자바 프로그래밍 종료!!");
    }
}
