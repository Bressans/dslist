package com.bressan.dslist.services;

import com.bressan.dslist.dto.GameListDTO;
import com.bressan.dslist.repositories.GameListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GameListService {

    public final GameListRepository gameListRepository;

    public List<GameListDTO> getAllGameLists() {
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

}
