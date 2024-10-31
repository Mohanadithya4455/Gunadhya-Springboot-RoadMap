
import { LOGIN_FAILURE, LOGIN_REQUEST, LOGIN_SUCCESS, REGISTER_FAILURE, REGISTER_REQUEST, REGISTER_SUCCESS } from "./auth.actionType"


const data={
    jwt:null,
    loading:false,
    error:null
}
export const authReducers = (state = data,action)=>{
            
    switch(action.type){
        case LOGIN_REQUEST:
        return {...state,loading:true,error:null}
        case LOGIN_SUCCESS:
            return {...state,jwt:action.payload,loading:false,error:null}
        case LOGIN_FAILURE:
            return {...state,loading:false,error:action.payload}
            case REGISTER_REQUEST:
                return {...state,loading:true,error:null}
                case REGISTER_SUCCESS:
                    return {...state,jwt:action.payload,loading:false,error:null}
                case REGISTER_FAILURE:
                    return {...state,error:action.payload,loading:false}   
                    default:
                        return state
    }
}