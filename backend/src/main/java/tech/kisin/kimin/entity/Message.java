package tech.kisin.kimin.entity;

public abstract class Message {

    private AccountNumber senderAccountNumber;
    private AccountNumber receiverAccountNumber;
    private Content content;

    public Message(AccountNumber senderAccountNumber, AccountNumber receiverAccountNumber, Message.Content content) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.content = content;
    }

    public abstract Message.Type getType();

    public AccountNumber getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(AccountNumber senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public AccountNumber getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(AccountNumber receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public static class Content {
        private String content;

        public Content(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class Type {
        private String name;

        public Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
