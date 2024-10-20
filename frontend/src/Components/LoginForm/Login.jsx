import React, {useState} from 'react'
import {Link} from 'react-router-dom';
import "./Login.css"


export const Login = () => {
  return (
    <div className='wrapper' id='main__login'>
      <div className='login__container'>
      <h1 className='h1'>Login</h1>
        <form action="">
          <label htmlFor="Usuario" className="Usuario">
            <span>Username</span>
            <input type="text" id='Usuario' placeholder='Username1' autoComplete='Usuario' required/><br/>
          </label>
          <label htmlFor="Password" className="Contraseña">
            <span>Password</span>
            <input type="password" id="Password" placeholder='********' autoComplete='current-password' required/><br/>
          </label>
          <div className='remember-forgot'>
            <label htmlFor="Forgotpassword" className="remember-forgot">
              <input type="checkbox"/>
              <span>Remind me</span><br/>
            </label>
          </div>
          <div className = "Enviar">
          <input type="submit" value="Enviar" className="Enviar"/>
          </div>
          <a href="#" className='a'>Forgot the password?</a>
          <div className='register'>
            <span>Don't have an account? </span>
            <Link to="/signup" className='a'>Sign up!</Link>
          </div>
        </form>
      </div>
    </div>
  )
}
export default Login;

/*export default function Login() {

  return (
    <div>
        <header>
            <h1>Login</h1><br/>
        </header>
        <main>
            <section>
                <form action="">
                    <label htmlFor="Usuario">
                        <span>Usuario</span><br/>
                        <input type="text" id='Usuario' placeholder='Usuario1' autoComplete='Usuario' required/><br/>
                    </label>
                    <label htmlFor="Password">
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
