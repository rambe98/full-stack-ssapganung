// navigations/UserStack.js
import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';
import UserHomeScreen from '../screens/User/UserHomeScreen';
import UserListScreen from '../screens/User/UserListScreen';
import UserProfileScreen from '../screens/User/UserProfileScreen';

const Stack = createStackNavigator();

const UserStack = () => {
  return (
    <Stack.Navigator
      initialRouteName="UserHomeScreen"
      screenOptions={{
        headerStyle: { backgroundColor: 'black', height: 100 },
        headerTintColor: '#fff',
        headerTitleAlign: 'center',
        headerTitleStyle: { fontSize: 24 },
      }}
    >
      <Stack.Screen
        name="UserHomeScreen"
        component={UserHomeScreen}
        options={{ headerShown: false }}
      />
      <Stack.Screen
        name="UserListScreen"
        component={UserListScreen}
        options={{ headerTitle: '유저 목록' }}
      />
      <Stack.Screen
        name="UserProfileScreen"
        component={UserProfileScreen}
        options={{ headerTitle: '유저 프로필' }}
      />
    </Stack.Navigator>
  );
};

export default UserStack;
