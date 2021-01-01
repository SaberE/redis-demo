redis Windows版本获取地址：https://github.com/microsoftarchive/redis/releases (window版本的redis是由微软去维护的，redis官方建议使用linux版本)
redis 中文文档地址：http://www.redis.cn/

1、Redis概述：
	Redis 是一个开源（BSD许可）的，基于内存的数据结构存储系统，它可以用作数据库、缓存和消息中间件。 它支持多种类型的数据结构，如 字符串（strings）， 散列（hashes）， 列表（lists）， 集合（sets）， 
	有序集合（sorted sets） 与范围查询， bitmaps， hyperloglogs 和 地理空间（geospatial） 索引半径查询。 Redis 内置了 复制（replication），LUA脚本（Lua scripting）， LRU驱动事件（LRU eviction），
	事务（transactions） 和不同级别的 磁盘持久化（persistence）， 并通过 Redis哨兵（Sentinel）和自动 分区（Cluster）提供高可用性（high availability）。

2、redis默认端口：6379

3、redis是单线程的。官方表示，redis是基于内存操作的，cpu不是redis的瓶颈，redis的瓶颈是机器内存和网络带宽，不用考虑IO瓶颈带来的阻塞问题，既然可以使用单线程，就使用单线程了。对于内存系统来说，
	如果没有上下文切换效率就是最高的，多次读写都是在同一个cpu上。

4、redis五大数据类型：String，List，Set，Hash，Zset。三种特殊数据类型：geospatial，hyperloglogs，Bitmaps。

5、redis事务
	redis事务没有隔离级别的概念
	redis单条命令保证原子性，但redis的事务不保证原子性
	redis的事务处理流程：
	（1）开启事务（multi）
	（2）命令入队（.....）	
	（3）执行事务（exec）
	redis执行事务时可能出现的异常：
	（1）入队时命令语法错误，此时事务执行前会被取消，队列里的命令不会被执行
	（2）事务执行时出现异常，此时会执行队列里所有的命令

6、redis监控
	（1）悲观锁
		很悲观，认为什么时候都会出问题，无论做什么都加锁
	（2）乐观锁（watch）
		很乐观，认为不会出问题，所以不会上锁！更新时判断数据是否被修改过
		（1）获取version
		（2）更新时比较version
		若有另外一个线程修改了watch监视的值，则事务执行时会返回nil，此时可以先使用unwatch解锁，再重新监视值执行事务（类似自选锁），业务场景：秒杀

7、Jedis
	Jedis描述：Jedis是官方推荐的java连接工具，使用java操作redis的中间件。
	