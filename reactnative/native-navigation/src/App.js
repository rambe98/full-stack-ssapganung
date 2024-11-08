import React from 'react';
import styled from 'styled-components';
import { NavigationContainer } from '@react-navigation/native';
import StackNavigation from '../navigations/Stack';
import TabNavigation from '../navigations/Tab';
import BookStack from '../navigations/BookStack';
import UserStack from '../navigations/UserStack';

const App = () => {
  return (
    <NavigationContainer>
        {/* <StackNavigation/> 
        <BookStack/>
        <UserStack/>*/}
        <TabNavigation/>
    </NavigationContainer>
  );
};

export default App;