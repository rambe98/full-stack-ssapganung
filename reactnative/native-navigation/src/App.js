import React from 'react';
import styled from 'styled-components';
import { NavigationContainer } from '@react-navigation/native';
import StackNavigation from '../navigations/Stack';
import TabNavigation from '../navigations/Tab';
import BookStack from '../navigations/BookStack';

const App = () => {
  return (
    <NavigationContainer>
        {/* <StackNavigation/> 
        <TabNavigation/>*/}
        <BookStack/>
    </NavigationContainer>
  );
};

export default App;