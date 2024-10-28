
import React from 'react';
import './Header.css'; // Make sure to create a corresponding CSS file for styling

const Header = () => {
    return (
        <header className="header">
            <div className="logo">
                <figure>
                    <img src="" alt="" />
                </figure>
                <h1> <a href= "/start">ECOTOUR </a> </h1>
            </div>
            <nav className="nav">
                <ul>
                    <li><a href="/login">Login</a></li>
                    <li><a href="/signup">Sign Up</a></li>
                </ul>
            </nav>
        </header>
    );
};

export default Header;