import React from "react";
import { View, Text,StyleSheet } from "react-native";

const ItemList = ({fruits}) =>{
    return(
        <View style={styles.container}>
            {fruits.map((item,index) =>(
                <Text key={index} style={{fontSize: 24}}>{item}</Text>
            ))}
        </View>
    )
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'white',
        padding: 20,
    }
});
export default ItemList;