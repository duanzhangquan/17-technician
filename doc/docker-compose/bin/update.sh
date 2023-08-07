#!/usr/bin/env bash

echo '=====开始更新蘑菇博客镜像====='

echo '=====开始关闭运行的容器====='
sh kernShutdown.sh

echo '=====开始更新mogu-gateway====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/mogu_gateway:latest

echo '=====开始更新mogu-admin====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/mogu_admin:latest

echo '=====开始更新mogu-web====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/mogu_web:latest

echo '=====开始更新mogu-sms====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/mogu_sms:latest

echo '=====开始更新mogu-picture====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/mogu_picture:latest

echo '=====开始更新vue_mogu_admin====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/vue_mogu_admin:latest

echo '=====开始更新vue_mogu_web====='
docker pull registry.cn-guangzhou.aliyuncs.com/junmowen-repo/vue_mogu_web:latest

echo '=====删除docker标签为none的镜像====='
docker images | grep none | awk '{print $3}' | xargs docker rmi

echo '=====开始运行的一键部署脚本====='
sh kernStartup.sh

echo '=====镜像更新完成====='
echo '=====服务重启完成====='