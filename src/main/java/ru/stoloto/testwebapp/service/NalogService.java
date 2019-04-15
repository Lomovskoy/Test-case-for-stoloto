package ru.stoloto.testwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;
import java.io.IOException;

@Service
public class NalogService {

    private NalogRepository nalogRepository;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) throws IOException {
        return nalogRepository.getInnForIndividual(informationDto);
    }
}
