package com.plaggeij.service;

import com.plaggeij.dto.SpeceminDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpeceminServiceStub {
    public SpeceminDTO fetchById(int Id) {
        SpeceminDTO speceminDTO = new SpeceminDTO();
        speceminDTO.setSpeceminId(43);
        speceminDTO.setLatitude("39.74");
        speceminDTO.setLongitude("-84.51");
        speceminDTO.setDescription("A beautiful Eastern Redbud");

        return speceminDTO;
    }
}
