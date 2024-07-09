import "./OurService.css"

function Service(){
    return(
        <div className="mainServBg">
            <h2 className="headServ">Our Services</h2>
            <div className="semiServBg">

                <div className="regCont">
                    <img src="https://placehold.co/600x400" alt="Car parked in a parking lot" className="regContImg"/>
                        <div className="p-6">
                            <h3 className="regHead">Easy Parking</h3>
                            <p className="regPara">You can register your details and vehicle no for reservation of parking space available near you,
                                that helps saving your valuable time and parking becomes easy with <span className="text-primary">ParkitEasy</span>.</p>
                            <button className="regBtn">Register</button>
                        </div>
                </div>

                <div className="parkingLotCon">
                    <img src="https://placehold.co/600x400" alt="Empty parking lot" className="parkingLotImg"/>
                        <div className="p-6">
                            <h3 className="parkingLotHead">Parking Lot?</h3>
                            <p className="parkingLotPara">You own parking lot? Here’s the best place to add some money to your daily revenue. Register through our parking lot registrations portal and make your empty place a valuable income source.</p>
                            <button className="parkingLotBtn">Register</button>
                        </div>
                </div>

                <div className="vehicleSecCont">
                    <img src="https://placehold.co/600x400" alt="Security camera monitoring a parking lot" className="vehSecContImg"/>
                        <div className="p-6">
                            <h3 className="vehSecHead">Vehicle Security?</h3>
                            <p className="vehSecPara">Choose our service for secure way of parking your vehicles and feel free to leave your vehicle at the available space you find from here coz strict security is what we provide too.</p>
                            <button className="vehSecBtn">Read Policy</button>
                        </div>
                </div>
            </div>
        </div>
    );
}

export default Service;
