import { applyMiddleware, combineReducers, legacy_createStore } from "redux";
import { thunk } from "redux-thunk";
import { authReducers } from "./Auth/auth.reducers";

const allReducers = combineReducers({
auth:authReducers
})
export const store=legacy_createStore(allReducers,applyMiddleware(thunk));