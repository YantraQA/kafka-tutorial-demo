# kafka-tutorial-demo

* Useful links: https://github.com/bitnami/bitnami-docker-kafka#how-to-use-this-image
* Set Up doc: [click here](02%20Workshop%20on%20Kakfa%20-%20CLI%20Tools,%20Simple%20Producer%20&%20Consumer%20using%20Java.pdf)


* https://engineering.bitnami.com/articles/create-a-pub-sub-messaging-cluster-with-bitnami-s-kafka-and-zookeeper-containers.html

* Open Kafka:
```kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 3 --partitions 3 --topic mytopic```

* Consumer:
  ```kafka-console-consumer.sh --bootstrap-server zookeeper:2181 --topic mytopic --from-beginning```
  
* Error: zookeeper is not a recognized option
  * https://stackoverflow.com/questions/53428903/zookeeper-is-not-a-recognized-option-when-executing-kafka-console-consumer-sh
    