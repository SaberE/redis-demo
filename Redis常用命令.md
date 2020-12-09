Redis命令十分丰富，包括的命令组有Cluster、Connection、Geo、Hashes、HyperLogLog、Keys、Lists、Pub/Sub、Scripting、Server、Sets、Sorted Sets、Strings、Transactions
一共14个redis命令组两百多个redis命令，Redis中文命令大全。您可以通过下面的检索功能快速查找命令，已下是全部已知的redis命令列表。
如果您有兴趣的话也可以查看我们的网站结构图,它以节点图的形式展示了所有redis命令

1、redis服务启动命令：I:\develop\env\Redis-x64-3.2.100>redis-server.exe redis.windows.conf

2、redis-benchmark 官方自带的压力测试工具
	选项	描述											默认值
	-h		指定服务器主机名								127.0.0.1
	-p		指定服务器端口									6379
	-s		指定服务器 socket					
	-c		指定并发连接数									50
	-n		指定请求数										10000
	-d		以字节的形式指定 SET/GET 值的数据大小			2
	-k		1=keep alive 0=reconnect						1
	-r		SET/GET/INCR 使用随机 key, SADD 使用随机值	
	-P		通过管道传输 <numreq> 请求						1
	-q		强制退出 redis。仅显示 query/sec 值	
	--csv	以 CSV 格式输出	
	-l		生成循环，永久执行测试	
	-t		仅运行以逗号分隔的测试命令列表。	
	-I		Idle 模式。仅打开 N 个 idle 连接并等待。	
	
3、keys命令
	DEL key [key ...]
	删除指定的key（一个或多个）
	DUMP key
	导出key的值
	EXISTS key [key ...]
	查询一个key是否存在
	EXPIRE key seconds
	设置一个key的过期的秒数
	EXPIREAT key timestamp
	设置一个UNIX时间戳的过期时间
	KEYS pattern
	查找所有匹配给定的模式的键
	MIGRATE host port key destination-db timeout [COPY] [REPLACE]
	原子性的将key从redis的一个实例移到另一个实例
	MOVE key db
	移动一个key到另一个数据库
	OBJECT subcommand [arguments [arguments ...]]
	检查内部的再分配对象
	
	
	
	