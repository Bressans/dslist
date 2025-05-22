package com.bressan.dslist.controllers;

import com.bressan.dslist.dto.GameListDTO;
import com.bressan.dslist.dto.GameMinDTO;
import com.bressan.dslist.services.GameListService;
import com.bressan.dslist.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    @GetMapping
    public List<GameListDTO> getAllGames() {
        return gameListService.getAllGameLists();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> getGamesByList(@PathVariable Long listId) {
        return gameService.getGamesByList(listId);
    }

}
