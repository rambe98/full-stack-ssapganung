import React from 'react';
import { View, Text } from 'react-native';
import { Header, Contents, Footer } from './components/Layout';
import { viewStyles, textStyles } from './styles';
import FlexDirectionTest from './components/flexDirectionTest';
import JustifyContentTest from './components/justifyContentTest';
import AlignItemsTest from './components/AlignItems';
import Shadowbox from './components/Shadowbox';

export default function App() {
  return (
    <View style={viewStyles.container}>
      {/*<Header />
      <Contents /> 
      <Footer />
      <FlexDirectionTest/>
      <JustifyContentTest/>
      <AlignItemsTest/>*/}
      <Shadowbox/>
      
    </View>
  );
};
