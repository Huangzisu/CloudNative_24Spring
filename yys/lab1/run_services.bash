#!/bin/bash

# 创建网络
docker network create ase-network

# 运行ase-conference-service
docker run -d --network ase-network --name ase-conference-service -e env=prod -e NACOS_HOST=host.docker.internal -e NACOS_PORT=8848 -e MYSQL_HOST=host.docker.internal -e MYSQL_PORT=13306 -e REDIS_HOST=host.docker.internal -e REDIS_PORT=6379 huajuan6848/ase_conference_service:yys-lab1

# 运行ase-notification-service
docker run -d --network ase-network --name ase-notification-service -e env=prod -e NACOS_HOST=host.docker.internal -e MYSQL_HOST=host.docker.internal -e REDIS_HOST=host.docker.internal huajuan6848/ase_notification_service:yys-lab1

# 运行ase-user-service
docker run -d --network ase-network --name ase-user-service -e env=prod -e NACOS_HOST=host.docker.internal -e MYSQL_HOST=host.docker.internal -e REDIS_HOST=host.docker.internal huajuan6848/ase_user_service:yys-lab1

# 运行ase-file-service
docker run -d --network ase-network --name ase-file-service -e env=prod -e NACOS_HOST=host.docker.internal -e MYSQL_HOST=host.docker.internal -e REDIS_HOST=host.docker.internal huajuan6848/ase_file_service:yys-lab1

# 运行ase-gateway
docker run -d --network ase-network --name ase-gateway -e env=prod -e NACOS_HOST=host.docker.internal -e MYSQL_HOST=host.docker.internal -e REDIS_HOST=host.docker.internal huajuan6848/ase_gateway:yys-lab1

# 运行ase-frontend
docker run -d --network ase-network --name ase-frontend -p 80:80 -e env=prod -e NACOS_HOST=host.docker.internal -e MYSQL_HOST=host.docker.internal -e REDIS_HOST=host.docker.internal huajuan6848/ase_frontend:yys-lab1