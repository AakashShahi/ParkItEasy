import React from 'react';
import ReservationForm from './Reservation/Form.tsx';
import './Home.css';
import CustomerSignUp from "./CustomerRegistration/Form.tsx";

function Home() {
    return (
        <>
            <header>
                <div className="mainNav">
                    <div className="parkingLogo">
                        <img className="myLogo" src="src/assets/parkingLogo.png" alt="parkingLogo"/>
                    </div>

                    <div className="navItems">
                        <ul className="navItems-list">
                            <li className="homeTag">Home</li>
                            <li className="serviceTag">Our Services</li>
                            <li className="lotTag">Parking Lot?</li>
                        </ul>
                    </div>

                    <div className="navLogSign">
                        <img className="profileLogo" src="src/assets/profileLogo.png" alt="Profile Logo"/>
                        <a className="navLogIn" href="/login">Log In</a>
                        <a className="navRegister" href="/register">Sign Up</a>
                    </div>
                </div>
            </header>

            <div className="reserveContainer">
                <ReservationForm/>
            </div>

            <div className="customerContainer">
                <CustomerSignUp/>
            </div>
            
        </>
    );
}

export default Home;
