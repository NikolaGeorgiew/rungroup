package com.example.rungroup.services.impl;

import com.example.rungroup.dto.ClubDTO;
import com.example.rungroup.models.Club;
import com.example.rungroup.repositories.ClubRepository;
import com.example.rungroup.services.ClubService;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDTO> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDTO(club)).collect(Collectors.toList());
    }

    private ClubDTO mapToClubDTO(Club club) {
        ClubDTO clubDTO = ClubDTO.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDTO;
    }
}
