package exept3;

public class BirthDayException extends Exception {
    String data;

    public BirthDayException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Неверный формат даты рождения: '" + data + "'.\n" +
                "Формат ввода даты рождения: 'ДД.ММ.ГГГГ'.";
    }
}
