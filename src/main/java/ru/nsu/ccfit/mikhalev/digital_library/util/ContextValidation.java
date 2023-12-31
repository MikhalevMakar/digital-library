package ru.nsu.ccfit.mikhalev.digital_library.util;

public record ContextValidation() {

    public static final int MIN_SIZE_WORD = 1;

    public static final int MAX_SIZE_WORD = 50;

    public static final int MIN_SIZE_YEAR = 1;

    public static final int CURRENT_YEAR = 2023;

    public static final int MIN_SIZE_PAGES = 1;

    public static final int CURRENT_SIZE_PAGE = 10;

    public static final int MIN_SIZE_SEQ = 3;

    public static final int MAX_SIZE_SEQ = 150;

    public static final int MIN_SIZE_PASSWORD = 7;

    public static final int MAX_SIZE_PASSWORD = 100;

    public static final int MIN_SIZE_NAME = 5;
    public static final int MAX_SIZE_NAME = 30;
}
