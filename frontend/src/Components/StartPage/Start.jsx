import React, { useEffect, useState } from 'react'
import UserService from '../../Services/UserService';

export const Start = () => {

    const [users, setUsers] = useState([]);
    useEffect(()=>{
        UserService.getAllUsers().then(response => {
            setUsers(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    }, [])

    
  return (
    <div className='container'>
        <main className='main'>
            <h1>Main</h1>
            <Link to="/signup">Agregar cliente</Link>
        </main>
    </div>
  )
}
