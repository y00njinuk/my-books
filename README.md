# my-lab
개인 스터디 공간으로 Intellij 프로젝트 및 추가 모듈 구성은 다음과 같이 간단하게 구성하도록 한다.
- 프로젝트 모듈 SDK는 java 1.8 SDK로 설정
- 언어수준은 디폴트 값(8)으로 설정
- JDK 경로는 C:\Program Files\Java\jdk1.8.0_231 으로 설정
- 관련 라이브러리는 ~\IdeaProjects\my-lab\\.lib 폴더에 모두 저장
- 컴파일러 출력은 ~\IdeaProjects\my-lab\\.build로 설정
- 각 서브 모듈의 추가 라이브러리는 .iml 파일을 참조하여 설정
---
### 프로젝트의 구성 및 세부내용은 다음과 같다.
* Java
  * 자바의 정석 1,2권
  * Effective Java
* Kotlin
  * Kotlin in Action
* Scala
  * Programming in Scala
* 그 외
  * 궁금한 내용 직접 실습해보기
---
* Dependencies
  * scala-sdk-2.12.1
  * junit
  * twitter.finagle.http_2.11
  * jetbrains.kotlinx.coroutines.core
