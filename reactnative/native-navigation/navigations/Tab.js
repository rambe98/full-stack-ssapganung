import React from 'react';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { Mail, Meet, Settings } from '../screens/TabScreens';
import { MaterialCommunityIcons } from '@expo/vector-icons';

const TabIcon = ({ name, size, color }) => {
  return <MaterialCommunityIcons name={name} size={size} color={color} />;
};

const Tab = createBottomTabNavigator();

const TabNavigation = () => {
  return (
    <Tab.Navigator
      initialRouteName="Settings"
      screenOptions={{
        // Tab bar 스타일
        tabBarStyle: {
          backgroundColor: '#54b7f9',
          borderTopColor: '#ffffff',
          borderTopWidth: 2,
        },
        // Tab 아이콘 색상
        tabBarActiveTintColor: '#ffffff',
        tabBarInactiveTintColor: '#cfcfcf',
        // 라벨 표시 여부
        tabBarShowLabel: false,
        tabBarLabelPosition: 'beside-icon', // 라벨 위치
        headerStyle: {
            backgroundColor: '#54b7f9', // 헤더 배경 색상을 탭바와 동일하게 설정
        },
      }}
    >
      <Tab.Screen
        name="Mail"
        component={Mail}
        options={{
          tabBarIcon: ({ focused, size, color }) => (
            <TabIcon
              name={focused ? 'email' : 'email-outline'}
              size={size}
              color={color}
            />
          ),
        }}
      />
      <Tab.Screen
        name="Meet"
        component={Meet}
        options={{
          tabBarIcon: ({ focused, size, color }) => (
            <TabIcon
              name={focused ? 'video' : 'video-outline'}
              size={size}
              color={color}
            />
          ),
        }}
      />
      <Tab.Screen
        name="Settings"
        component={Settings}
        options={{
          tabBarIcon: ({ focused, size, color }) => (
            <TabIcon
              name={focused ? 'cog' : 'cog-outline'}
              size={size}
              color={color}
            />
          ),
        }}
      />
    </Tab.Navigator>
  );
};

export default TabNavigation;
