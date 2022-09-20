package com.java.protobuf;

import org.apache.commons.codec.binary.Hex;
import com.java.protobuf.*;

public class ProtobufEx {
    public static void main(String[] args) {
        proto.Person person = proto.Person.newBuilder()
                .setUserName("Martin")
                .setFavoriteNumber(1337)
                .addInterests("daydreaming")
                .addInterests("hacking")
                .build();

        byte[] res = person.toByteArray();

        System.out.println(res.length);
        System.out.print(Hex.encodeHex(res));
    }
}
