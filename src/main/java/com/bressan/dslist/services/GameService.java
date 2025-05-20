package com.bressan.dslist.services;

import com.bressan.dslist.dto.GameMinDTO;
import com.bressan.dslist.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    public final GameRepository gameRepository;

    public List<GameMinDTO> getAllGames() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

}
