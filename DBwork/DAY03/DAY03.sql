-- 10번 및 30번 부서에 속하는 모든 사원 중 급여가 1500을 넘는 사원의 
-- 사원번호, 이름 및 급여를 조회하세요

SELECT DEPARTMENT_ID FROM EMPLOYEES;

SELECT EMPLOYEE_ID , FIRST_NAME,SALARY FROM EMPLOYEES
WHERE DEPARTMENT_ID = 10 OR DEPARTMENT_ID = 30 AND SALARY > 1500;
-- 관리자가 없는 모든 사원에 이름 및 직종을 출력하세요
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;
-- 직업이 IT_PROG 또는 SA_MAN이면서 급여가 1000,3000,5000이 아닌 사원들의
-- 이름 직종 급여를 조회하세요
SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES
WHERE JOB_ID IN ('SA_MAN','IT_PROG') AND SALARY NOT IN ('1000','3000','5000');

-- TBL_STUDENT 
-- 학번, 이름, 전공 성별, 생일(ID, NAME, MAJOR, GENDER, BIRTH)

--BAN_CHAR 체크 제약 조건 위배 
--INSERT INTO TBL_STUDENT (ID, NAME, MAJOR, GENDER, BIRTH)
--VALUES (0,'홍길동','컴퓨터공학과','A','1980-01-02');

INSERT INTO TBL_STUDENT (ID, NAME, MAJOR, GENDER, BIRTH)
VALUES (0,'홍길동','컴퓨터공학과','M','1980-01-02');

INSERT INTO TBL_STUDENT (ID, NAME, MAJOR, GENDER, BIRTH)
VALUES (1,'박디비','컴퓨터공학과','W','1990-02-06');

SELECT * FROM TBL_STUDENT;

-- DEFAULT 값 사용해보기
INSERT INTO TBL_STUDENT (ID, NAME, MAJOR, BIRTH)
VALUES (2,'홍길동','컴퓨터공학과','1994-08-26');

-- INSERT 할때 컬럼명을 생략하면 DEFAULT 값을 넣을 수 없다.
INSERT INTO TBL_STUDENT 
VALUES (3,'이자바','컴퓨터공학과','1994-08-26');


--FLOWER 테이블에 데이터 넣기
-- F_NAME, F_COLOR, F_COST
INSERT INTO FLOWER (F_NAME, F_COLOR, F_COST)
VALUES ('장미꽃','빨간색','3000');

INSERT INTO FLOWER VALUES ('해바라기','노란색','2000');
INSERT INTO FLOWER VALUES ('튤립','흰색','4000');

SELECT * FROM FLOWER;

-- F_CASE 테이블에 데이터 추가하기
-- FC_NUM, FC_COLOR, FC_SHAPE, F_NAME

INSERT INTO F_CASE VALUES (0,'파란색','네모','장미꽃');
INSERT INTO F_CASE VALUES (1,'검은색','원','해바라기');
INSERT INTO F_CASE VALUES (2,'파란색','세모','튤립');
-- 꽃 데이터에 있는 꽃만 추가할 수 있다.
INSERT INTO F_CASE VALUES (3,'핑크색','별','진달래');

SELECT * FROM F_CASE;

CREATE TABLE FLOWER2(
	F_NAME2 VARCHAR2(100) PRIMARY KEY,
	F_COLOR2 VARCHAR2(100),
	F_COST2 NUMBER	
);

-- 다른테이블에 있는 데이터를 조회해서 추가하는 것이 가능하다.
INSERT INTO FLOWER2(F_NAME2, F_COLOR2, F_COST2)
SELECT F_NAME, F_COLOR, F_COST FROM FLOWER
WHERE F_COST >= 3000;

SELECT * FROM FLOWER2;

-- 여러 테이블에 한번에 데이터를 추가하는 것도 가능
INSERT ALL
	INTO FLOWER VALUES('할미꽃','보라색','5000')
	INTO FLOWER2 VALUES('백합','흰색','7000')
