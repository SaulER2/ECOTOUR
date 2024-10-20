import React from 'react'
import {Link} from 'react-router-dom';
import './Header.css'

export default function Header() {
  return (
    <div>
        <header className="header">
            <Link to="/">
                <figure className='LogoBox'>
                    <img src="pexels-mat-brown-449520.jpg" alt="ECOTOUR LOGO" className='Logo'/>
                </figure>
                <h1>ECOTOUR</h1>
            </Link>
            <nav className="nav">
                <ul className="nav__list">
                    <li className="nav__list--item"><Link to="/signup">Sign up</Link></li>
                    <li className="nav__list--item"><Link to="/login">Login</Link></li>
                </ul>
            </nav>
        </header>
    </div>
  )
}
