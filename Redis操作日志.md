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