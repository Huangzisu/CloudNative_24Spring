#!/usr/bin/env bash

# 检测是否安装了docker
if ! [ -x "$(command -v docker)" ]; then
  echo 'Error: docker is not installed.' >&2
  exit 1
fi

# 停止mysql-docker
cd mysql-docker || exit
if docker-compose down; then
  echo "mysql-docker停止成功"
else
  echo "mysql-docker停止失败"
  exit 1
fi
cd - || exit

# 停止redis-docker
cd redis-docker || exit
if docker-compose down; then
  echo "redis-docker停止成功"
else
  echo "redis-docker停止失败"
  exit 1
fi
cd - || exit

# 停止nacos-docker
cd nacos-docker/nacos-docker || exit
if docker-compose -f standalone-mysql-8.yaml down; then
  echo "nacos-docker停止成功"
else
  echo "nacos-docker停止失败"
  exit 1
fi
cd - || exit
