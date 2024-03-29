package com.gdsc.solutionchallenge.app.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class SpeciesImagesInfoDto {

    private Long speciesId;

    private String scientificName;

    private String koreaName;

    private List<ImageInfoDto> images;

    @Builder
    public SpeciesImagesInfoDto(Long speciesId, String scientificName, String koreaName, List<ImageInfoDto> images) {
        this.speciesId = speciesId;
        this.scientificName = scientificName;
        this.koreaName = koreaName;
        this.images = images;
    }
}
