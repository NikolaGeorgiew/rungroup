package com.example.rungroup.mappers;

import com.example.rungroup.dto.ClubDTO;
import com.example.rungroup.models.Club;

import java.util.stream.Collectors;

import static com.example.rungroup.mappers.EventMapper.mapToEventDTO;

public class ClubMapper {
    public static Club mapToClub(ClubDTO clubDTO) {
        Club club = Club.builder()
                .id(clubDTO.getId())
                .title(clubDTO.getTitle())
                .photoUrl(clubDTO.getPhotoUrl())
                .content(clubDTO.getContent())
                .createdBy(clubDTO.getCreatedBy())
                .createdOn(clubDTO.getCreatedOn())
                .updatedOn(clubDTO.getUpdatedOn())
                .build();
        return club;
    }

    public static ClubDTO mapToClubDTO(Club club) {
        ClubDTO clubDTO = ClubDTO.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdBy(club.getCreatedBy())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .events(club.getEvents().stream().map(event -> mapToEventDTO(event)).collect(Collectors.toList()))
                .build();
        return clubDTO;
    }
}
