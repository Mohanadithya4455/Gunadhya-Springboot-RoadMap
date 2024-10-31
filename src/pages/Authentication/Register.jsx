import { Button, FormControlLabel, Radio, RadioGroup, TextField } from '@mui/material';
import { ErrorMessage, Field, Form, Formik } from 'formik'
import React, { useState } from 'react'
import { useDispatch } from 'react-redux';
import { RegisterRequest } from '../../Redux/Auth/auth.actions';
import { useNavigate } from 'react-router-dom';


const initialValues = {firstName:"",lastName:"",gender:"",email:"",password:""};

const Register = () => {
    const [gender,setGender]=useState("");
    const handleSubmit = (values) =>{
         values.gender=gender
         dispatch(RegisterRequest({data:values}))
       // console.log("hello",values)
    }
    const handleChange = (event) => {
        setGender(event.target.value)
    }
    const navigate = useNavigate();
    const dispatch = useDispatch();

  return (
    <div>
      <Formik onSubmit={handleSubmit} initialValues={initialValues}>
          <Form className='space-y-5'>
            <div className='space-y-5'>
            <div>
            <Field as={TextField} name="firstName" type="text" placeholder="First Name" variant="outlined" fullWidth />
            <ErrorMessage name='email' component={"div"} className='text-red-500'/>
            </div>
            <div>
            <Field as={TextField} name="lastName" type="text" placeholder="Last Name" variant="outlined" fullWidth />
            <ErrorMessage name='email' component={"div"} className='text-red-500'/>
            </div>
            <div>
            <Field as={TextField} name="email" type="email" placeholder="Email" variant="outlined" fullWidth />
            <ErrorMessage name='email' component={"div"} className='text-red-500'/>
            </div>
            <div>
            <Field as={TextField} name="password" type="password" placeholder="Password" variant="outlined" fullWidth />
            <ErrorMessage name='password' component={"div"} className='text-red-500'/>
            </div>
            <div>
            <RadioGroup onChange={handleChange}
        row
        aria-labelledby="gender"
        name="gender"
      >
        <FormControlLabel value="female" control={<Radio />} label="Female" />
        <FormControlLabel value="male" control={<Radio />} label="Male" />
       
       
      </RadioGroup>
      <ErrorMessage name='gender' component={"div"} className='text-red-500'/>
            </div>
            <div>
                <Button variant='contained' type="submit" fullWidth>Submit</Button>
            </div>
            </div>
           
          </Form>
      </Formik>
      <div className='flex gap-2 pt-5 items-center justify-center'>
        <p>Already have an account?</p>
        <Button onClick={()=>navigate("/login")}>login</Button>
      </div>
    </div>
  )
}

export default Register
