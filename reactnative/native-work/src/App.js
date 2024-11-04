import React, { useState } from 'react';
import { StyleSheet, View, Text, TextInput } from 'react-native';
import CalculatorButton from './components/CalculatorButton'; // 컴포넌트 임포트
import styled from 'styled-components';

const App = () => {
  const [num1, setNum1] = useState('');
  const [num2, setNum2] = useState('');
  const [result, setResult] = useState('결과는 여기에 나옴');
  const [bgColor, setBgColor] = useState('#fff');

  const calculate = (operation) => {
    const number1 = parseFloat(num1);
    const number2 = parseFloat(num2);
    let res = '';

    if (isNaN(number1) || isNaN(number2)) {
      setResult('유효한 숫자를 입력하세요');
      return;
    }

    switch (operation) {
      case 'ADD':
        res = number1 + number2;
        break;
      case 'SUB':
        res = number1 - number2;
        break;
      case 'MUL':
        res = number1 * number2;
        break;
      case 'DIV':
        res = number1 / number2;
        break;
      default:
        break;
    }
    setResult(`${num1} ${operation === 'ADD' ? '+' : operation === 'SUB' ? '-' : operation === 'MUL' ? '*' : '/'} ${num2} = ${res}`);
  };
  const changeBackgroundColor = () => {
    const randomColor = `#${Math.floor(Math.random() * 16777215).toString(16)}`;
    setBgColor(randomColor);
  };

  return (
    <AppContainer style={{ backgroundColor: bgColor }}>
      <InputContainer>
        <TextInput
          style={inputStyle}
          keyboardType="numeric"
          placeholder="첫 번째 숫자를 입력하세요"
          value={num1}
          onChangeText={setNum1}
        />
        <TextInput
          style={inputStyle}
          keyboardType="numeric"
          placeholder="두 번째 숫자를 입력하세요"
          value={num2}
          onChangeText={setNum2}
        />
      </InputContainer>
      <Text style={resultStyle}>{result}</Text>
      <ButtonContainer>
        <CalculatorButton title="+" onPress={() => calculate('ADD')} />
        <CalculatorButton title="-" onPress={() => calculate('SUB')} />
        <CalculatorButton title="*" onPress={() => calculate('MUL')} />
        <CalculatorButton title="/" onPress={() => calculate('DIV')} />
      </ButtonContainer>
      <ChangeColorButton onPress={changeBackgroundColor}>
        <ButtonText>배경색 변경</ButtonText>
      </ChangeColorButton>
    </AppContainer>
  );
};

const AppContainer = styled.View`
  flex: 1;
  justify-content: center;
  align-items: center;
  padding: 20px;
`;

const InputContainer = styled.View`
  width: 100%;
  margin-bottom: 20px;
`;

const ButtonContainer = styled.View`
  flex-direction: row;
  justify-content: space-between;
  width: 100%;
  margin-top: 30px;
`;

const ChangeColorButton = styled.TouchableOpacity`
  background-color: skyblue;
  border-radius: 25px;
  padding: 15px;
  margin-top: 20px;
  width: 100%;
  align-items: center;
`;

const ButtonText = styled.Text`
  color: #fff;
  font-size: 24px;
`;

const inputStyle = {
  borderWidth: 1,
  borderColor: '#ccc',
  borderRadius: 5,
  padding: 10,
  marginBottom: 10,
  fontSize: 20,
};

const resultStyle = {
  fontSize: 30,
  marginTop: 20,
  textAlign: 'center',
};

export default App;

