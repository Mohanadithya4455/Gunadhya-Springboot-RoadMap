import axios from "axios"
import { API_BASE_URL } from "../../Urls/BaseUrl"

import { LOGIN_FAILURE, LOGIN_REQUEST, LOGIN_SUCCESS, REGISTER_FAILURE, REGISTER_REQUEST, REGISTER_SUCCESS } from "./auth.actionType";

export const loginRequest = (loginData) => async(dispatch)=>{
    dispatch({type:LOGIN_REQUEST})
    try {
        const {data} = await axios.post(API_BASE_URL+"/login",loginData.data);
        // if(data.jwt){
        //     localStorage.setItem("jwt",data.jwt);
        // }
         dispatch({type:LOGIN_SUCCESS,payload:data.jwt});
        // console.log("Logged in successfully jwt: "+data.jwt);
    } catch (error) {
        //console.log("Bad Credentials")
        dispatch({type:LOGIN_FAILURE,payload:error})
    }
}

export const RegisterRequest = (loginData) => async(dispatch)=>{
    dispatch({type:REGISTER_REQUEST})
    try {
        const {data} = await axios.post(API_BASE_URL+"/signup",loginData.data);
        // if(data.jwt){
        //     localStorage.setItem("jwt",data.jwt);
        // }
        
         dispatch({type:REGISTER_SUCCESS,payload:data.jwt});
        //console.log("jwt: "+data.jwt);
    } catch (error) {
        dispatch({type:REGISTER_FAILURE,payload:error})
    }
}