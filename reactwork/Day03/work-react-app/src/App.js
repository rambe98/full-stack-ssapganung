import logo from './logo.svg';
import './App.css';
import Sol1 from './Sol1.js';
import Sol2 from './Sol2.js';
import React, {useState} from 'react';
import StarPattern from './star.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Star Pattern</h1>
        <StarPattern />
      </header>
    </div>
  );
}

export default App;
