#!/usr/bin/env bash
# 检测是否安装了docker
if ! [ -x "$(command -v docker)" ]; then
  echo 'Error: docker is not installed.' >&2
  exit 1
fi

# 启动mysql-docker
cd mysql-docker || exit
# 执行docker-compose up -d并判断是否成功
if docker compose up -d; then
  echo "mysql-docker启动成功"
else
  echo "mysql-docker启动失败"
  exit 1
fi
cd - || exit

# 启动redis-docker
cd redis-docker || exit
if docker compose up -d; then
  echo "redis-docker启动成功"
else
  echo "redis-docker启动失败"
  exit 1
fi
cd - || exit

# 启动nacos-docker
cd nacos-docker/nacos-docker || exit
if docker compose -f standalone-mysql-8.yaml up -d; then
  echo "nacos-docker启动成功"
else
  echo "nacos-docker启动失败"
  exit 1
fi
cd - || exit
