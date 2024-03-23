# 第一阶段：使用带有Maven和JDK的基础镜像来构建Java应用
FROM openjdk:17-jdk as build
WORKDIR /build
# 复制整个项目目录到容器中
COPY . /build
# 确保Maven Wrapper有执行权限
RUN unset MAVEN_CONFIG
# 执行Maven构建命令
RUN ./mvnw clean package -pl ase_contribute_service -am -Dmaven.test.skip=true

# 第二阶段：使用只包含JDK的基础镜像来运行Java应用
FROM openjdk:17-jdk
WORKDIR /app
# 从构建阶段复制生成的jar文件到最终镜像
COPY --from=build /build/ase_contribute_service/target/ase_contribute_service*.jar /app/app.jar
# 暴露应用所需的端口
EXPOSE 8080
# 设置容器启动时的默认命令
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]

# 在项目根目录下执行命令 docker build -t ase_contribute .
