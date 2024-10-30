import React from 'react';
import { StyleSheet, View, Text,TextInput } from 'react-native';
import Button from './Button';
import styled from 'styled-components';

export const Header = () => {
  return (
    <View style={[styles.container, styles.header]}>
      <Text style={styles.text}>회원가입</Text>
    </View>
  );
};

export const Contents = () => {
  return (
    <View style={[styles.container, styles.contents]}>
      <Text style={styles.text2}>이름</Text>
      <TextInput placeholder='이름' style={styles.input}/>
      <Text style={styles.text2}>이메일</Text>
      <TextInput placeholder='이메일' style={styles.input}/>
      <Text style={styles.text2}>비밀번호</Text>
      <TextInput placeholder='비밀번호' style={styles.input}/>
      <Text style={styles.text2}>비밀번호 확인</Text>
      <TextInput placeholder='비밀번호 확인' style={styles.input}/>
    </View>
  );
};

const ButtonContainer = styled.Pressable`
    background-color:#007AFF;
    border-radius:15px;
    padding:15px 40px;
    margin: 10px 0px;
    justify-content: center;
`;
const Title = styled.Text`
    font-size:20px;
    font-weight:600;
    color:#fff;
`;

export const Footer = () => {
  return (
    <ButtonContainer>
    <Title>가입하기</Title>
    </ButtonContainer>
  );
};



const styles = StyleSheet.create({
  container: {
    width: '100%',
    alignItems: 'center',
    justifyContent: 'center',
    height: 80,
  },
  header: {
    
  },
  contents: {
    flex: 1,
    height: 640,
  },
  footer: {
    backgroundColor: '#3498db',
  },
  text: {
    fontSize: 40,
  },
  text2: {
    fontSize: 26,
  },
  input:{
    height:40,
    borderColor: 'gray',
    borderWidth: 1,  
    width:'95%'
  }
});