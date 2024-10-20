//import { useState } from 'react'
//import axios from 'axios'
import './App.css'
import Login from './Components/LoginForm/Login'
import Sign_up from './Components/SignupForm/Sign_up'
//import  Start from './Components/StartPage/Start'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import { Start } from './Components/StartPage/Start'
import Header from './Components/Header/Header'
function App() {

  return (
    <>
      <div>
        <BrowserRouter>
        <Header/>
          <div className='container' id='#container'>
            <Routes>
            <Route exact path='/' element={<Start/>}></Route>
              <Route path='/start' element={<Start/>}></Route>
              <Route path='/signup' element={<Sign_up/>}></Route>
              <Route path='/login' element={<Login/>}></Route>
            </Routes>
          </div>
        </BrowserRouter>
      </div>
    </>
  )
}

export default App
