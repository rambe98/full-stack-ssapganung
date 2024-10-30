import React from 'react';
import { View, Text } from 'react-native';
//import { Header, Contents, Footer } from './components/Layout';
import { viewStyles, textStyles } from './styles';
import FlexDirectionTest from './components/flexDirectionTest';
import JustifyContentTest from './components/justifyContentTest';
import AlignItemsTest from './components/AlignItems';
import Shadowbox from './components/Shadowbox';
import { Styled } from './components/StyledComponent';
import Button from './components/Button';
import styled from 'styled-components';
import { Header, Contents, Footer } from './components/Signup';
const Container = styled.View`
    flex: 1;
    justfy-content: center;
    align-items: center;
    background-color: #fff;
`


export default function App() {
  return (
    <Container>
      {/*<Header />
      <Contents /> 
      <Footer />
      <FlexDirectionTest/>
      <JustifyContentTest/>
      <AlignItemsTest/>
      <Shadowbox/>
      <Styled/>
      <Button title='tlqkf'/>
      <Button title='rotoRl'/>*/}
      <Header />
      <Contents /> 
      <Footer />
    </Container>
  );
};
