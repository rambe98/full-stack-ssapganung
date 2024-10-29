import React from "react";
import { View, StyleSheet, Text } from "react-native";

const Total = ({ numbers }) => {
    // 숫자 배열의 합계 계산
    const sum = numbers.reduce((acc, curr) => acc + curr, 0);

    return (
        <View style={styles.container}>
            <Text style={styles.result}>합계: {sum}</Text>
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'white',
        padding: 20,
    },
    result: {
        marginTop: 20,
        fontSize: 24,
        color: 'black',
    },
});

export default Total;