SELECT * FROM DUAL;

SELECT * FROM FLOWER f ;
SELECT * FROM FLOWER2 f ;

SELECT * FROM F_CASE;
-- DELETE << PK 와 FK로 연결된 것은 FK 테이블 부터 해당 데이터를 지워야한다.
-- 부모 테이블에서 삭제가 불가하다.
DELETE FROM F_CASE WHERE FC_NUM = 0;
DELETE FROM F_CASE WHERE FC_NUM = 2;

-- STUDENT 테이블에서  이름이 홍길동인 살암 삭제하기
DELETE FROM TBL_STUDENT WHERE NAME = '홍길동';


SELECT * FROM TBL_STUDENT;

-- 학생 테이블에서ㅏ 학번 1번인 학생의 이름을 홍길동으로 성별은 남자로 수정하기
UPDATE TBL_STUDENT
SET NAME = '홍길동', GENDER = 'M' WHERE ID = 1;

-- 회워 ㄴ관련된 기능
-- 로그인->SELECT
-- 회원 가입 -> INSERT
-- 회원 정보 수정 -> UPDATE
-- 회원 탈퇴 -> DELETE 

-- 상품관련된 기능
-- 검색 -> SELECT
-- 상품 추가 -> INSERT
-- 제고 수정 -> UPDATE
-- 상품삭제 -> DELETE

-- 사원 테이블에서 급여를 많이 받는 순서대로 사번, 이름 급여, 입사일 순으로 출력하되
-- 급여가 같은 경우 입사일이 빠른 순으로 정렬

SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,HIRE_DATE 
FROM EMPLOYEES ORDER BY SALARY DESC, HIRE_DATE ASC;
-- 위 아래 둘 다 같다.
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,'HIRE_DATE' 
FROM EMPLOYEES ORDER BY '8' DESC, '6' ASC;

-- 사원 테이블에서 부서 번호가 빠른순, 부서번호가 같다면 직종이 빠른 순
-- 직종도 같다면 급여를 많이 받는 순으로 정렬 하여 사번, 이름, 부서번호, 급여 순으로 출력
SELECT EMPLOYEE_ID,FIRST_NAME, DEPARTMENT_ID , JOB_ID , SALARY 
FROM EMPLOYEES ORDER BY DEPARTMENT_ID , JOB_ID , SALARY DESC;

-- 입사일이 빠른 순으로 급여가 15000이상인 사원들의 사번, 이름, 급여, 입사일을 조회

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE 
FROM EMPLOYEES WHERE SALARY >14999 ORDER BY HIRE_DATE ASC;

-- 문자와 관련된 함수

-- 지정된 문자 ASCII값을 반환한다.
SELECT ASCII('A') FROM DUAL; --결과 : 65

-- 지정된 수치와 일치하는 ASCII코드를 반환한다.
SELECT CHR(65) FROM DUAL; --결과 A

-- RPAD(데이터,고정길이,문자)
-- 고정길이 안에 데이터를 출력하고 남는 공간을 문자로 채운다.
SELECT RPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;

-- LPAD(데이터,고정길이,문자)
-- 고정길이 안에 데이터를 출력하고 남는 공간을 문자로 채운다.
SELECT LPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;

-- 문자열 공백 문자들을 삭제한다
SELECT TRIM('  HELLOW  ') FROM DUAL;
-- RTRIM() -> 오른쪽 공백 제거
-- LTRIM() -> 왼쪽 공백 제거

