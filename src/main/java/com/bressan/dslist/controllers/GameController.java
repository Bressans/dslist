package com.bressan.dslist.controllers;

import com.bressan.dslist.dto.GameMinDTO;
import com.bressan.dslist.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public List<GameMinDTO> getAllGames() {
        return gameService.getAllGames();
    }

}
