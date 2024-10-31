import { Button, TextField } from '@mui/material';
import { ErrorMessage, Field, Form, Formik } from 'formik'
import React from 'react'
import { useDispatch } from 'react-redux';
import { loginRequest } from '../../Redux/Auth/auth.actions';
import { useNavigate } from 'react-router-dom';


const initialValues = {email:"",password:""};

const Login = () => {
    const navigate = useNavigate();
    const handleSubmit = (values) =>{
       dispatch(loginRequest({data:values}))
        console.log("hello",values)
    }
    const dispatch = useDispatch();
  return (
    <div>
      <Formik onSubmit={handleSubmit} initialValues={initialValues}>
          <Form className='space-y-5'>
            <div className='space-y-5'>
            <div>
            <Field as={TextField} name="email" type="email" placeholder="Email" variant="outlined" fullWidth />
            <ErrorMessage name='email' component={"div"} className='text-red-500'/>
            </div>
            <div>
            <Field as={TextField} name="password" type="password" placeholder="Password" variant="outlined" fullWidth />
            <ErrorMessage name='password' component={"div"} className='text-red-500'/>
            </div>
            <div>
                <Button variant='contained' type="submit" fullWidth>Submit</Button>
            </div>
            </div>
           
          </Form>
      </Formik>
      <div className='flex gap-2 pt-5 items-center justify-center'>
        <p>If you dont have an account?</p>
        <Button onClick={()=>navigate("/register")}>register</Button>
      </div>
    </div>
  )
}

export default Login
