package ru.javarush.cryptoanalyzer.woitkevich;

import ru.javarush.cryptoanalyzer.woitkevich.app.Application;
import ru.javarush.cryptoanalyzer.woitkevich.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);
    }
}
