import React, { useState } from 'react';
import axios from 'axios';

const Sign_up = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [name, setName] = useState('');
    const [lastname, setLastname] = useState('');
    const [email, setEmail] = useState('');

    const handleSign_up = async () => {
        try {
            const response = await axios.post('http://localhost:8080/api/auth/signup', {
                username: username,
                password: password,
                name: name,
                lastname: lastname,
                email: email
            });
            console.log(response.data); // Manejar la respuesta del servidor
        } catch (error) {
            console.error('Error al registrarse:', error);
        }
    };

    return (
        <div>
            <h2>Registrarse</h2>
            <input
                type="text"
                placeholder="User"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
            />
            <input
                type="password"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />
            <input
                type="text"
                placeholder="Name"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />
            <input
                type="text"
                placeholder="Lastname"
                value={lastname}
                onChange={(e) => setLastname(e.target.value)}
            />
            <input
                type="email"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />
            <button onClick={handleSignUp}>Registrarse</button>
        </div>
    );
};

export default Sign_up;

/*export const Sign_up = () => {
  return (
    <div>
      <h1>Sign Up</h1>
    </div>
  )
}*/

/*
export default function Sign_up() {
  return (
    <div>
      <header>
        <h4>Sigh up</h4><br/>
        <h4>Llene los siguientes datos</h4>
    </header>
    <main>
      <section>
        <form action="">
          <label htmlFor="Name">
            <span>Nombre</span><br/>
            <input type="text" id='Name' placeholder='Saul' autoComplete='name' required/><br/>
          </label>
          <label htmlFor="Apellidos">
            <span>Apellidos</span><br/>
            <input type="text" id='Apellidos' placeholder='Espinosa Rios' autoComplete='apellidos' required/><br/>
          </label>
          <label htmlFor="Email">
            <span>Correo electronico</span><br/>
            <input type="email" id='Email' placeholder='ejemplo@gmail.com' autoComplete='email' required/><br/>
          </label>
          <label htmlFor="Confemail">
            <span>Confirmacion de correo electronico</span><br/>
            <input type="email" id='Confemail' placeholder='ejemplo@gmail.com' autoComplete='confemail' required/><br/>
          </label>
          <label htmlFor="Usuario">
            <span>Usuario</span><br/>
            <input type="text" id='Usuario' placeholder='Usuario1' autoComplete='Usuario' required/><br/>
          </label>
          <label htmlFor="password">
            <span>Contraseña</span><br/>
            <input type="password" id='Password' placeholder='********' autoComplete='current-password' required/><br/>
          </label>
          <input type="submit" value="Enviar"/>
        </form>
      </section>
    </main>
    </div>
  )
}*/
