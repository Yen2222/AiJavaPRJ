package kopo.poly.service;

import kopo.poly.dto.NlpDTO;

public interface INlpSevice {
    NlpDTO getPlainText (String text);

    NlpDTO getNouns(String text);
}
