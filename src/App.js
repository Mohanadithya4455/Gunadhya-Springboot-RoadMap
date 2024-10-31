
import './App.css';
import Authentication from './pages/Authentication/Authentication';
import { Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div>
      <Routes>

          <Route path="/*" element={<Authentication/>}/>
      </Routes>
     
    </div>
  );
}

export default App;
