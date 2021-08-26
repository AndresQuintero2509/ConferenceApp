package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImplementation;
import com.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImplementation() {
        System.out.println("SpeakerServiceImplementation no args constructor");
    }

    public SpeakerServiceImplementation(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImplementation repository  constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImplementation setter");
        this.repository = repository;
    }
}
