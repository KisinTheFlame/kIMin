package tech.kisin.kimin.entity;

import tech.kisin.kimin.exception.FactoryCreateFailException;

public abstract class Message {

    private AccountNumber senderAccountNumber;
    private AccountNumber receiverAccountNumber;
    private Content content;

    public Message(AccountNumber senderAccountNumber, AccountNumber receiverAccountNumber, Content content) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.content = content;
    }

    public abstract Type getType();

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

    @Override
    public String toString() {
        return "Message{" +
                "senderAccountNumber=" + senderAccountNumber.getNumber() +
                ", receiverAccountNumber=" + receiverAccountNumber.getNumber() +
                ", content=" + content.getContent() +
                '}';
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

    public static class Factory {
        public static Message create(
                Integer senderAccountNumber,
                Integer receiverAccountNumber,
                String type,
                String content
        ) {
            if ("TEXT".equalsIgnoreCase(type)) {
                return new TextMessage(
                        new AccountNumber(senderAccountNumber),
                        new AccountNumber(receiverAccountNumber),
                        new Content(content)
                );
            } else {
                throw new FactoryCreateFailException();
            }
        }
    }
}
