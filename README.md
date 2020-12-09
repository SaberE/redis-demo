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




