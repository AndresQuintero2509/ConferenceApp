package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImplementation;
import com.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
