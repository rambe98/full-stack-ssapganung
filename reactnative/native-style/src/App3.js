import React from 'react';
import { View, Text } from 'react-native';
import { viewStyles, textStyles } from './styles';

export default function App3(){
  return (
    <View style={viewStyles.container}>
      <Text style={[textStyles.text, { color: 'green' }]}>
        Inline Styling - Text
      </Text>
      <Text style={[textStyles.text, textStyles.error]}>
        Inline Styling - Error
      </Text>
    </View>
  );
};