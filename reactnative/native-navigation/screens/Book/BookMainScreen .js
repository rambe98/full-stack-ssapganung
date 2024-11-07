import React from 'react';
import { Button, View, StyleSheet } from 'react-native';

const BookMainScreen = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <Button
        title="도서 목록 보기"
        onPress={() => navigation.navigate('BookList')}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default BookMainScreen;