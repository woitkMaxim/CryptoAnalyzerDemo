package ru.javarush.cryptoanalyzer.woitkevich.app;

import ru.javarush.cryptoanalyzer.woitkevich.Result;
import ru.javarush.cryptoanalyzer.woitkevich.controller.MainController;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.execute(command, parameters);
    }
}
