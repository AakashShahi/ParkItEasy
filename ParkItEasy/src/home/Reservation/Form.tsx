import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import './Reservation.css';

function ReservationForm() {
    // Helper function to get current time in "HH:MM" format
    const getCurrentTime = () => {
        const now = new Date();
        const hours = String(now.getHours()).padStart(2, '0');
        const minutes = String(now.getMinutes()).padStart(2, '0');
        return `${hours}:${minutes}`;
    };

    // State with the current time as default value for startTime
    const [startDate, setStartDate] = useState(new Date());
    const [endDate, setEndDate] = useState(new Date());
    const [startTime, setStartTime] = useState(getCurrentTime());
    const [endTime, setEndTime] = useState(getCurrentTime());

    return (
        <div className="mainBg">
            <div className="semiBg">
                <h1 className="heading1">Enhance Your Parking Experience with:</h1>

                <div className="locationField">
                    <h2>Parking Lots available in Your Area</h2>
                    <select name="parkingLot" id="parkingLotId">
                        <option>Aloo</option>
                        <option>Boo</option>
                    </select>
                </div>

                <h2 className="heading2">Reserve Your Spot</h2>

                <div className="vehicleField">
                    <h2>Vehicle Type</h2>
                    <select name="vehicleType" id="vehicleTypeId">
                        <option>Two Wheeler</option>
                        <option>Four Wheeler</option>
                        <option>Others</option>
                    </select>
                </div>

                <div className="grid">
                    <div className="dateField">
                        <label htmlFor="startDate">Start Date</label>
                        <DatePicker
                            selected={startDate}
                            onChange={date => setStartDate(date)}
                            dateFormat="MMMM d, yyyy"
                            className="datePicker"
                        />
                    </div>
                    <div className="timeField">
                        <label htmlFor="startTime">Start Time</label>
                        <div className="customTimePicker">
                            <input
                                type="time"
                                value={startTime}
                                onChange={e => setStartTime(e.target.value)}
                                className="timePicker"
                            />
                        </div>
                    </div>
                    <div className="dateField">
                        <label htmlFor="endDate">End Date</label>
                        <DatePicker
                            selected={endDate}
                            onChange={date => setEndDate(date)}
                            dateFormat="MMMM d, yyyy"
                            className="datePicker"
                        />
                    </div>
                    <div className="timeField">
                        <label htmlFor="endTime">End Time</label>
                        <div className="customTimePicker">
                            <input
                                type="time"
                                value={endTime}
                                onChange={e => setEndTime(e.target.value)}
                                className="timePicker"
                            />
                        </div>
                    </div>
                </div>
                <button className="applyBtn">Apply for Parking</button>
            </div>
        </div>
    );
}

export default ReservationForm;
