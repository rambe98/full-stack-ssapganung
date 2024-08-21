/*	Stream
	기존의 Java에서 컬렉션 데이터를 처리할 때 특정 조건에 따라 필터링을 하려면 복잡한 과정을 거쳐야 했다.

	반면에 SQL문법의 경우 사용자가 원하는 조건의 데이터를 목록을 검색할 때 명시적이고 
	간단한 방법을 이용했는데 Java8 에서 새로 추가된 기능인 스트림은 	Java의 컬렉션 
	데이터에 대해 SQL 질의문 처럼 데이터를 처리할 수 있는 기능을 가지고 있습니다.
	
	Stream이란?
	기존 루프문 처리의 문제점
	기존 Java에서 컬렉션 데이터를 처리할때는 for, foreach 루프문을 사용하면서 
	컬렉션 내의 요소들을 하나씩 다루었습니다.
	간단한 처리나 컬렉션의 크기가 작으면 큰 문제가 아니지만 복잡한 처리가 필요하거나
	컬렉션의 크기가 커지면 루프문의 사용은 성능저하를 일으키게 되었습니다.

	스트림의 등장
	스트림은 Java8에서 추가된 기능으로 컬렉션 데이터를 선언형으로 쉽게 처리할수 있습니다. 
	복잡한 루프문을 사용하지 않아도 되며 루프문을 중첩해서 사용해야 되는 최악의 경우도 
	더이상 없어졌습니다.
	
	스트림은 '데이터의 흐름'입니다. 배열 또는 컬렉션 객체에 함수 여러개를 조합해서 
	원하는 결과를 필터링하고 가공된 결과를 얻을 수 있습니다.
	또한 람다식을 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있습니다.
	즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.

	스트림의 특징
	스트림은 데이터 소스로 부터 데이터를 읽기만 할 뿐, 데이터 소스를 변경하지 않는다.
	스트림은 한번 사용하면 닫혀서 다시 사용할 수 없다.
	(다시 사용하려면 스트림을 다시 생성해야 한다.)
	
	스트림 사용 과정
	생성하기 : 스트림 객체 생성 
	가공하기 : 필터링(filtering) 및 맵핑(mapping)등 원하는 결과를 만들어가는 중간작업
	결과만들기 : 최종적으로 결과를 만들어내는 작업
	스트림 객체 생성
	보통 배열과 컬렉션을 이용해서 스트림을 만들지만 이 외에도 다양한 방법으로 스트림을 만들수 있다.

	배열을 통한 생성
	Arrays 클래스 -> static stream()
	Stream.of(T[] t)
	Stream.of(T...values)
	
	스트림의 연산
	중간연산
	연산 결과가 스트림인 연산, 스트림에 연속해서 중간 연산할 수 있다.

	스트림의 중간 연산 목록
	연산의 결과가 스트림이면 중간연산
	
	중간 연산					설명
	Stream<T> distinct()	중복을 제거
	Stream<T> filter(Predicate<T> predicate)	조건에 안 맞는 요소 제외
	Stream<T> limit(long maxSize)	스트림의 일부를 잘라낸다
	Stream<T> skip(long n)	스트림의 일부를 건너뛴다
	Stream<T> peek(Consumer<T> action)	스트림의 요소에 작업 수행
	Stream<T> sorted()
	Stream<T> sorted(Comparator<T> comparator)	스트림의 요소를 정렬한다.
	Stream<R> map(Function<T,R> mapper)
	DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
	IntStream mapToInt(ToIntFunction<T> mapper)

	Stream<R> flatMap(Function<T, Stream<R>> mapper)
	DoubleStream flatMapToDouble(Function<T, DoubleStream> m)
	IntStream flatMapToInt(Function<T, IntStream> m)
	LongStream flatMapToLong(Function<T, LongStream> m)	     스트림의 요소를 변환한다.
	
	최종연산
	연산 결과가 스트림이 아닌 연산.
	스트림의 요소를 소모하므로 단 한번만 가능
	stream.distinct().limit(5).sorted().forEach(x -> System.out.println(x));
      
	distinct(), limit(5), sorted() - 중간연산
	forEach - 최종연산
	
	스트림의 최종 연산 목록
	연산의 결과가 스트림이 아니면 최종연산
	최종 연산	설명
	void forEach(Consumer<? super T> action)	void forEachOrdered(Consumer<? super T> action)
	long count())	스트림의 요소의 개수 반환
	Optional<T> max(Comparator<? super T> comparator)	스트림의 최대값/최소값을 반환
	Optional<T> min(Comparator<? super T> comparator)	스트림의 최대값/최소값을 반환
	Optional<T> findAny() // 아무거나 하나
	Optional<T> findFirst() // 첫 번째 요소	스트림의 요소를 하나 반환
	boolean allMatch(Predicate<T> p) // 모두 만족하는지 주어진 조건을 모든 요소가 만족시키는지, 만족시키지 않는지 확인
	boolean anyMatch(Predicate<T> p) // 하나라도 만족하는지 주어진 조건을 모든 요소가 만족시키는지, 만족시키지 않는지 확인
	boolean noneMatch(Predicate<T> p) // 모두 만족하지 않는지	주어진 조건을 모든 요소가 만족시키는지, 만족시키지 않는지 확인
	Object[] toArray() 
	A[] toArray(IntFunction<A[]> generator)	스트림의 모든 요소를 배열로 변환
	Optional<T> reduce(BinaryOperator<T> accumulator) 스트림 요소를 하나씩 줄여가면서(리듀싱) 계산한다.
	T reduce(T identity, BinaryOperator<T> accumulator)	스트림 요소를 하나씩 줄여가면서(리듀싱) 계산한다.
	R collect(Collector<T,A,B> collector)	스트림의 요소를 수집한다.
	주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환하는데 사용한다.
	
	
	
	
	
	스트림의 최종 연산
	최종 연산은 스트림의 요소를 소모해서 결과를
	최종 연산후에는 스트림이 닫히게 되고 더 이상 사용할 수 없다.
	forEach()
	forEach()는 peek()와 달리 스트림의 요소를 소모하는 최종연산이다
	반환 타입이 void이므로 스트림의 요소를 출력하는 용도로 사용된다.
	
	void forEach(Consumer<? super T> action)

	조건 검사 - allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
	allMatch() : 지정된 조건에 모든 요소가 일치하는지
	anyMatch() : 지정된 조건에 일부 요소가 일치하는지
	noneMatch() : 지정된 조건에 어떤 요소도 일치하지 않는지
	findFirst() : 지정된 조건에 일치하는 첫 번째 것을 반환
	findAny() : 지정된 조건에 일치하는 첫 번째 것을 반환(병렬 스트림에서 사용)
	boolean allMatch(Predicate<? super T> predicate)
	boolean anyMatch(Predicate<? super T> predicate)
	boolean noneMatch(Predicate<? super T> predicate)
 */


package stream;

public class Explain {

}
