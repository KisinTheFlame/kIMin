package tech.kisin.kimin.entity;

public abstract class Message {

    private Integer senderAccountNumber;
    private Integer receiverAccountNumber;
    private String content;

    public Message(Integer senderAccountNumber, Integer receiverAccountNumber, String content) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.content = content;
    }

    public abstract String getType();

    public Integer getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(Integer senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public Integer getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(Integer receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
