import './NavBar.css';

function NavBar() {

    return (
        <>
            <header>
                <nav className="navBar">
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
                        <a className="navRegister" href="/register">Sign Up</a>
                    </div>
                </nav>
            </header>
        </>
    );
}

export default NavBar;
