import React from "react";
import { View,StyleSheet, Text } from "react-native";
import Counter from "./components/Counter";
import ThemeComponent from "./components/ThemeComponent";
import { ThemeProvider  } from "./contexts/ThemeContext";
import { StatusBar } from 'react-native';

const exam3and7 = ()=>{
    return(
            // 3번 문제 
            // <View style={styles.container}>
            // <Counter/> 
            // </View>
            // 7번 문제 
            <ThemeProvider>
                <StatusBar barStyle="dark-content" />
                <ThemeComponent />
            </ThemeProvider>
    )
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        justifyContent:'center',
        alignItems:'center',
        backgroundColor:'white',
    },
    title:{
        fontSize:30,
        marginBottom:30
    }
})

export default exam3and7;