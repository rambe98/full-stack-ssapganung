import React from "react";
import { View,StyleSheet, Text,Button } from "react-native";
import SV from './ScrollView';
import MyButton from "./components/Mycomponents";
import Counter from "./components/Counter";
import Total from "./components/Total";
import ItemList from "./components/ItemList";

const App = ()=>{
    const numbers = [1, 2, 3, 4,5,6,7,8,9]; 
    let fruits = ['사과','바나나','딸기','키위','복숭아'];

    return(
        <View style={styles.container}>
            {/* <Text style={styles.title}>이것은 버튼이여!</Text>
            <Button 
                title="뽀오오잉" 
                color='red' 
                backgroundColor = 'gray'
                style={styles.button} 
                onPress={()=> alert('dd!')}
            />
            <MyButton title="킹  아" onPress={()=> alert('props')}/>
            <MyButton title="킹  아" onPress={()=> alert('children')}>줴엔장</MyButton>
            <MyButton onPress={()=> alert('default')}/>

            <Counter/> */}
            <Total numbers={numbers} />
            <ItemList fruits={fruits}/>
            
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
        fontSize:30,
        marginBottom:30
    }
})

export default App;