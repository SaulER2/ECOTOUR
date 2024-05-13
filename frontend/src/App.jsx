import { useState } from 'react'
import './App.css'
import Login from './Components/LoginForm/Login'
import Sign_up from './Components/SignupForm/Sign_up'
import { Start } from './Components/StartPage/Start'
import { BrowserRouter} from 'react-router-dom';
function App() {

  return (
    <>
      <div>
        <BrowserRouter>
          <div className='container'>
            <Routes>
              <Route exact path="/" element={<Start/>}></Route>
              <Route path="/startpage" element={<Start/>}></Route>
              <Rout path = "/sign/up" elemento = {<Sign_up/>}></Rout>
            </Routes>
          </div>
        </BrowserRouter>
      </div>
    </>
  )
}

export default App
