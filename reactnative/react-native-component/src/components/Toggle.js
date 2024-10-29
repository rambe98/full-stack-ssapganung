import React from "react";
import { View, StyleSheet, Text, Pressable, Button } from "react-native";
import MyButton from "./Mycomponents";
import { useState } from "react";

const ToggleText = ()=>{
    const [isVisible, setIsVisible] = useState(true);

    const toggleVisibility = () => {
        setIsVisible(!isVisible);
    };

    return (
        <View style={styles.container}>
        {isVisible && ( // 텍스트의 가시성을 조건부로 렌더링
            <Text style={styles.text}>응애</Text>
        )}
        <Pressable style={styles.button} onPress={toggleVisibility}>
            <Text style={styles.buttonText}>
                    {isVisible ? "숨기기" : "보이기"} {/* 버튼 텍스트 변경 */}
            </Text>
        </Pressable>
    </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'white',
    },
    text: {
        fontSize: 24,
        color: 'black',
        marginBottom: 20,
    },
    button: {
        backgroundColor: '#3498db',
        padding: 16,
        borderRadius: 8,
    },
    buttonText: {
        color: 'white',
        fontSize: 18,
    },
});

export default ToggleText;