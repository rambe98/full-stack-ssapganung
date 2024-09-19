import logo from './logo.svg';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import Home from './Home';
import About from './About';
import React from 'react';
import Navbar from './NavBar';
import User from './User';
import UserProfile from './UserProfile';
import Dashboard from './Dashboard';
import NotFound from './NotFound';
import PrivateRoute from './PrivateRoute';
import Login from './Login';

function App() {
  const isAuthenticated = false; // 실제로는 사용자 인증 상태를 확인해야 한다.
  return (
    <div className="App">
      
        {/*
        <Navbar/>
          <Routes>
            <Route path="/home" element={<Home />} />
            <Route path="/about" element={<About />} />
          </Routes>*/}
          {/*
        <Routes>
        <Route path="/" element={<User />} />
        <Route path="/users/:id" element={<UserProfile />} />
        </Routes>
        */}
        {/*
        <Routes>
        <Route path="/dashboard/*" element={<Dashboard />} />
        </Routes>
        */}
        {/*
        <Routes>
      <Route path="/" element={<Home />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
*/}
    <Routes>
      <Route path="/login" element={<Login />} />
      <Route
        path="/dashboard"
        element={<PrivateRoute element={<Dashboard />} isAuthenticated={isAuthenticated} />}
      />
    </Routes>
    </div>
  );
}

export default App;
