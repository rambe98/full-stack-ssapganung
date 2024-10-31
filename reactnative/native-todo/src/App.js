import React, { useState } from "react";
import styled, { ThemeProvider } from "styled-components/native";
import { theme } from "./theme";
import { Dimensions, StatusBar } from "react-native";
import Input from "./components/Input";
import { images } from "./image";
import IconButton from "./components/IconButton";
import Task from "./components/Task";


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
    const [newTask, setNewTask] = useState('');
    const width = Dimensions.get('window').width;
    const [tasks,setTasks] = useState({
        '1':{id:'1', text:'스껄',completed:false},
        '2':{id:'2', text:'응애',completed:true},
        '3':{id:'3', text:'킹아',completed:false},
        '4':{id:'4', text:'집가',completed:false},
    });
    const _handleTextChange = text => {
        setNewTask(text);
    }
    const _addTask = () => { //할일 추가
        const ID= Date.now().toString();
        const newTaskObject ={
            [ID]:{id:ID,text:newTask,completed:false},
        };
        setNewTask('');
        setTasks({...tasks, ...newTaskObject});
    };
    const _deleteTask= id=>{ //할일 제거
        const currentTasks=Object.assign({}, tasks);
        delete currentTasks[id];
        setTasks(currentTasks);
    };
    const _toggleTask = id=>{ //체크박스
        const currentTasks=Object.assign({}, tasks);
        currentTasks[id]['completed'] = !currentTasks[id]['completed'];
        setTasks(currentTasks);
    };
    const _updateTask = item=>{ //수정
        const currentTasks=Object.assign({}, tasks);
        currentTasks[item.id] = item;
        setTasks(currentTasks);
    };
    const _onBlur = ()=>{
        setNewTask('');
    };

    return (
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
                        .map(item=>(
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
    );
}
