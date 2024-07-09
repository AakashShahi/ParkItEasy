import './CustomerRegistration.css'
function CustomerSignUp(){
    return(
        <div className="registerBg">
            <div className="semiRegisterBg">
                <h1 className="customerHeading">Customer <span
                    className="registerHeading">Registration</span></h1>
                <form className="registrationForm">
                    <div>
                        <input type="text" placeholder="Enter Your Full Name"
                               className="nameField"/>
                    </div>
                    <div>
                        <input type="email" placeholder="Email"
                               className="emailField"/>
                    </div>
                    <div>
                        <input type="password" placeholder="Password"
                               className="passField"/>
                    </div>
                    <div className="phnvhContainer">
                        <input type="text" placeholder="Phone No"
                               className="phoneField"/>
                        <input type="number" placeholder="Vehicle No"
                               className="numberField"/>
                    </div>
                    <div>
                        <input type="password" placeholder="Confirm Password"
                               className="confirmPassField"/>
                    </div>
                    <div className="submitContainer">
                        <button type="submit"
                                className="submitBtn">Submit
                        </button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default CustomerSignUp;