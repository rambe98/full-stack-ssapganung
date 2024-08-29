SELECT ENAME, DEPTNO, 
CASE WHEN DEPTNO = 10 THEN 'NEW YORK'
	 WHEN DEPTNO = 20 THEN 'DALLAS'
	 ELSE 'UNKOWN'
END AS LOC_NAME
FROM EMP WHERE JOB = 'MANAGER';

-- 직종이 'IT_PROG'인 사람들의 평균 급여
SELECT AVG(SALARY) FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG';
-- 위아래 둘 다 같은 의미를 내포한다.
SELECT AVG(CASE JOB_ID WHEN 'IT_PROG' THEN SALARY END)
FROM EMPLOYEES;

-- CASE와 WHEN 사이에 비교하고자 하는 컬럼을 넣고
-- WHEN과 THEN 사이에 비교하고자 하는 값을 넣어 비교하는 방법

-- EMP 테이블에서 SAL이 3000이상이면 HIGH, 1000이상이면 MID
-- 둘 다 아니면 LOW를 사원명 (ENAME), 급여(SAL), 등급(GRADE)순으로 조회하시오

SELECT ENAME ,SAL,
CASE WHEN SAL >= 3000 THEN 'HIGH'
	 WHEN SAL >= 1000 THEN 'MID'
	 ELSE 'LOW'
END AS GRADE 
FROM EMP;

-- STADIUM 테이블에서 SEAT_COUNT(좌석수)가 0이상 30000이하이면'S'
-- 30001이상 50000이하면 'M' 다 아니면 'L'을 경기장 이름, 좌석 수 , 크기 순으로 조회

SELECT STADIUM_NAME AS 경기장이름, SEAT_COUNT AS 좌석수,
CASE WHEN SEAT_COUNT BETWEEN 0 AND 30000 THEN 'S'
	 -- 케이스 문의 중첩이 가능함
	 ELSE 
		 CASE WHEN SEAT_COUNT BETWEEN 30001 AND 50000 THEN 'M'
	 	 ELSE 'L'
	 	 END
END AS 크기
FROM STADIUM;

--PLAYER 테이블에서 WEIGHT가 50이상 70이하이면 'L'
--71이상 80이하면 'M' NULLL이면 '미등록' 다 아니면 'H'를
-- 선수 이름, 몸무게(단위 붙이기), 크기순으로 조회

SELECT PLAYER_NAME 선수이름 ,WEIGHT||'KG' 몸무게,
	CASE
		WHEN WEIGHT BETWEEN 50 AND 70 THEN 'L'
		WHEN WEIGHT BETWEEN 71 AND 80 THEN 'M'
		ELSE
		CASE WHEN WEIGHT IS NULL THEN '미등록'
			ELSE 'H'
		END
	END 체급
FROM PLAYER; 

-- 오라클에서 콘솔로 데이터를 확인하는 법
DBMS_OUTPUT.PUT_LINE('출력할 내용');

DECLARE
	NAME VARCHAR2(20) := '홍길동';
	AGE NUMBER(3) := 30;
BEGIN
	DBMS_OUTPUT.PUT_LINE('이름 : '|| NAME ||CHR(10)||'나이 : '|| AGE);
END;

-- 점수에 맞는 학점 출력하기
-- 변수 
-- SCORE 변수에는 80점 대입
-- GRADE
-- 당신의 점수 : XX점
-- 학점 : B 

DECLARE --declare [선언부]  변수, 상수를 선언할 수 있습니다
	SCORE NUMBER := 60; -- =은 같다 라는 뜻이기 때문에 :=로 써줘야 대입이 된다.
	GRADE VARCHAR2(5); -- 어떤 학점인지 정확히 할 수 없기 때문에 초기화를 할 수 없음
BEGIN
	IF SCORE >= 90 THEN GRADE := 'A';
	ELSIF SCORE >= 80 THEN GRADE := 'B';
	ELSIF SCORE >= 70 THEN GRADE := 'C';
	ELSIF SCORE >= 60 THEN GRADE := 'D';
	ELSE GRADE := 'F';
END IF;
DBMS_OUTPUT.ENABLE;
DBMS_OUTPUT.PUT_LINE('당신의 점수 : '||SCORE||'점'||CHR(10)||'학점 : '||GRADE);
END;
-- CHR(10) >> \N 과 같은 역할(줄바꿈)
	
BEGIN	
	FOR i in 1..10 LOOP	  	
		if mod(i, 2) = 0 then 			
			dbms_output.put_line( i || '는 짝수!!');		
		else
			dbms_output.put_line( i || '는 홀수!!');	
		end if;
	END LOOP;
