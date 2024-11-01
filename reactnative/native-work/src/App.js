import React, { useState } from 'react';
import { StyleSheet, View, Text, TextInput } from 'react-native';
import CalculatorButton from './components/CalculatorButton'; // 컴포넌트 임포트

const App = () => {
  const [num1, setNum1] = useState('');
  const [num2, setNum2] = useState('');
  const [result, setResult] = useState('결과는 여기에 나옴');

  const calculate = (operation) => {
    const number1 = parseFloat(num1);
    const number2 = parseFloat(num2);
    let res = '';

    if (!num1 || !num2) return;

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

  return (
    <View style={styles.container}>
      <View style={styles.inputContainer}>
        <TextInput
          style={styles.input}
          keyboardType="numeric"
          placeholder="첫 번째 숫자를 입력하세요"
          value={num1}
          onChangeText={setNum1}
        />
        <TextInput
          style={styles.input}
          keyboardType="numeric"
          placeholder="두 번째 숫자를 입력하세요"
          value={num2}
          onChangeText={setNum2}
        />
      </View>
      <Text style={styles.result}>{result}</Text>
      <View style={styles.buttonContainer}>
        <CalculatorButton title="+" onPress={() => calculate('ADD')} />
        <CalculatorButton title="-" onPress={() => calculate('SUB')} />
        <CalculatorButton title="*" onPress={() => calculate('MUL')} />
        <CalculatorButton title="/" onPress={() => calculate('DIV')} />
      </View>
      
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
  inputContainer: {
    width: '100%',
    marginBottom: 20,
  },
  input: {
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 5,
    padding: 10,
    marginBottom: 10,
    fontSize: 20,
  },
  buttonContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    width: '100%',
    marginTop: 30,
  },
  result: {
    fontSize: 30,
    marginTop: 20,
    textAlign: 'center',
  },
});

export default App;
