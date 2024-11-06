import React from 'react'
import styled, { ThemeProvider as StyledThemeProvider } from 'styled-components/native'
import User from './components/User'
import UserContext, { UserProvider } from './contexts/User';
import Input from './components/Input';
import { ThemeProvider } from './contexts/ThemeContext';
import ThemeComponent from './components/ThemeComponent';
import CartScreen from './components/CartScreen';
import CartContext, { CartProvider } from './contexts/CartContext';
import { UserProvider2 } from './contexts/UserContext';
import HomeScreen from './components/HomeScreen';


const Container = styled.View`
    flex : 1;
    background-color : #ffffff;
    justify-content : center;
    align-items : center;
`;

const App = () => {
    return (
            <UserProvider2>
                <HomeScreen/>
            </UserProvider2>
    );
};

export default App;