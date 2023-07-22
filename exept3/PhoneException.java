package exept3;

public class PhoneException extends Throwable {
    String data;

    public PhoneException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Не удалось распознать " + data + " телефонный номер.\n" +
                "Формат ввода номера телефона: 10 цифр без префикса, например: 8442112233\n";
    }
}
