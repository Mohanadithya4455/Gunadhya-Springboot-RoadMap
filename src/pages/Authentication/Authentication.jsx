import { Card, Grid } from '@mui/material'
import React from 'react'
import Login from './Login'
import Register from './Register'
import { Route, Routes } from 'react-router-dom'

const Authentication = () => {
  return (
    <div>
      <Grid container>
        <Grid className='h-screen overflow-hidden' item xs={7}>
            <img className="w-full h-full" src="https://cdn.pixabay.com/photo/2024/02/09/13/03/beach-8563083_640.jpg" />
        </Grid>
        <Grid item xs={5}>
            <div className='px-20 flex flex-col justify-center h-full'>
                <Card className='card p-8'>
                    <div className='flex  flex-col items-center mb-5 space-y-1'>
                        <h1 className='font-semibold'>Mohan Adithya</h1>
                        <p className='font-thin text-sm'>A room without books is like a body without a soul.
                        ― Marcus Tullius Cicero</p>
                    </div>
                    <Routes>
                     <Route path='/' element={<Login/>}/>
                     <Route path='/login' element={<Login/>}/>
                     <Route path='register' element={<Register/>}/>
                    </Routes>
                  
                </Card>

            </div>
        </Grid>
      </Grid>
    </div>
  )
}

export default Authentication