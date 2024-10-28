import React, { useState } from 'react';
import axios from 'axios';
import './Login.css';

const LoginForm = () => {
  const [formData, setFormData] = useState({
    username: '',
    password: '',
    name: '',
    lastname: '',
    email: '',
    phone: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('https://http://localhost:8079/api/v1/login', formData);
      console.log('Login successful:', response.data);
      // Handle successful login (e.g., redirect to another page)
    } catch (error) {
      console.error('Error logging in:', error);
      // Handle login error (e.g., show error message)
    }
  };

  return (
    <form onSubmit={handleSubmit} className='Login'>
      <div>
        <label>Username:</label>
        <input type="text" name="username" value={formData.username} onChange={handleChange} required />
      </div>
      <div>
        <label>Password:</label>
        <input type="password" name="password" value={formData.password} onChange={handleChange} required />
      </div>
      <button type="submit">Login</button>
    </form>
  );
};

export default LoginForm;