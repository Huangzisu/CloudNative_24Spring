#!/bin/bash

# 停止并删除容器
docker rm -f ase-conference-service
docker rm -f ase-notification-service
docker rm -f ase-user-service
docker rm -f ase-file-service
docker rm -f ase-gateway
docker rm -f ase-frontend

# 删除网络
docker network rm ase-network