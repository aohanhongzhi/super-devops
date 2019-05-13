Shell-cli 它是一个基于SpringCloud服务的开源命令行工具，运行方式类似于spark-shell。

English version goes [here](README_EN.md).

# 快速开始

## 源码编译
```
cd super-devops-shell
mvn clean install -DskipTests 
```

## 启动

### 方式一
（适用于客户端模式，通常临时用于连接应用服务使用）
指定服务端的端口，然后作为客户端运行：

```
java -Dservpoint=60120 -jar shell-cli-master-executable.jar
```

在上面的命令中 -Dservpoint 表示要连接的SpringCloud服务侦听地址和端口。

### 方式二
（适用于本地模式，通常作为应用服务的内置控制台使用）	
指定服务的PID列表，然后直接作为客户端运行，其中shell cli自动扫描与PID进程的所有本地监控端口匹配
的端口（默认匹配范围60100-60200）

```
java -Dservpids=19767,32374 -jar shell-cli-master-executable.jar 
```
上面的命令中 -Dservpids 表示要连接的SpringCloud服务的进程号列表，它会依据pids在本地自动查找服务的端口，然后建立连接.
若没有报未找到pids的服务端的端口（通常都不会报此错误），则可以尝试增加-Ddebug参数调试，或者直接使用上述 [方式一](#方式一) 
（-Dservpoint） 显示指定服务端点。

## 特性

- 按TAB键自动补全
- Ctrl+A 光标跳至行首、Ctrl+E 光标跳至行尾、Ctrl+C 退出控制台（遵循GNU）


## 内置命令 
- clear/cls    清理控制台
- exit/ex/quit/qu    退出控制台
- history/his    查看历史命令（持久文件：$USER_HOME/.devops/shell/history）
- stacktrace/st    查看上一次异常的堆栈信息（若有）
- help/he    使用帮助，如：help、help add、add --help、add --he 其中add为一个计算和的命令

## 自定义命令

[完整示例见](super-devops-shell-example/src/main/java/com/wl4g/devops/shell/exporter/ExampleExporter.java)