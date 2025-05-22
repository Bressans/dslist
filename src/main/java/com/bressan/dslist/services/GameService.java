package com.bressan.dslist.services;

import com.bressan.dslist.dto.GameDTO;
import com.bressan.dslist.dto.GameMinDTO;
import com.bressan.dslist.entities.Game;
import com.bressan.dslist.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GameService {

    public final GameRepository gameRepository;

    public List<GameMinDTO> getAllGames() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    public GameDTO getGameById(Long gameId) {
        Game result = gameRepository.findById(gameId).orElseThrow();
        return new GameDTO(result);
    }

    public List<GameMinDTO> getGamesByList(Long listId) {
        return gameRepository.searchByList(listId).stream().map(GameMinDTO::new).toList();
    }

}
