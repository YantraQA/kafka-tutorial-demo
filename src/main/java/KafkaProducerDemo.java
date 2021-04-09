import java.util.Properties;



public class KafkaProducerDemo {

    public static final String BOOTSTRAPSERVERS = "127.0.0.1:9092";
    public static final String TOPIC = "first_topic";
    public static final String KSERIALIZER="org.apache.kafka.common.serialization.StringSerializer";
    public static final String KDSERIALIZER="org.apache.kafka.common.serialization.StringDeserializer";

    public static void main(String[] args){
        Properties producerProps = new Properties();
        producerProps.put("bootstrap.servers", BOOTSTRAPSERVERS);
        producerProps.put("key.serializer", KSERIALIZER);
        producerProps.put("value.serializer", KSERIALIZER);
        producerProps.put("acks", "all");
        producerProps.put("retries", 1);
        producerProps.put("batch.size", 20000);
        producerProps.put("linger.ms", 1);
        producerProps.put("buffer.memory", 24568545);
        //Producer<String, String> kafkaProducer;

        //KafkaProducer<String, String> producer = new KafkaProducer<String, String>(producerProps);
//
//        for (int i = 0; i < 2000; i++) {
//            ProducerRecord data = new ProducerRecord<String, String>("test1", "Hello this is record " + i);
//            Future<RecordMetadata> recordMetadata = producer.send(data);
//        }
//        producer.close();

    }
}