END;
	
-- NUM1변수 선언, 1을 대입
--WHILE문으로 1부터 10까지의 총 합을 출력하시오
DECLARE
	NUM1 NUMBER := 1;
	TOTAL NUMBER := 0;
BEGIN
	WHILE(NUM1 <= 10)
	LOOP
		TOTAL := TOTAL + NUM1;
		NUM1 := NUM1+1;
	END LOOP;
	DBMS_OUTPUT.PUT_LINE('총 합은 : '|| TOTAL);
END;
	
-- F(X) = 2X +1;
-- 프로시저 명 F
-- 매개변수 X
-- 출력 결과 
-- X : 0, Y: 0 

CREATE OR REPLACE PROCEDURE F (X IN NUMBER)
IS 
	Y NUMBER;
BEGIN 
	Y := 2*X +1;
	DBMS_OUTPUT.PUT_LINE('X : '||X||CHR(10)||'Y : '||Y);
END;
CALL F(5);
	
SELECT * FROM JOBS;

CREATE OR REPLACE PROCEDURE MY_NEW_JOB_PROC
(	P_JOB_ID IN JOBS.JOB_ID%TYPE,
	P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
	P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE,
	P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE
)-- 4개의 컬럼에 대해 각각의 매개변수를 만들어준다. 길이와 트랙이 동일해야하기에  %TYPE을 넣어준다.
IS 
	CNT NUMBER := 0;
BEGIN 
	-- 1. JOBS 테이블에 매개변수로 받은 JOB_ID가 존재하는지 개수를 세는 쿼리문 작성
	-- 쿼리문을 통해 나온 결과를 CNT변수에 대입하겠다.
	SELECT COUNT(JOB_ID) INTO CNT FROM JOBS 
	WHERE JOB_ID = P_JOB_ID;
	--2. CNT가 0일때는 INSERT하고 1이면 UPDATE하기
	IF CNT =0 THEN 
		--INSERT문 작성하기
		INSERT INTO JOBS(JOB_ID,JOB_TITLE,MIN_SALARY, MAX_SALARY)
		VALUES(P_JOB_ID,P_JOB_TITLE,P_MIN_SALARY,P_MAX_SALARY);
		DBMS_OUTPUT.PUT_LINE('ALL INSERT ABOUT '||' '||P_JOB_ID);
	ELSE
		UPDATE JOBS SET 
		JOB_TITLE = P_JOB_TITLE,
		MIN_SALARY = P_MIN_SALARY,
		MAX_SALARY = P_MAX_SALARY
		WHERE JOB_ID = P_JOB_ID;
		DBMS_OUTPUT.PUT_LINE('ALL UPDATE ABOUT '||' '||P_JOB_ID);
	END IF;
END;

CALL MY_NEW_JOB_PROC('IT', 'Developer', 14000, 20000);
SELECT * FROM JOBS;
-- 다시 검색해보면 위 데이터가 각각의 컬럼 안에 들어간 모습을 확인할 수 있다.

CALL MY_NEW_JOB_PROC('IT', 'Developer', 7000, 15000);
-- 업데이트가 잘 된 모습을 확인할 수 있다.

-- 작제를 하는 함수 만들기
CREATE OR REPLACE PROCEDURE DEL_JOB_PROC(
	P_JOB_ID IN JOBS.JOB_ID%TYPE
)
IS 
	CNT NUMBER := 0;
BEGIN
	SELECT COUNT(JOB_ID) INTO CNT FROM JOBS 
	WHERE JOB_ID = P_JOB_ID;
	IF CNT !=0 THEN
		DELETE FROM JOBS
		WHERE JOB_ID = P_JOB_ID;
		DBMS_OUTPUT.PUT_LINE('ALL DELETE ABOUT '||' '||P_JOB_ID);
	ELSE
		DBMS_OUTPUT.PUT_LINE('NO EXIST '||' '||P_JOB_ID);
	END IF;
END;

CALL DEL_JOB_PROC('IT_1');
SELECT * FROM JOBS;

-- 시퀀스 
-- 테이블에 값을 추가할 때 자동으로 순차적인 정수값이 들어가도록 설정해주는 객체

CREATE TABLE TBL_USER(
	IDX NUMBER PRIMARY KEY,
	NAME VARCHAR2(50)
);

-- 시퀀스 생성하기
-- CREATE SEQUENCE 시퀀스 명;
CREATE SEQUENCE SEQ_USER;
INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL,'홍길동');
INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL,'이길동');
INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL,'삼길동');
INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL,'사길동');

