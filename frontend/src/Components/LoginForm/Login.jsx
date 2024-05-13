import React, {useState} from 'react'
import "./Login.css"


export const Login = () => {
  return (
    <div className='wrapper' id='main__login'>
        <form action="">
          <h1>Login</h1>
          <label htmlFor="Usuario">
            <span>Usuario</span>
            <input type="text" id='Usuario' placeholder='Usuario1' autoComplete='Usuario' required/><br/>
          </label>
          <label htmlFor="Password">
            <span>Contraseña</span>
            <input type="password" id="Password" placeholder='********' autoComplete='current-password' required/><br/>
          </label>
          <div className='remember-forgot'>
            <label htmlFor="Forgotpassword">
              <input type="checkbox"/>
              <span>Recordarme</span><br/>
            </label>
            <a href="#">¿Olvidaste la contraseña?</a>
          </div>
          <input type="submit" value="Enviar"/>
          <div className='register'>
            <span>¿No tenes cuenta?</span>
            <a href="../SignupForm/Sign_up.jsx">Resgistrate</a>
          </div>
        </form>
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
