import React from "react";
import {ChatPanel} from "./component/ChatPanel";
import './style.css'
import {Avatar} from "@geist-ui/react";
import {MessageSquare, Sliders, Users} from "@geist-ui/icons";

interface HomeContainerProps {
}

interface HomeContainerState {
}

export class HomeContainer extends React.Component<HomeContainerProps, HomeContainerState> {
    render() {
        return (
            <div className="home-layout">
                <aside className="side-menu-bar">
                    <div className="side-menu-bar-box">
                        <div className="side-menu-bar-item-box">
                            <Avatar className="side-menu-bar-item"
                                    width="var(--side-menu-bar-item-size)"
                                    height="var(--side-menu-bar-item-size)"
                                    src="http://localhost:12580/avatar/default-avatar.jpg"
                            />
                        </div>
                        <div className="side-menu-bar-item-box">
                            <MessageSquare color="white"
                                           size={40}
                            />
                        </div>
                        <div className="side-menu-bar-item-box">
                            <Users color="white"
                                   size={40}
                            />
                        </div>
                        <div style={{flex: 1}} />
                        <div className="side-menu-bar-item-box">
                            <Sliders color="white"
                                     size={40}
                            />
                        </div>
                    </div>
                </aside>
                <main className="main-window">
                    <ChatPanel/>
                </main>
            </div>
        );
    }
}
