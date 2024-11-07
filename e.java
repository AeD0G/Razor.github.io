/* Button Container */
.button-container {
    display: flex;
    gap: 30px;
    margin-top: 50px;
}

/* Glowing Buttons */
.button {
    background-color: #9b00ff;
    color: #ffffff;
    border: none;
    padding: 20px 50px;
    font-size: 1.5rem;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s, box-shadow 0.3s;
    text-align: center;
    box-shadow: 0 0 10px rgba(155, 0, 255, 0.3);
}

.button:hover {
    background-color: #7a00cc;
    box-shadow: 0 0 25px rgba(155, 0, 255, 0.7);
}
