import React from 'react'
import styled from 'styled-components/native'
import Button from './components/Button'
import Counter from './components/Counter'
import Form from './components/Form'
import { useState } from 'react'
import Timer from './components/Timer'

const Container = styled.View`
    flex:1;
    background-color: #fff;
    justify-content : center;
    align-items: center;
`


const App = () => {
    const [isFormVisible, setFormVisible] = useState(true);

    const toggleForm = () => {
        setFormVisible(prev => !prev);
    };
    return (<Container>
        {isFormVisible && <Form />}
        <Button title={isFormVisible ? "Hide" : "Show"} onPress={toggleForm} />
    </Container>)    
}

export default App;