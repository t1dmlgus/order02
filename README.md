<br>

# 요구사항

#### 각 도메인 별 주요 요구사항은 다음과 같다.

### 유저
- 유저는 일반회원/관리자로 구분한다.
- 회원가입
- 로그인
- 권한(일반/관리자)

### 상품
- 관리자는 상품을 등록할 수 있다.
- 등록된 상품은 유저의 주문으로 판매될 수 있다.
- 상품은 상품명, 가격, 색상, 사이즈의 옵션으로 구성된다.
- 상품 구매 시, 특정 옵션을 선택하면 가격이 추가된다.
- 상품은 (판매준비중/ 판매중/ 판매종료) 의 상태를 갖는다.
- 상품은 검색될 수 있다.

### 주문
- 등록된 상품은 유저가 주문할 수 있다.
- 주문은 (주문등록/ 결제/ 배송준비/ 배송완료)의 상태를 가진다.
- 주문등록 시, 결제수단을 선택하고, 상품, 상품옵션을 선택한다.
- 결제수단은 카드, 카카오페이, 포인트, 일반쿠폰 으로 나뉜다.
- 주문은 검색될 수 있다.(주문번호, 주문일시)

---
<br>

# 2. 기술 스택
* Java11
* Spring Boot 2.6.2
* Spring Data JPA
* querydsl 5.0
* Mysql, H2
* Junit5
* docker

---
<br>
