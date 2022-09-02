#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20210908.sql ./mysql/db
cp ../sql/ry_config_20220114.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../vrcrm-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy vrcrm-gateway "
cp ../vrcrm-gateway/target/vrcrm-gateway.jar ./ruoyi/gateway/jar

echo "begin copy vrcrm-auth "
cp ../vrcrm-auth/target/vrcrm-auth.jar ./ruoyi/auth/jar

echo "begin copy vrcrm-visual "
cp ../vrcrm-visual/vrcrm-monitor/target/vrcrm-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy vrcrm-modules-system "
cp ../vrcrm-modules/vrcrm-system/target/vrcrm-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy vrcrm-modules-file "
cp ../vrcrm-modules/vrcrm-file/target/vrcrm-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy vrcrm-modules-job "
cp ../vrcrm-modules/vrcrm-job/target/vrcrm-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy vrcrm-modules-gen "
cp ../vrcrm-modules/vrcrm-gen/target/vrcrm-modules-gen.jar ./ruoyi/modules/gen/jar