-- INSTR() -> 특정 문자의 위치를 반환
SELECT INSTR('HELLOW','O') FROM DUAL;
-- INSTR(데이터,찾을 문자,검색위치,몇번째 나오는지) -> 특정 문자의 위치를 반환
SELECT INSTR('HELLOW','L',1,2) FROM DUAL;
-- 찾는 문자열이 없으면 0을 반환한다.
SELECT INSTR('HELLOW','Z') FROM DUAL;
-- INITCAP() -> 첫 문자를 대문자로 변환하는 함수
SELECT INITCAP('good morning') FROM DUAL;
-- LENGTH()-> 문자열의 길이를 반환
SELECT LENGTH('john') FROM DUAL;
-- CONCAT() -> 주어진 두 문자열 연결
SELECT CONCAT('Republic of',' Korea') FROM DUAL;
-- SUBSTR()
-- 문자열의 시작 위치부터 길이만큼 자른 후 반환한다.
-- 길이는 생략 가능하며, 생략 시 문자열의 끝까지 반환한다
SELECT SUBSTR('Hello Oracle', 2),
SUBSTR('Hello Oracle', 7, 5)FROM DUAL;

-- REPLACE(데이터, 원래글자, 바꿀 글자)
SELECT REPLACE('GOOD MORNING','MORNING','EVENING') FROM DUAL;

-- UPPER()-> 주어진 문자가 전부 대문자로 바뀐다.
SELECT UPPER ('good morning') FORM DUAL;
-- LOWER ()-> 주어진 문자가 전부 소문자로 바뀐다.
SELECT UPPER ('GOOD MORNING') FORM DUAL;

--부서 번호가 50번인 사원들의 이름을 출력하되 이름이 'EL'을 모두 '**'로 대체하여 출력하세요

SELECT REPLACE (FIRST_NAME,'el','**') FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;

-- 이름이 6글자 이상인 사원의 사번과 이름, 급여를 출력하세요
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) >=6;
-- ' H E L L O '의 공백을 모두 제거하여 출력하세요
SELECT REPLACE(' H E L L O ',' ','') FROM DUAL;


-- 아래 칼럼을 가지는 PRODUCT2 테이;블을 생성하는 DDL을 작성하지오
-- 제약 조건의 이름은 자동으로 부여되도록 별도로 지정하지 마시오.
-- 단 제약 조건의 이름을 지정하더라도 감점하지 않는다.
-- 칼럼 정보
-- 1) NO : 제품 번호, 숫자, 기본키
-- 2) NAME :  제품 명, 문자열 최대 100바이트, 필수
-- 3) PRICE : 제품 가격, 숫자
-- 4) P_DATE :  생상 일자, 날짜

CREATE TABLE PRODUCT2(
	"NO" NUMBER PRIMARY KEY,
	NAME VARCHAR2(100) NOT NULL,
	PRICE NUMBER,
	P_DATE DATE
);

-- 1) 모든 칼럼의 타입에 맞는 데이터를 삽입하고 모든 칼럼에 널 값이 없도록 작성하시오

-- 3) P_DATE 칼럼의 데이터 중 하나 이상은 반드시 현제 날짜를 호출하는 오라클 함수를 사용하시오

INSERT INTO PRODUCT2 VALUES ('1000','컴퓨터','100',TO_DATE('04.11.22','MM,DD,YYYY'));
INSERT INTO PRODUCT2 VALUES ('1001','세탁기','60',SYSDATE);
INSERT INTO PRODUCT2 VALUES ('1002','냉장고','200',SYSDATE);
INSERT INTO PRODUCT2 VALUES ('1003','에어컨','300',SYSDATE);
INSERT INTO PRODUCT2 VALUES ('1004','오디오','20',SYSDATE);

SELECT TO_CHAR(P_DATE,'yy/mm/dd')FROM PRODUCT2;

SELECT * FROM PRODUCT2;

DELETE FROM PRODUCT2 WHERE "NO" = '1000';
DROP TABLE PRODUCT2;

-- NO 1000인 데이터의 PRICE를 20증가시키세요
UPDATE PRODUCT2 SET PRICE = 120 WHERE "NO" = '1000';

-- NAME이 '세탁기'인 데이터를 모두 삭제하세요
DELETE FROM PRODUCT2 WHERE NAME = '세탁기';
SELECT "NO", NAME, PRICE,TO_CHAR(P_DATE,'yy/mm/dd') 
FROM PRODUCT2 ORDER BY PRICE DESC;

