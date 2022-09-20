package com.java.avro;

import com.java.avro.schema.Person;
import org.apache.avro.Schema;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.commons.codec.binary.Hex;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class AvroEx {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().directBinaryEncoder(outputStream, null);

        Person person = Person.newBuilder()
                .setUserName("Martin")
                .setFavoriteNumber(1337L)
                .setInterests(Arrays.asList("daydreaming", "hacking"))
                .build();

        DatumWriter<Person> personDatumWriter = new SpecificDatumWriter<>(new Schema.Parser().parse(new File("self-test-and-verify/src/com/java/avro/person.avsc")));
        personDatumWriter.write(person, encoder);

        byte[] res = outputStream.toByteArray();

        System.out.println(res.length);
        System.out.print(Hex.encodeHex(res));
    }
}
