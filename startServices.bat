@set curdir=%cd%
@set fileDir=%~dp0
@cd %fileDir%spdemo
@start mvn spring-boot:run -Dport=8902  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8903  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8904  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8905  -Deureka.server=http://localhost:8801/eureka

@cd %fileDir%eurekademo
@start mvn spring-boot:run -Dport=8801

@cd %fileDir%invoker
@start mvn spring-boot:run -Dport=9901
@cd %curdir%