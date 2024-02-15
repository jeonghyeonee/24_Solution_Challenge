package com.gdsc.solutionchallenge.app.service;

import com.gdsc.solutionchallenge.app.dto.response.SpeciesImagesInfoDto;
import com.gdsc.solutionchallenge.app.repository.ImageRepository;
import com.gdsc.solutionchallenge.app.repository.SpeciesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class SpeciesService {

    private final SpeciesRepository speciesRepository;

    public SpeciesImagesInfoDto findOneOfLocations(Long speciesId) {
        SpeciesImagesInfoDto speciesImagesInfoDto = speciesRepository.findByIdWithImages(speciesId).get();
        return speciesImagesInfoDto;
    }
}
