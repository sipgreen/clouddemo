@cd /d D:/Git/
@cd clouddemo\spdemo
@start mvn spring-boot:run -Dport=8902  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8903  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8904  -Deureka.server=http://localhost:8801/eureka
@start mvn spring-boot:run -Dport=8905  -Deureka.server=http://localhost:8801/eureka


@cd /d D:/Git/
@cd clouddemo\eurekademo
@start mvn spring-boot:run -Dport=8801


@cd /d D:/Git/
@cd clouddemo\invoker
@start mvn spring-boot:run -Dport=9901