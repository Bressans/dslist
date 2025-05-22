package com.bressan.dslist.controllers;

import com.bressan.dslist.dto.GameListDTO;
import com.bressan.dslist.services.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;

    @GetMapping
    public List<GameListDTO> getAllGames() {
        return gameListService.getAllGameLists();
    }

}
