package fr.maximebaudoin.examjunit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    private Integer won = 0;
    private Integer lost = 0;
    private Integer equality = 0;

    @PostMapping("/restart")
    public boolean restart() {
        this.won = 0;
        this.lost = 0;
        this.equality = 0;
        return true;
    }

    @GetMapping("/score")
    public Integer[] score() {
        return new Integer[]{this.won, this.lost, this.equality};
    }

    //@GetMapping("/play")
    //public String play() {
    //    return "Vous avez joué "+
    //
    //}

}
