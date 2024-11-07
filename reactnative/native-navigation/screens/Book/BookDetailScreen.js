import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

const books = [
  { id: '1', title: '홍길동전', description: '이것은 홍길동전의 설명입니다.' },
  { id: '2', title: '콩쥐팥쥐', description: '이것은 콩쥐팥쥐의 설명입니다.' },
  { id: '3', title: '신데렐라', description: '이것은 신데렐라의 설명입니다.' },
  { id: '4', title: '우투리전', description: '이것은 우투리전의 설명입니다.' },
  { id: '5', title: '운수좋은날', description: '이것은 운수좋은날의 설명입니다.' },
];

const BookDetailScreen = ({ route }) => {
  const { bookId } = route.params;
  const book = books.find((book) => book.id === bookId);

  if (!book) {
    return (
      <View style={styles.container}>
        <Text>책을 찾을 수 없습니다.</Text>
      </View>
    );
  }

  return (
    <View style={styles.container}>
      <Text style={styles.title}>{book.title}</Text>
      <Text style={styles.description}>{book.description}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    alignItems: 'center',
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  description: {
    marginTop: 20,
    fontSize: 16,
  },
});

export default BookDetailScreen;