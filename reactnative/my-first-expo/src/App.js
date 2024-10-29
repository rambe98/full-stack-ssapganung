import React from "react";
import { View,StyleSheet, Text } from "react-native";


const App = ()=>{
    return(
        <View style={styles.container}>
            <Text style={styles.title} >스껄</Text>
        </View>
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
        fontSize:30
    }
})

export default App;