import React from 'react';
import { FlatList, Button, View, Text, StyleSheet } from 'react-native';

const books = [
  { id: '1', title: '홍길동전', description: '이것은 홍길동전의 설명입니다.' },
  { id: '2', title: '콩쥐팥쥐', description: '이것은 콩쥐팥쥐의 설명입니다.' },
  { id: '3', title: '신데렐라', description: '이것은 신데렐라의 설명입니다.' },
  { id: '4', title: '우투리전', description: '이것은 우투리전의 설명입니다.' },
  { id: '5', title: '운수좋은날', description: '이것은 운수좋은날의 설명입니다.' },
];

const BookListScreen = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <FlatList
        data={books}
        keyExtractor={(item) => item.id}
        renderItem={({ item }) => (
          <View style={styles.bookItem}>
            <Text style={styles.bookTitle}>{item.title}</Text>
            <Button
              title="상세 보기"
              onPress={() => navigation.navigate('BookDetail', { bookId: item.id })}
            />
          </View>
        )}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: 20,
  },
  bookItem: {
    padding: 10,
    borderBottomWidth: 1,
  },
  bookTitle: {
    fontSize: 18,
  },
});

export default BookListScreen;