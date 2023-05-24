package kopo.poly.service;

import kopo.poly.dto.OcrDTO;

public interface IOcrService {
    String modelFile = "C:/model/tessdate";
    // 한 번 올리면 다시 메모리에 올리지 않으므로 결과가 바뀔 일이 없다.

    OcrDTO getReadforImageText(OcrDTO pDTO) throws Exception;
}
