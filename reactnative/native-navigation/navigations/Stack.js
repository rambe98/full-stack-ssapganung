import React from "react";
import { createStackNavigator } from "@react-navigation/stack";
import Home from "../screens/Home";
import List from "../screens/List";
import Item from "../screens/Item";
import {MaterialCommunityIcons} from '@expo/vector-icons';
import { Platform } from "react-native";


const Stack = createStackNavigator();

const StackNavigation = () => {
    return(
        <Stack.Navigator 
            initialRouteName="Home"
            screenOptions={{
              cardStyle:{backgroundColor:'#ffffff'},
              headerStyle:{
                height: 110,
                backgroundColor: 'black',
                borderBottomWidth: 5,
                borderBottomColor:'#6ee2ffff'},
              headerTitleStyle: {color:'#6ee2ffff',fontSize: 24},
              headerTitleAlign: 'center',
              headerTintColor : '#6ee2ffff',
              headerTitle:({style}) =>(
                <MaterialCommunityIcons name="react" style={style}/>
              ),
          }}>
            <Stack.Screen name="Home" component={Home} options={{headerShown:false}} />
            <Stack.Screen 
              name="List" 
              component={List}
              options={{
                headerTitle:'List Screen',
                //headerBackTitleVisible: true,
                // headerBackTitle:'prev',
                headerTitleStyle: {color:'#6ee2ffff',fontSize: 24},
                // headerBackImage:({tintColor})=>{
                //     const style={
                //         marginRight:5,
                //         marginLeft:Platform.OS === 'ios' ? 11:0,};
                //     return(
                //         <MaterialCommunityIcons 
                //             name="keyboard-backspace"
                //             size={30}
                //             color={tintColor}
                //             style={style}/>
                //     )
                // }
              }}/>
            <Stack.Screen name="Detail" component={Item} />
        </Stack.Navigator>
    )
}
export default StackNavigation;