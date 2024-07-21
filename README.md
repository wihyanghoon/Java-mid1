### Java-mid1
* Object class
  * 공통 기능을 가지기 위해 최상위 클래스로 Object 클래스를 상속 받는다.
    * toString
      * 객체(인스턴스) 의 정보를 제공 
    * equals
      * 객체의 같음을 비교
      * 동일성 ==
        * 같은 객체 (주소값) 인지 확인
      * 동등성 <code>equals</code>
        * 두 객체가 논리적으로 동등한지 확인
        * 따로 오버라이딩 하지 않을 시 동일성과 같은 결과를 내게 되는데 equals는 기본적으로 동일성과 같은 식으로 작동하기 때문에 오버라이딩을 통하여 객체의 참조값을 비교하는 것이 아닌 멤버 변수를 비교하는 방법으로 <code>equals</code>를 오버라이딩 하여 새로 정의 하여야 의도대로 작동한다.
    * getClass
      * 클래스의 정보를 제공
  * 다형성의 기본구현
    * 최상위의 클래스 이므로 모든 클래스를 담을 수 있다.
* 불변객체
  * 참조값 x001을 같는 변수 a를 변수b에 할당한다.
  이 경우 a,b 모두같은 인스턴스를 바라보게 되는데
  변수 b를 통해 값을 변경할 경우 a의 값도 같은 인스턴스를 바라보기 때문에 a,b 모두의 값이 변경된다.
  * 할당하는것이 잘못된 것이 아니라 값을 변경하려는 행동이 잘못되어 사이드 이펙트가 발생된다.
  * 이럴 경우 멤버 변수를 <code>final</code>로 선언하여 변경하지 못하도록 설정하여 변경 할 가능성을 아예 배제 시킨다.
* String 클래스
  * <code>String</code>은 기본타입이 아니라 사실 클래스이다.
  ```java
  String str1 = "hello java";
  String str1 = new String("hello java");
  ```
  * 자바는 클래스이기 때문에 자바에서 자체적으로 <code>쌍따운표</code> 를 사용 할 시 알아서 인스턴스 형태로 변형하는 것이다.
  * <code>String</code> 은 불변 객체로 기존 객체를 수정하게 되면 새로운 객체를 생성하기 때문에 성능에 좋지 않다.
  * <code>StringBuilder</code> 가변 객체로써 새로운 객체를 생성하지 않아 if문, 반복문 등에서 사용하기 유용함.
* 래퍼 클래스
  * 기본형들의 클래스버전
* 