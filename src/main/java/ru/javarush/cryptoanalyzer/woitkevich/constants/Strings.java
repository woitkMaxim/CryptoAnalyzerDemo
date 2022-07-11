package ru.javarush.cryptoanalyzer.woitkevich.constants;

public class Strings {
    private static final String rus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String eng = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "01234567890";
    private static final String symbols = ",./@'=+-_;:[]{}";

    public static final String alphabet = rus + rus.toUpperCase() + eng + eng.toUpperCase() + numbers + symbols;
}
