import React from 'react';
import './Start.css';

const Start = () => {
  return (
    <div className='Start'>
      <header>
        <h1>Welcome to ECOTOUR</h1>
      </header>
      <main>
        <section>
          <h2>About Us</h2>
          <p>Ecotour is your gateway to the most amazing tours around the world.</p>
        </section>
        <section>
          <h2>Our Tours</h2>
          <p>Explore our wide range of tours designed to bring you closer to nature.</p>
        </section>
        <section>
          <h2>Mayan Architecture</h2>
          <p>Discover the ancient Mayan architecture, a testament to the ingenuity and artistry of the Mayan civilization.</p>
        </section>
        <section>
          <h2>Contact Us</h2>
          <p>Have questions? Reach out to us via our email.</p>
          <p>Email: saul.espinosa.dev@gmail.com</p>
        </section>
      </main>
      <footer>
        <p>&copy; 2024 Ecotour. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default Start;