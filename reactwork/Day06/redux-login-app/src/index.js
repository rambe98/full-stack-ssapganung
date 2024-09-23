import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import AuthApp from './App';
import reportWebVitals from './reportWebVitals';
import { Provider } from 'react-redux'; // Redux 스토어를 React 앱에 연결하기 위해 사용
import store from './store'; // Redux 스토어 불러오기

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Provider store={store}> 
    <AuthApp />
  </Provider>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
