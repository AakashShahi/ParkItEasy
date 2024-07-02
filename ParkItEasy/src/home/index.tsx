import React from 'react';
import NavBar from './NavigationBar/index.tsx';
import {Outlet} from "react-router-dom";

function Home() {
    return (
        <>
                <NavBar/>
            <div className="container">
                <Outlet/>
            </div>
        </>
    );
}

export default Home;
