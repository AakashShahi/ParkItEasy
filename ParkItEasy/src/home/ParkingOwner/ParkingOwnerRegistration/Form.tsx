import React, { useState } from 'react';
import './ParkingOwner.css';

function OwnerRegistration() {
    const [showModal, setShowModal] = useState(false);
    const [showPassword, setShowPassword] = useState(false);

    const toggleModal = () => {
        setShowModal(!showModal);
    };

    const togglePassword = () => {
        setShowPassword(!showPassword);
    };

    return (
        <>
            <div className="backgroundContainer">
                <div className="formContainer">
                    <h1 className="formTitle">ParkingLot <span className="highlightText">Registration</span></h1>
                    <form className="formFields">
                        <div>
                            <label htmlFor="parking-lot-name" className="sr-only">Parking Lot Name</label>
                            <input type="text" id="parking-lot-name" className="inputField" placeholder="Parking Lot Name" />
                        </div>
                        <div>
                            <label htmlFor="email" className="sr-only">Email</label>
                            <input type="email" id="email" className="inputField" placeholder="Email" />
                        </div>
                        <div>
                            <label htmlFor="password" className="sr-only">Password</label>
                            <input type="password" id="password" className="inputField" placeholder="Password" />
                        </div>
                        <div>
                            <label htmlFor="phone-no" className="sr-only">Phone No</label>
                            <input type="text" id="phone-no" className="inputField" placeholder="Phone No" />
                        </div>
                        <div>
                            <label htmlFor="confirm-password" className="sr-only">Confirm Password</label>
                            <input type="password" id="confirm-password" className="inputField" placeholder="Confirm Password" />
                        </div>
                        <div className="formActions">
                            <a href="#" className="signInLink" onClick={toggleModal}>Sign-In</a>
                            <button type="submit" className="submitButton">Submit</button>
                        </div>
                    </form>
                </div>
            </div>

            {showModal && (
                <div className="modalContainer">
                    <div className="modalContent">
                        <button className="closeModalButton" onClick={toggleModal}>&times;</button>
                        <h2>Sign In</h2>
                        <input type="email" className="modalInputField" placeholder="Email" />
                        <input
                            type={showPassword ? 'text' : 'password'}
                            className="modalInputField"
                            placeholder="Password"
                        />
                        <div>
                            <input type="checkbox" id="togglePassword" onChange={togglePassword} />
                            <label htmlFor="togglePassword">Show Password</label>
                        </div>
                        <button className="modalSubmitButton">Login</button>
                    </div>
                </div>
            )}
        </>
    );
}

export default OwnerRegistration;
