import "./footer.css"
function FootArea(){
    return(
        <>
            <div className="foot-area">
                <div className="foot_logo_area">
                    <img src="/src/assets/parkingLogo.png" alt="Parking Logo"/>
                </div>

                <div className="foot_text_area">
                    <span>Designed by Aakash Shahi</span>
                </div>

                <div className="foot_link_area">
                    <a href="https://www.linkedin.com/in/aakash-shahi-9b941b266/"><img src="/src/assets/linkedlogo.png" alt="LinkedIn"/></a>
                    <a href="https://www.instagram.com/aakashshahi977/"><img src="/src/assets/instalogo.png" alt="Instagram"/></a>
                    <a href="https://www.facebook.com/dare.david.7758"><img src="/src/assets/fblogo.png" alt="Facebook"/></a>
                    <a href="https://github.com/AakashShahi"><img src="/src/assets/gitlogo.png" alt="GitHub"/></a>
                </div>
            </div>
        </>
    )
}

export default FootArea