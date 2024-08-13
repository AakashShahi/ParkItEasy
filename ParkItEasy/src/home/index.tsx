import React, { useRef, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import ReservationForm from './Reservation/Form.tsx';
import './Home.css';
import CustomerSignUp from "./CustomerRegistration/Form.tsx";
import Service from "./OurSercive";
import FootArea from "./DownBar";

function Home() {
    const [showLoginForm, setShowLoginForm] = useState(false);
    const [showPassword, setShowPassword] = useState(false);
    const navigate = useNavigate();
    const customerContainerRef = useRef(null);
    const serviceContainerRef = useRef(null);
    const reserveContainerRef = useRef(null);

    const scrollToCustomerContainer = (event) => {
        event.preventDefault();
        customerContainerRef.current.scrollIntoView({ behavior: 'smooth' });
    };

    const scrollToServiceContainer = (event) => {
        event.preventDefault();
        serviceContainerRef.current.scrollIntoView({ behavior: 'smooth' });
    };

    const reserveToServiceContainer = (event) => {
        event.preventDefault();
        reserveContainerRef.current.scrollIntoView({ behavior: 'smooth' });
    };

    const navigateToParkingOwner = (event) => {
        event.preventDefault();
        navigate('/parking_owner');
    };

    const toggleLoginForm = (event) => {
        event.preventDefault();
        setShowLoginForm(!showLoginForm);
    };

    const togglePasswordVisibility = () => {
        setShowPassword(!showPassword);
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
                            <li className="homeTag" onClick={reserveToServiceContainer}>Home</li>
                            <li className="serviceTag" onClick={scrollToServiceContainer}>Our Services</li>
                            <li className="lotTag" onClick={navigateToParkingOwner}>Parking Lot?</li>
                        </ul>
                    </div>

                    <div className="navLogSign">
                        <img className="profileLogo" src="src/assets/profileLogo.png" alt="Profile Logo" />
                        <a className="navLogIn" href="#" onClick={toggleLoginForm}>Log In</a>
                        <a className="navRegister" href="#register" onClick={scrollToCustomerContainer}>Sign Up</a>
                    </div>
                </div>
            </header>

            {showLoginForm && (
                <div className="loginDropdown">
                    <div className="closeButton" onClick={toggleLoginForm}>&times;</div>
                    <form className="loginForm">
                        <label>Email</label>
                        <input type="email" placeholder="Enter your email" required />
                        <label>Password</label>
                        <input
                            type={showPassword ? "text" : "password"}
                            placeholder="Enter your password"
                            required
                        />
                        <button type="button" className="togglePassword" onClick={togglePasswordVisibility}>
                            {showPassword ? "Hide" : "Show"}
                        </button>
                        <button type="submit" className="loginButton">Log In</button>
                        <a href="/forgot-password" className="forgotPasswordLink">Forgot Password?</a>
                    </form>
                </div>
            )}

            <div className="reserveContainer" ref={reserveContainerRef}>
                <ReservationForm />
            </div>

            <div className="customerContainer" ref={customerContainerRef}>
                <CustomerSignUp />
            </div>

            <div className="serviceContainer" ref={serviceContainerRef}>
                <Service />
            </div>

            <footer className="footerContainer">
                <FootArea />
            </footer>
        </>
    );
}

export default Home;
