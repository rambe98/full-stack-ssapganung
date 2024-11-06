import React, { useState } from 'react';
import { View, Text, Button, TextInput, StyleSheet } from 'react-native';
import { useUser } from '../contexts/UserContext';

const HomeScreen = () => {
    const { user, login, logout } = useUser(); // UserContext에서 로그인 정보와 함수 가져오기
    const [name, setName] = useState('');

    // 로그인 폼 처리
    const handleLogin = () => {
        login(name); // 이름을 전달하여 로그인
        setName(''); // 로그인 후 입력 필드를 초기화
    };

    return (
        <View style={styles.container}>
            {!user.isLoggedIn ? (
                // 로그인되지 않았을 경우 로그인 폼 보여주기
                <>
                    <TextInput
                        style={styles.input}
                        value={name}
                        onChangeText={setName}
                        placeholder="Enter your name"
                    />
                    <Button title="Login" onPress={handleLogin} />
                </>
            ) : (
                // 로그인된 경우 사용자 정보와 로그아웃 버튼 보여주기
                <>
                    <Text style={styles.welcomeText}>Welcome, {user.name}님</Text>
                    <Button title="Logout" onPress={logout} />
                </>
            )}
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        padding: 20,
    },
    input: {
        borderWidth: 1,
        borderColor: '#ccc',
        padding: 10,
        marginBottom: 20,
        width: '80%',
    },
    welcomeText: {
        fontSize: 24,
        marginBottom: 20,
    },
});

export default HomeScreen;
