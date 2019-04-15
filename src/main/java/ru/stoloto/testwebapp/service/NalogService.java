package ru.stoloto.testwebapp.service;



import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;

import java.io.IOException;

@Service
public class NalogService {

    private NalogRepository nalogRepository;

    private UtilsService utilsService;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    @Autowired
    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) throws IOException {
        return nalogRepository.getInnForIndividual(informationDto);
    }
}
