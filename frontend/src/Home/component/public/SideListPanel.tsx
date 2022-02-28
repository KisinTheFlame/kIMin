import React from "react";
import {SideList} from "./SideList";

export interface SideListItem {
}

export interface SideListPanelMainPart {
}


interface SideListPanelProps {
    listItems: Array<SideListItem>;
    mainPart: SideListPanelMainPart;
}

interface SideListPanelState {

}

// 一个左侧列表右侧主要内容的面板模板
export class SideListPanel extends React.Component<SideListPanelProps, SideListPanelState> {
    render() {
        return (
            <div className="side-list-panel">
                <SideList listItems={this.props.listItems}/>
                <main className="side-list-panel-main-part">
                    {this.props.mainPart}
                </main>
            </div>
        );
    }
}
