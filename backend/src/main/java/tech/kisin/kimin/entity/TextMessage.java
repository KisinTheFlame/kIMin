package tech.kisin.kimin.entity;

public class TextMessage extends Message {
    private static final Message.Type TYPE = new Type("TEXT");

    public TextMessage(AccountNumber senderAccountNumber, AccountNumber receiverAccountNumber, Message.Content content) {
        super(senderAccountNumber, receiverAccountNumber, content);
    }

    @Override
    public Message.Type getType() {
        return TYPE;
    }
}
