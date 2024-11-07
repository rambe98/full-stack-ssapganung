import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';
import BookMainScreen from '../screens/Book/BookMainScreen '; 
import BookListScreen from '../screens/Book/BookListScreen';
import BookDetailScreen from '../screens/Book/BookDetailScreen';

const Stack = createStackNavigator();

const BookStack = () => {
  return (
    <Stack.Navigator initialRouteName="BookMain">
      <Stack.Screen name="BookMain" component={BookMainScreen} />
      <Stack.Screen name="BookList" component={BookListScreen} />
      <Stack.Screen name="BookDetail" component={BookDetailScreen} />
    </Stack.Navigator>
  );
};

export default BookStack;