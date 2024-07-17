import React from 'react';
import './LotOwner.css';

function LotOwner() {
    // Dummy data for demonstration
    const tableData = [
        {
            vehicleNo: "ABC123",
            customerName: "John Doe",
            vehicleType: "Car",
            slotNo: "A1",
            customerPhone: "123-456-7890",
            status: "Parked",
            startTime: "10:00 AM",
            endTime: "12:00 PM",
            startDate: "2024-07-17",
            endDate: "2024-07-17",
            amount: "$10.00"
        },
        {
            vehicleNo: "XYZ456",
            customerName: "Jane Smith",
            vehicleType: "Motorcycle",
            slotNo: "B2",
            customerPhone: "987-654-3210",
            status: "Parked",
            startTime: "09:30 AM",
            endTime: "11:30 AM",
            startDate: "2024-07-17",
            endDate: "2024-07-17",
            amount: "$5.00"
        },
        {
            vehicleNo: "DEF789",
            customerName: "Alice Johnson",
            vehicleType: "Truck",
            slotNo: "C3",
            customerPhone: "555-123-4567",
            status: "Parked",
            startTime: "11:00 AM",
            endTime: "01:00 PM",
            startDate: "2024-07-17",
            endDate: "2024-07-17",
            amount: "$15.00"
        }
    ];

    return (
        <div className="container">
            <div className="sidebar">
                <div className="logo">
                    <img className="ParkLogo" src="/src/assets/parkinglogo2.png" alt="Park Logo"/>
                </div>
                <nav className="nav">
                    <button className="nav-item">
                        <img alt="dashboard-icon" src="src/assets/dashboard.png"/>
                        Dashboard
                    </button>
                    <button className="nav-item">
                        <img alt="parking-lot-icon" src="src/assets/parklot.png"/>
                        Parking Lot
                    </button>
                    <button className="nav-item">
                        <img alt="profile-icon" src="src/assets/profile.png"/>
                        Profile
                    </button>
                </nav>
                <button className="logout-button">Log Out</button>
            </div>

            <div className="main-content">
                <h2 className="main-title">Dashboard</h2>
                <div className="stats-grid">
                    <div className="stat-card">
                        <img alt="two-wheelers-icon" src="/src/assets/twowheeler.png"/>
                        <p className="stat-title">TWO WHEELERS</p>
                        <p className="stat-value">0</p>
                    </div>
                    <div className="stat-card">
                        <img alt="four-wheelers-icon" src="/src/assets/fourwheeler.png"/>
                        <p className="stat-title">FOUR WHEELERS</p>
                        <p className="stat-value">0</p>
                    </div>
                    <div className="stat-card">
                        <img alt="others-icon" src="/src/assets/others.png"/>
                        <p className="stat-title">OTHERS</p>
                        <p className="stat-value">0</p>
                    </div>
                </div>

                <h2 className="main-title">Vehicle Details</h2>
                <div className="table-container">
                    <table className="table">
                        <thead>
                        <tr>
                            <th>Vehicle No</th>
                            <th>Customer Name</th>
                            <th>Vehicle Type</th>
                            <th>Slot No</th>
                            <th>Customer Phone No</th>
                            <th>Status</th>
                            <th>Start Time</th>
                            <th>End Time</th>
                            <th>Start Date</th>
                            <th>End Date</th>
                            <th>Amount</th>
                        </tr>
                        </thead>
                        <tbody>
                        {tableData.map((row, index) => (
                            <tr key={index}>
                                <td>{row.vehicleNo}</td>
                                <td>{row.customerName}</td>
                                <td>{row.vehicleType}</td>
                                <td>{row.slotNo}</td>
                                <td>{row.customerPhone}</td>
                                <td>{row.status}</td>
                                <td>{row.startTime}</td>
                                <td>{row.endTime}</td>
                                <td>{row.startDate}</td>
                                <td>{row.endDate}</td>
                                <td>{row.amount}</td>
                            </tr>
                        ))}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    );
}

export default LotOwner;
