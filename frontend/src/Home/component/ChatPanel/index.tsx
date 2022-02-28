import React from "react";
import './style.css'
import {SideListPanel, SideListPanelMainPart} from "../public/SideListPanel";
import {Button} from "@geist-ui/react";

interface ChatPanelProps {
}

interface ChatPanelState {
}

export class ChatPanel extends React.Component<ChatPanelProps, ChatPanelState> {
    render() {
        return (
            <SideListPanel listItems={[]} mainPart={<ChatRoom/>}/>
        );
    }
}

interface ChatRoomProps {
}

interface CharRoomState {
}

class ChatRoom extends React.Component<ChatRoomProps, CharRoomState> implements SideListPanelMainPart {
    render() {
        return (
            <>
                <div className="chat-history-scope">

                </div>
                <div className="chat-send-scope">

                </div>
                <div className="chat-send-button-row">
                    <Button scale={0.8}>发送</Button>
                </div>
            </>
        );
    }
}
