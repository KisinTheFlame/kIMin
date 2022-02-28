package tech.kisin.kimin.entity;

public class TextMessage extends Message {
    private static final String TYPE = "TEXT";

    public TextMessage(Integer senderAccountNumber, Integer receiverAccountNumber, String content) {
        super(senderAccountNumber, receiverAccountNumber, content);
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
