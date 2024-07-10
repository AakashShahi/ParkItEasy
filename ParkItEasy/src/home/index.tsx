import React, { useRef } from 'react';
import ReservationForm from './Reservation/Form.tsx';
import './Home.css';
import CustomerSignUp from "./CustomerRegistration/Form.tsx";
import Service from "./OurSercive";
import FootArea from "./DownBar";

function Home() {
    const customerContainerRef = useRef(null);

    const scrollToCustomerContainer = (event) => {
        event.preventDefault();
        customerContainerRef.current.scrollIntoView({ behavior: 'smooth' });
    };

    return (
        <>
            <header>
                <div className="mainNav">
                    <div className="parkingLogo">
                        <img className="myLogo" src="src/assets/parkingLogo.png" alt="parkingLogo" />
                    </div>

                    <div className="navItems">
                        <ul className="navItems-list">
                            <li className="homeTag">Home</li>
                            <li className="serviceTag">Our Services</li>
                            <li className="lotTag">Parking Lot?</li>
                        </ul>
                    </div>

                    <div className="navLogSign">
                        <img className="profileLogo" src="src/assets/profileLogo.png" alt="Profile Logo" />
                        <a className="navLogIn" href="/login">Log In</a>
                        <a className="navRegister" href="#register" onClick={scrollToCustomerContainer}>Sign Up</a>
                    </div>
                </div>
            </header>

            <div className="reserveContainer">
                <ReservationForm />
            </div>

            <div className="customerContainer" ref={customerContainerRef}>
                <CustomerSignUp />
            </div>

            <div className="serviceContainer">
                <Service />
            </div>

            <footer className="footerContainer">
                <FootArea/>
            </footer>
        </>
    );
}

export default Home;
