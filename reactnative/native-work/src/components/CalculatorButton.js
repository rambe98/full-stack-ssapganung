// components/CalculatorButton.js
import React from 'react';
import { StyleSheet, Button } from 'react-native';

const CalculatorButton = ({ title, onPress }) => {
  return (
    <Button title={title} onPress={onPress} />
  );
};

const styles = StyleSheet.create({
  button: {
    flex: 1,
    backgroundColor: '#6200ee', // 버튼 색상
    borderRadius: 25, // 둥근 모서리
    paddingVertical: 15, // 수직 패딩
    margin: 5,
    alignItems: 'center', // 텍스트 중앙 정렬
    justifyContent: 'center', // 텍스트 중앙 정렬
  },
  buttonText: {
    color: '#fff', // 텍스트 색상
    fontSize: 24, // 텍스트 크기
  },
});

export default CalculatorButton;
