I:\develop\env\Redis-x64-3.2.100>redis-server.exe redis.windows-service.conf

I:\develop\env\Redis-x64-3.2.100>redis-server.exe redis.windows.conf
                _._
           _.-``__ ''-._
      _.-``    `.  `_.  ''-._           Redis 3.2.100 (00000000/0) 64 bit
  .-`` .-```.  ```\/    _.,_ ''-._
 (    '      ,       .-`  | `,    )     Running in standalone mode
 |`-._`-...-` __...-.``-._|'` _.-'|     Port: 6379
 |    `-._   `._    /     _.-'    |     PID: 4272
  `-._    `-._  `-./  _.-'    _.-'
 |`-._`-._    `-.__.-'    _.-'_.-'|
 |    `-._`-._        _.-'_.-'    |           http://redis.io
  `-._    `-._`-.__.-'_.-'    _.-'
 |`-._`-._    `-.__.-'    _.-'_.-'|
 |    `-._`-._        _.-'_.-'    |
  `-._    `-._`-.__.-'_.-'    _.-'
      `-._    `-.__.-'    _.-'
          `-._        _.-'
              `-.__.-'

[4272] 05 Dec 11:21:49.975 # Server started, Redis version 3.2.100
[4272] 05 Dec 11:21:49.976 * DB loaded from disk: 0.000 seconds
[4272] 05 Dec 11:21:49.976 * The server is now ready to accept connections on port 6379

============================================================客户端================================================================
127.0.0.1:6379> keys *
1) "k1"
127.0.0.1:6379> set k2 v2
OK
127.0.0.1:6379> dbsize
(integer) 2
127.0.0.1:6379> set k3 123456789
OK
127.0.0.1:6379> dbsize
(integer) 3
127.0.0.1:6379> set k4 aldshasldhofafsabfnaiukdhaosl;dsalindalf;da
OK
127.0.0.1:6379> dbsize
(integer) 4
127.0.0.1:6379> keys *
1) "k3"
2) "k2"
3) "k4"
4) "k1"
127.0.0.1:6379> dbsize
(integer) 7
(4.97s)

localhost:6379> migrate 127.0.0.1 6380 "" 0 100 copy keys k1 k2
OK
127.0.0.1:6379[1]> set k6 1_v6
OK
127.0.0.1:6379[1]> move k6 0
(integer) 1
127.0.0.1:6379[1]> select 0
OK
127.0.0.1:6379> get k6
"1_v6"
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> set k7 v1
OK
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k7
"v1"
127.0.0.1:6379> object encoding k1
"embstr"
127.0.0.1:6379> object encoding k2
"embstr"
127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇ [EX seconds] [PX milliseconds] [NX|XX]127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇr [EX seconds] [PX milliseconds] [NX|XX127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇra [EX seconds] [PX milliseconds] [NX|X127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇraw [EX seconds] [PX milliseconds] [NX|127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ [EX seconds] [PX milliseconds] [NX127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ [EX seconds] [PX milliseconds] [127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ [EX seconds] [PX milliseconds] 127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ￫ [EX seconds] [PX milliseconds]127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ￫
OK
127.0.0.1:6379> get k8
"Redis\xd0\xa1\xd3\xda\xb5\xc8\xd3\xda44\xb8\xf6\xd7\xd6\xbd\xda\xb5\xc4\xd7\xd6\xb7\xfb\xb4\xae\xca\xc7embstr\xb1\xe0\xc2\xeb\xa1\xa2\xb4\xf3\xd3\xda44\xb8\xf6\xd7\xd6\xbd\xda\xca\xc7raw\xb1\xe0\xc2\xeb"
127.0.0.1:6379> object encoding k8
"raw"
127.0.0.1:6379> obejct idletime k1
(error) ERR unknown command 'obejct'
127.0.0.1:6379> object idletime k1
(integer) 448
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object idletime k1
(integer) 9
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object idletime k1
(integer) 13
127.0.0.1:6379>
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> persist k1
(integer) 0
127.0.0.1:6379> expire k1 10
(integer) 1
127.0.0.1:6379> persist k1
(integer) 1
127.0.0.1:6379> persist k1
(integer) 0
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> ttl k2
(integer) -1
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> expire k1 3
(integer) 0
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> get k1
(nil)
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> expire k1 100
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> ttl k1
(integer) 91
127.0.0.1:6379> pttl k1
(integer) 82065
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k3"
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> rename k1 k1-1
OK
127.0.0.1:6379> get k1
(nil)
127.0.0.1:6379> get k1-1
"v1"
127.0.0.1:6379>  
127.0.0.1:6379>  
127.0.0.1:6379>   
127.0.0.1:6379> renamenx k1-1 k2
(integer) 0
127.0.0.1:6379> get k1-1
"v1"
127.0.0.1:6379> renamenx k1-1 k1
(integer) 1
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> dump k1
"\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
127.0.0.1:6379>    
127.0.0.1:6379> 
127.0.0.1:6379> 
127.0.0.1:6379> 
127.0.0.1:6379> restore k9 10 "\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
(error) BUSYKEY Target key name already exists.
127.0.0.1:6379> restore k10 10000 "\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
OK
127.0.0.1:6379> get k10
"v1"
127.0.0.1:6379> get k10
(nil)
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> type k1
string
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lpush list1 v1 v2 v3 v4
(integer) 4
127.0.0.1:6379> lrange list1 0 -2
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> blpop list1 1000
1) "list1"
2) "v4"
127.0.0.1:6379> lrange list1 0 -1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> brpop list2 list1 1000
1) "list1"
2) "v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379>               
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> lrange list2 0 -1
1) "v6"
2) "v5"
3) "v2"
4) "v1"
127.0.0.1:6379> brpoplpush list1 list2 1000
"v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379> lrange list2 0 -1
1) "v1"
2) "v6"
3) "v5"
4) "v2"
5) "v1"
127.0.0.1:6379>     
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lindex list1 0
"v1"
127.0.0.1:6379> lindex list1 -1
"v4"
127.0.0.1:6379> lindex list1 5
(nil)
127.0.0.1:6379>               
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379> rpush list1 v1
(integer) 5
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
5) "v1"
127.0.0.1:6379> linsert list1 before v1 v5
(integer) 6
127.0.0.1:6379> lrange list1 0 -1
1) "v5"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v1"
127.0.0.1:6379> linsert list1 before v6 v6
(integer) -1
127.0.0.1:6379>                                      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> llen list1
(integer) 6
127.0.0.1:6379> llen list12345
(integer) 0
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v5"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v1"
127.0.0.1:6379> lpop list1
"v5"
127.0.0.1:6379> rpop list1
"v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379> lpush list1 v0
(integer) 5
127.0.0.1:6379> rpush list1 v5 v6
(integer) 7
127.0.0.1:6379> lrange list1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v5"
7) "v6"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v5"
7) "v6"
127.0.0.1:6379> lpushx list1 v-1
(integer) 8
127.0.0.1:6379> lpushx list213 v0
(integer) 0
127.0.0.1:6379> lrange list213 0 -1
(empty list or set)
127.0.0.1:6379> lpush list213 v0
(integer) 1
127.0.0.1:6379> lrange list213 0 -1
1) "v0"
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lpush list1 v0 v1 v2 v3  v4 v4 v3 v2 v1 v0
(integer) 10
127.0.0.1:6379> lrem list1 0 v0
(integer) 2
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
5) "v4"
6) "v3"
7) "v2"
8) "v1"
127.0.0.1:6379> lrem list1 1 v1
(integer) 1
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v2"
7) "v1"
127.0.0.1:6379> lrem list1 -1 v2
(integer) 1
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lrem list 0 v7
(integer) 0
127.0.0.1:6379>      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lset list1 1 v2
OK
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v2"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lset list1 -1 v3
OK
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v2"
3) "v4"
4) "v4"
5) "v3"
6) "v3"
127.0.0.1:6379>            
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v2"
3) "v4"
4) "v4"
5) "v3"
6) "v3"
127.0.0.1:6379> ltrim list1 4 -1
OK
127.0.0.1:6379> lrange list1 0 -1
1) "v3"
2) "v3"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v3"
2) "v3"
127.0.0.1:6379> lpush list1 v1 v2
(integer) 4
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v1"
3) "v3"
4) "v3"
127.0.0.1:6379> rpop list1
"v3"
127.0.0.1:6379> lpop list1
"v2"
127.0.0.1:6379>                    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v3"
127.0.0.1:6379> linsert list1 after v1 v2
(integer) 3
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
127.0.0.1:6379> rpoplpush list1 list2
"v3"
127.0.0.1:6379> lrange list2 0 -1
1) "v3"
2) "v1"
3) "v6"
4) "v5"
5) "v2"
6) "v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> rpushx list99 v1
(integer) 0
127.0.0.1:6379> lrange list99 0 -1
(empty list or set)
127.0.0.1:6379> rpushx list1 v3
(integer) 3
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
127.0.0.1:6379> rpushx  list1 v4
(integer) 4
127.0.0.1:6379>                       
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> sadd set1 v1 v2 v1 v3
(integer) 3
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> scard set1
(integer) 3
127.0.0.1:6379> scard set99
(integer) 0
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> sadd set2 v2
(integer) 1
127.0.0.1:6379> sadd set3 v3
(integer) 1
127.0.0.1:6379> sdiff set1 set2 set3
1) "v1"
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> smembers set2
1) "v2"
127.0.0.1:6379> smembers set3
1) "v3"
127.0.0.1:6379> sdiffstore set4 set1 set2 set3
(integer) 1
127.0.0.1:6379> smembers set4
1) "v1"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> smembers set2
1) "v2"
127.0.0.1:6379> sinter set1 set2
1) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> smembers set2
1) "v2"
127.0.0.1:6379> sinterstore set5 set1 set2
(integer) 1
127.0.0.1:6379> smembers set5
1) "v2"
127.0.0.1:6379>     
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> sismember set1 v1
(integer) 1
127.0.0.1:6379> sismember set1 v99
(integer) 0
127.0.0.1:6379> sismember set98 v1
(integer) 0
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> smembers set2
1) "v2"
127.0.0.1:6379> smove set1 set2 v3
(integer) 1
127.0.0.1:6379> smembers set1
1) "v2"
2) "v1"
127.0.0.1:6379> smembers set2
1) "v3"
2) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> sadd set1 v3 v4 v5
(integer) 3
127.0.0.1:6379> smembers set1
1) "v3"
2) "v2"
3) "v1"
4) "v4"
5) "v5"
127.0.0.1:6379> spop set1 2
1) "v3"
2) "v1"
127.0.0.1:6379> spop set1 0
(empty list or set)
127.0.0.1:6379> spop set1
"v4"
127.0.0.1:6379> smembers set1
1) "v5"
2) "v2"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> sadd set1 v1 v2 v3 v4 v5 v6
(integer) 4
127.0.0.1:6379> smembers set1
1) "v3"
2) "v1"
3) "v4"
4) "v5"
5) "v6"
6) "v2"
127.0.0.1:6379> srem set1 v1 v2
(integer) 2
127.0.0.1:6379> smembers set1
1) "v3"
2) "v4"
3) "v5"
4) "v6"
127.0.0.1:6379>      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v4"
3) "v5"
4) "v6"
127.0.0.1:6379> smembers set2
1) "v3"
2) "v2"
127.0.0.1:6379> smembers set3
1) "v3"
127.0.0.1:6379> sunion set1 set2 set3
1) "v5"
2) "v4"
3) "v3"
4) "v6"
5) "v2"
127.0.0.1:6379> smembers set1
1) "v3"
2) "v4"
3) "v5"
4) "v6"
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> smembers set1
1) "v3"
2) "v4"
3) "v5"
4) "v6"
127.0.0.1:6379> smembers set2
1) "v3"
2) "v2"
127.0.0.1:6379> smembers set3
1) "v3"
127.0.0.1:6379> sunionstore set6 set1 set2 set3
(integer) 5
127.0.0.1:6379> smembers set6
1) "v5"
2) "v4"
3) "v3"
4) "v6"
5) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> sscan set1 0 match v*
1) "0"
2) 1) "v3"
   2) "v6"
   3) "v4"
   4) "v5"
127.0.0.1:6379> sscan set1 0
1) "0"
2) 1) "v3"
   2) "v6"
   3) "v4"
   4) "v5"
127.0.0.1:6379>      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zadd zset1 1 v1 2 v2 3 v3 0 v0
(integer) 4
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
127.0.0.1:6379> zrange zset1 0 -1 withscores
1) "v0"
2) "0"
3) "v1"
4) "1"
5) "v2"
6) "2"
7) "v3"
8) "3"
127.0.0.1:6379> zadd zset1 ch 5 v5 6 v6
(integer) 2
127.0.0.1:6379> zadd zset1 5 v5
(integer) 0
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v5"
6) "v6"
127.0.0.1:6379> zadd zset1 incr 2 v0
"2"
127.0.0.1:6379> zrange zset1 0 -1
1) "v1"
2) "v0"
3) "v2"
4) "v3"
5) "v5"
6) "v6"
127.0.0.1:6379>      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zcard zset1
(integer) 6
127.0.0.1:6379> zrange zset1 0 -1
1) "v1"
2) "v0"
3) "v2"
4) "v3"
5) "v5"
6) "v6"
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zcount zset1 2 4
(integer) 3
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1
1) "v1"
2) "v0"
3) "v2"
4) "v3"
5) "v5"
6) "v6"
127.0.0.1:6379> zincrby zset1 -2 v0
"0"
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v5"
6) "v6"
127.0.0.1:6379> zincrby zset1 1 sdjhkadhajdlk
"1"
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1 withscores
 1) "v0"
 2) "0"
 3) "sdjhkadhajdlk"
 4) "1"
 5) "v1"
 6) "1"
 7) "v2"
 8) "2"
 9) "v3"
10) "3"
11) "v5"
12) "5"
13) "v6"
14) "6"
127.0.0.1:6379> zadd zset2 0 v0 1 v1 2 v2
(integer) 3
127.0.0.1:6379> zinterstore out 2 zset1 zset2 weigths 2 2
(error) ERR syntax error
127.0.0.1:6379> zinterstore out 2 zset1 zset2 weights 2 2
(integer) 3
127.0.0.1:6379> zrange out 0 -1 withscores
1) "v0"
2) "0"
3) "v1"
4) "4"
5) "v2"
6) "8"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zlexcount zset1 0 1
(error) ERR min or max not valid string range item
127.0.0.1:6379> zlexcount zset1 v0 v3
(error) ERR min or max not valid string range item
127.0.0.1:6379> zlexcount zset1 0 9
(error) ERR min or max not valid string range item
127.0.0.1:6379> zlexcount zset1 [v0 [v3
(integer) 5
127.0.0.1:6379> zlexcount zset1 - +
(integer) 7
127.0.0.1:6379> zlexcount zset1 -[v9
(error) ERR wrong number of arguments for 'zlexcount' command
127.0.0.1:6379> zlexcount zset1 - [v9
(integer) 7
127.0.0.1:6379> zlexcount zset1 - v3
(error) ERR min or max not valid string range item
127.0.0.1:6379> zlexcount zset1 - [v3
(integer) 5
127.0.0.1:6379> zlexcount zset1 [vv +
(integer) 0
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379> zlexcount zset1 - [vv
(integer) 7
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrangebyscore zset1 -1 9999
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrank zset1 v0
(integer) 0
127.0.0.1:6379> zrank zset1 v1
(integer) 2
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379> zrank zset1 7897977
(nil)
127.0.0.1:6379> zrank zset999 456
(nil)
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379> zrem zset1 v0
(integer) 1
127.0.0.1:6379> zrem zset1 s*
(integer) 0
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1
1) "v0"
2) "sdjhkadhajdlk"
3) "v1"
4) "v2"
5) "v3"
6) "v5"
7) "v6"
127.0.0.1:6379> zremrangebyrank zset1 0 1
(integer) 2
127.0.0.1:6379> zrange zset1 0 -1
1) "v2"
2) "v3"
3) "v5"
4) "v6"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1 withscores
1) "v2"
2) "2"
3) "v3"
4) "3"
5) "v5"
6) "5"
7) "v6"
8) "6"
127.0.0.1:6379> zremrangebyscore zset1 0 3
(integer) 2
127.0.0.1:6379> zrange zset1 0 -1 withscores
1) "v5"
2) "5"
3) "v6"
4) "6"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrevrange zset1 0 -1 withscores
1) "v6"
2) "6"
3) "v5"
4) "5"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrevrangebyscore zset1 - +
(error) ERR min or max is not a float
127.0.0.1:6379> zrevrangebyscore zset1 999 -1
1) "v6"
2) "v5"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1
1) "v5"
2) "v6"
3) "v7"
127.0.0.1:6379> zrevrank zset1 v5
(integer) 2
127.0.0.1:6379> zrank zset1 v5
(integer) 0
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1 withscores
1) "v5"
2) "5"
3) "v6"
4) "6"
5) "v7"
6) "7"
127.0.0.1:6379> zscore zset1 v5
"5"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zadd zset2 0 v0 1 v1 2 v2 3 v3 4 v4 5 v5 6 v6
(integer) 7
127.0.0.1:6379> zrange zset1 0 -1
1) "v5"
2) "v6"
3) "v7"
127.0.0.1:6379> zunionstore zout 2 zset1 zset2 weights 2 2
(integer) 8
127.0.0.1:6379> zrange zout 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v7"
7) "v5"
8) "v6"
127.0.0.1:6379> zrange zout 0 -1 withscores
 1) "v0"
 2) "0"
 3) "v1"
 4) "2"
 5) "v2"
 6) "4"
 7) "v3"
 8) "6"
 9) "v4"
10) "8"
11) "v7"
12) "14"
13) "v5"
14) "20"
15) "v6"
16) "24"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> zrange zset1 0 -1 withscores
1) "v5"
2) "5"
3) "v6"
4) "6"
5) "v7"
6) "7"
127.0.0.1:6379> zscan zset1 0 match v*
1) "0"
2) 1) "v5"
   2) "5"
   3) "v6"
   4) "6"
   5) "v7"
   6) "7"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> append k1 _1
(integer) 4
127.0.0.1:6379> get k1
"v1_1"
127.0.0.1:6379> append k1 _1
(integer) 6
127.0.0.1:6379> get k1
"v1_1_1"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> bitcount k1 0 -1
(integer) 26
127.0.0.1:6379> get k1
"v1_1_1"
127.0.0.1:6379> append k1 1
(integer) 7
127.0.0.1:6379> bitcount k1
(integer) 29
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> setbit peter 1 1
(integer) 0
127.0.0.1:6379> setbit peter 2 1
(integer) 0
127.0.0.1:6379> setbit peter 3 0
(integer) 0
127.0.0.1:6379> setbit peter 4 0
(integer) 0
127.0.0.1:6379> setbit peter 5 1
(integer) 0
127.0.0.1:6379> bitcount peter
(integer) 3
127.0.0.1:6379> setbit peter 6 1
(integer) 0
127.0.0.1:6379> bitcount peter
(integer) 4
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hmset user:1001 name alice age 20 sex woman
OK
127.0.0.1:6379> hgetall user1001
(empty list or set)
127.0.0.1:6379> hgetaall user:1001
(error) ERR unknown command 'hgetaall'
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
5) "sex"
6) "woman"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hexists user:1001 name
(integer) 1
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
5) "sex"
6) "woman"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
5) "sex"
6) "woman"
127.0.0.1:6379> hdel user:1001 sex
(integer) 1
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
127.0.0.1:6379> hincrby user:1001 age -1
(integer) 19
127.0.0.1:6379> hincrby user:1001 name 1
(error) ERR hash value is not an integer
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "19"
127.0.0.1:6379> hincrbyfloat user:1001 age 1.00
"20"
127.0.0.1:6379> hincrby key age 0.1
(error) ERR value is not an integer or out of range
127.0.0.1:6379> hincrbyfloat user:1001 age 1
"21"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hkeys user:1001
1) "name"
2) "age"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hlen user:1001
(integer) 2
127.0.0.1:6379> hlen ksahdk
(integer) 0
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hmget user:1001 name age
1) "alice"
2) "275"
127.0.0.1:6379> hset user:1001 age 20
(integer) 0
127.0.0.1:6379> hget user:1001 aage
(nil)
127.0.0.1:6379> hget user:1001 age
"20"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
127.0.0.1:6379> hsetnx user:1001 sex woman
(integer) 1
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
5) "sex"
6) "woman"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hgetall user:1001
1) "name"
2) "alice"
3) "age"
4) "20"
5) "sex"
6) "woman"
127.0.0.1:6379> hstrlen user:1001 name
(integer) 5
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hvals user:1001
1) "alice"
2) "20"
3) "woman"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> hscan user:1001 0
1) "0"
2) 1) "name"
   2) "alice"
   3) "age"
   4) "20"
   5) "sex"
   6) "woman"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> multi
OK
127.0.0.1:6379> zadd zset1 1 v1 2 v2
QUEUED
127.0.0.1:6379> lpush list1 v1 v2
QUEUED
127.0.0.1:6379> set k1 v1
QUEUED
127.0.0.1:6379> incrby k1 1
QUEUED
127.0.0.1:6379> exxec
(error) ERR unknown command 'exxec'
127.0.0.1:6379> lrange list1 0 -1
QUEUED
127.0.0.1:6379> exec
(error) EXECABORT Transaction discarded because of previous errors.
127.0.0.1:6379> lrange list1 0 -1
(empty list or set)
127.0.0.1:6379>
127.0.0.1:6379> multi
OK
127.0.0.1:6379> lpush lsit1 v1 v2
QUEUED
127.0.0.1:6379> set k1 v1
QUEUED
127.0.0.1:6379> incrby k1 1
QUEUED
127.0.0.1:6379> exec
1) (integer) 2
2) OK
3) (error) ERR value is not an integer or out of range
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> lrange lsit1 0 -1
1) "v2"
2) "v1"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> multi
OK
127.0.0.1:6379> lpush list1 v1 v2
QUEUED
127.0.0.1:6379> set k1 v1
QUEUED
127.0.0.1:6379> incrby k1 1
QUEUED
127.0.0.1:6379> lpush list1 v3
QUEUED
127.0.0.1:6379> exec
1) (integer) 2
2) OK
3) (error) ERR value is not an integer or out of range
4) (integer) 3
127.0.0.1:6379> lrange list1 0 -1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> multi
OK
127.0.0.1:6379>
127.0.0.1:6379> set k3 v3
QUEUED
127.0.0.1:6379> discard
OK
127.0.0.1:6379> get k3
(nil)
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> set money 1000
OK
127.0.0.1:6379> set out 0
OK
127.0.0.1:6379> watch money
OK
127.0.0.1:6379> multi
OK
127.0.0.1:6379> decrby money 20
QUEUED
127.0.0.1:6379> incrby out 20
QUEUED
127.0.0.1:6379> exec
1) (integer) 980
2) (integer) 20
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>另外一个redis连接修改了money的值
127.0.0.1:6379> watch money
OK
127.0.0.1:6379> multi
OK
127.0.0.1:6379> decrby money 30
QUEUED
127.0.0.1:6379> incrby out 30
QUEUED
127.0.0.1:6379> exec
(nil)
127.0.0.1:6379> unwatch
OK
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> subscribe channel1 chennel2
Reading messages... (press Ctrl-C to quit)
1) "subscribe"
2) "channel1"
3) (integer) 1
1) "subscribe"
2) "chennel2"

127.0.0.1:6380> publish channel1 hello!
(integer) 1
127.0.0.1:6380>
3) (integer) 2

127.0.0.1:6379> 
Reading messages... (press Ctrl-C to quit)
1) "subscribe"
2) "channel1"
3) (integer) 1
1) "subscribe"
2) "chennel2"
3) (integer) 2
1) "message"
2) "channel1"
3) "hello!"
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> info replication
# Replication
role:master
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0

127.0.0.1:6380> info replication
# Replication
role:master
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0
127.0.0.1:6380> slaveof 127.0.0.1 6379
OK
127.0.0.1:6380> infp replication
(error) ERR unknown command 'infp'
127.0.0.1:6380> info replication
# Replication
role:slave
master_host:127.0.0.1
master_port:6379
master_link_status:down
master_last_io_seconds_ago:-1
master_sync_in_progress:0
slave_repl_offset:1
master_link_down_since_seconds:jd
slave_priority:100
slave_read_only:1
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0
127.0.0.1:6380>

127.0.0.1:6381> info replication
# Replication
role:master
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0
127.0.0.1:6381> slaveof localhost 6380
OK
127.0.0.1:6381> info replciation
127.0.0.1:6381> info replication
# Replication
role:slave
master_host:localhost
master_port:6380
master_link_status:down
master_last_io_seconds_ago:-1
master_sync_in_progress:0
slave_repl_offset:1
master_link_down_since_seconds:jd
slave_priority:100
slave_read_only:1
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0

127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> info repliction
127.0.0.1:6379> info replication
# Replication
role:master
connected_slaves:1
slave0:ip=127.0.0.1,port=6380,state=online,offset=603,lag=1
master_repl_offset:603
repl_backlog_active:1
repl_backlog_size:1048576
repl_backlog_first_byte_offset:2
repl_backlog_histlen:602
127.0.0.1:6379>

127.0.0.1:6380>
127.0.0.1:6380>
127.0.0.1:6380> info replication
# Replication
role:slave
master_host:127.0.0.1
master_port:6379
master_link_status:up
master_last_io_seconds_ago:1
master_sync_in_progress:0
slave_repl_offset:631
slave_priority:100
slave_read_only:1
connected_slaves:1
slave0:ip=127.0.0.1,port=6381,state=online,offset=85,lag=0
master_repl_offset:99
repl_backlog_active:1
repl_backlog_size:1048576
repl_backlog_first_byte_offset:2
repl_backlog_histle

127.0.0.1:6381>
127.0.0.1:6381>
127.0.0.1:6381> info replication
# Replication
role:slave
master_host:127.0.0.1
master_port:6380
master_link_status:up
master_last_io_seconds_ago:3
master_sync_in_progress:0
slave_repl_offset:127
slave_priority:100
slave_read_only:1
connected_slaves:0
master_repl_offset:0
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0
127.0.0.1:6381>

127.0.0.1:6379> set k11 11
OK
127.0.0.1:6379> get k11
"11"

127.0.0.1:6380> get k11
"11"
127.0.0.1:6380>

127.0.0.1:6381> get k11
"11"
127.0.0.1:6381>

127.0.0.1:6380> set k11 111
(error) READONLY You can't write against a read only slave.

127.0.0.1:6379> shutdown
not connected>
not connected> ^C
I:\develop\env\Redis-x64-3.2.100>redis-cli
Could not connect to Redis at 127.0.0.1:6379: 由于目标计算机积极拒绝，无法连接。
Could not connect to Redis at 127.0.0.1:6379: 由于目标计算机积极拒绝，无法连接。
not connected>

127.0.0.1:6380> get k11
"11"

127.0.0.1:6381> get k11
"11"

127.0.0.1:6380> set k12 12
(error) READONLY You can't write against a read only slave.

I:\develop\env\Redis-x64-3.2.100>redis-cli
127.0.0.1:6379> get k11
"11"

127.0.0.1:6379> set k12 12
OK

127.0.0.1:6380> get k12
"12"





