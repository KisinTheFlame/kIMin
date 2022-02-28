package tech.kisin.kimin.dto;

import tech.kisin.kimin.entity.Message;

public class MessageDTO {
    private Integer senderAccountNumber;
    private Integer receiverAccountNumber;
    private String type;
    private String content;

    public MessageDTO(Integer senderAccountNumber, Integer receiverAccountNumber, String type, String content) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.type = type;
        this.content = content;
    }

    public static MessageDTO from(Message message) {
        return new MessageDTO(
                message.getSenderAccountNumber(),
                message.getReceiverAccountNumber(),
                message.getType(),
                message.getContent()
        );
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "senderAccountNumber=" + senderAccountNumber +
                ", receiverAccountNumber=" + receiverAccountNumber +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
