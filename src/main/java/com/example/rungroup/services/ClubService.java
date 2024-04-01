package com.example.rungroup.services;

import com.example.rungroup.dto.ClubDTO;
import com.example.rungroup.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDTO> findAllClubs();

    Club saveClub(ClubDTO clubDTO);

    ClubDTO findClubById(Long clubId);

    void updateClub(ClubDTO club);

    void delete(Long clubId);

    List<ClubDTO> searchClubs(String query);
}
