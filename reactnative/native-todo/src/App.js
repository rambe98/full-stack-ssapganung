import React, { useState } from "react";
import styled, { ThemeProvider } from "styled-components/native";
import { theme } from "./theme";
import { Dimensions, StatusBar } from "react-native";
import Input from "./components/Input";
import { images } from "./image";
import IconButton from "./components/IconButton";
import Task from "./components/Task";
import AsyncStorage from '@react-native-async-storage/async-storage';
import AppLoading from 'expo-app-loading';

const Container = styled.SafeAreaView`
    flex:1;
    background-color: ${({ theme }) => theme.background};
    align-items: center;
    justify-content:flex-start;
`;
const Title = styled.Text`
    font-size: 40px;
    font-weight:600;
    color: ${({ theme }) => theme.main};
    align-self: flex-start;
    margin:0px 20px;
`;
const List = styled.ScrollView`
    flex:1;
    width: ${({ width }) => width - 40}px;
`;

export default function App() {
    const width = Dimensions.get('window').width;

    const [isReady, SetIsReady] = useState(false);
    const [newTask, setNewTask] = useState('');
    const [tasks, setTasks] = useState({});

    const _saveTasks = async tasks => {
        try {
            await AsyncStorage.setItem('tasks', JSON.stringify(tasks));
            setTasks(tasks);
        } catch (e) {
            console.error(e);
        }
    };
    const _loadTasks = async () => {
        const loadedTasks = await AsyncStorage.getItem('tasks');
        setTasks(JSON.parse(loadedTasks || '{'));
    };
    const _handleTextChange = text => {
        setNewTask(text);
    };
    const _addTask = () => { //할일 추가
        const ID = Date.now().toString();
        const newTaskObject = {
            [ID]: { id: ID, text: newTask, completed: false },
        };
        setNewTask('');
        _saveTasks({ ...tasks, ...newTaskObject });
    };
    const _deleteTask = id => { //할일 제거
        const currentTasks = Object.assign({}, tasks);
        delete currentTasks[id];
        _saveTasks(currentTasks);
    };
    const _toggleTask = id => { //체크박스
        const currentTasks = Object.assign({}, tasks);
        currentTasks[id]['completed'] = !currentTasks[id]['completed'];
        _saveTasks(currentTasks);
    };
    const _updateTask = item => { //수정
        const currentTasks = Object.assign({}, tasks);
        currentTasks[item.id] = item;
        _saveTasks(currentTasks);
    };
    const _onBlur = () => {
        setNewTask('');
    };

    return isReady ? (
        <ThemeProvider theme={theme}>
            <Container>
                <Title>TODO List</Title>
                <StatusBar
                    barStyle="light-content"
                    backgroundColor={theme.background}
                />
                <Input
                    placeholder="+ Add Task"
                    value={newTask}
                    onChangeText={_handleTextChange}
                    onSubmitEditing={_addTask}
                    onBlur={_onBlur}
                />
                <List width={width}>
                    {Object.values(tasks)
                        .reverse()
                        .map(item => (
                            <Task
                                key={item.id}
                                item={item}
                                deleteTask={_deleteTask}
                                toggleTask={_toggleTask}
                                updateTask={_updateTask}
                            />
                        ))}
                </List>

            </Container>
        </ThemeProvider>
    ) : (
        <AppLoading
            startAsync={_loadTasks}
            onFinish={()=>SetIsReady(true)}
            onError={console.error}
        />
    );
}
