package com.example.rungroup.services;

import com.example.rungroup.dto.ClubDTO;

import java.util.List;

public interface ClubService {
    List<ClubDTO> findAllClubs();
}
