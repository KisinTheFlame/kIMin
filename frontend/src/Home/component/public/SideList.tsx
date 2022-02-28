import React from "react";
import {SideListItem} from "./SideListPanel";
import "./style.css"

interface SideListProps {
    listItems: Array<SideListItem>;
}

interface SideListState {
}

export class SideList extends React.Component<SideListProps, SideListState> {
    render() {
        return (
            <aside className="side-list">
                <div className="side-list-box">
                    {this.props.listItems}
                </div>
            </aside>
        );
    }
}
