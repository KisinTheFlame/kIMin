package tech.kisin.kimin.entity;

public class TextMessage extends Message {
    private static final Type TYPE = new Type("Text");

    public TextMessage(AccountNumber senderAccountNumber, AccountNumber receiverAccountNumber, Content content) {
        super(senderAccountNumber, receiverAccountNumber, content);
    }

    @Override
    public Type getType() {
        return TYPE;
    }
}
